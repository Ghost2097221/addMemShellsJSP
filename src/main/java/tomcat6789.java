import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;

class Tomcat6789 {
    String uri;
    String serverName;
    StandardContext standardContext;
    public Object getField(Object object, String fieldName) {
        Field declaredField;
        Class clazz = object.getClass();
        while (clazz != Object.class) {
            try {

                declaredField = clazz.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                return declaredField.get(object);
            } catch (NoSuchFieldException e){}
            catch (IllegalAccessException e){}
            clazz = clazz.getSuperclass();
        }
        return null;
    }

    public Tomcat6789() {
        Thread[] threads = (Thread[]) this.getField(Thread.currentThread().getThreadGroup(), "threads");
        Object object;
        for (Thread thread : threads) {

            if (thread == null) {
                continue;
            }
            if (thread.getName().contains("exec")) {
                continue;
            }
            Object target = this.getField(thread, "target");
            if (!(target instanceof Runnable)) {
                continue;
            }

            try {
                object = getField(getField(getField(target, "this$0"), "handler"), "global");
            } catch (Exception e) {
                continue;
            }
            if (object == null) {
                continue;
            }
            java.util.ArrayList processors = (java.util.ArrayList) getField(object, "processors");
            Iterator iterator = processors.iterator();
            while (iterator.hasNext()) {
                Object next = iterator.next();

                Object req = getField(next, "req");
                Object serverPort = getField(req, "serverPort");
                if (serverPort.equals(-1)){continue;}
                org.apache.tomcat.util.buf.MessageBytes serverNameMB = (org.apache.tomcat.util.buf.MessageBytes) getField(req, "serverNameMB");
                this.serverName = (String) getField(serverNameMB, "strValue");
                if (this.serverName == null){
                    this.serverName = serverNameMB.toString();
                }
                if (this.serverName == null){
                    this.serverName = serverNameMB.getString();
                }

                org.apache.tomcat.util.buf.MessageBytes uriMB = (org.apache.tomcat.util.buf.MessageBytes) getField(req, "uriMB");
                this.uri = (String) getField(uriMB, "strValue");
                if (this.uri == null){
                    this.uri = uriMB.toString();
                }
                if (this.uri == null){
                    this.uri = uriMB.getString();
                }

                this.getStandardContext();
                return;
            }
        }
    }

    public void getStandardContext() {
        Thread[] threads = (Thread[]) this.getField(Thread.currentThread().getThreadGroup(), "threads");
        for (Thread thread : threads) {
            if (thread == null) {
                continue;
            }
            if ((thread.getName().contains("Acceptor")) && (thread.getName().contains("http"))) {
                Object target = this.getField(thread, "target");
                HashMap children;
                Object jioEndPoint = null;
                try {
                    jioEndPoint = getField(target, "this$0");
                }catch (Exception e){}
                if (jioEndPoint == null){
                    try{
                        jioEndPoint = getField(target, "endpoint");
                    }catch (Exception e){ return; }
                }
                Object service = getField(getField(getField(getField(getField(jioEndPoint, "handler"), "proto"), "adapter"), "connector"), "service");
                StandardEngine engine = null;
                try {
                    engine = (StandardEngine) getField(service, "container");
                }catch (Exception e){}
                if (engine == null){
                    engine = (StandardEngine) getField(service, "engine");
                }

                children = (HashMap) getField(engine, "children");
                StandardHost standardHost = (StandardHost) children.get(this.serverName);

                children = (HashMap) getField(standardHost, "children");
                Iterator iterator = children.keySet().iterator();
                while (iterator.hasNext()){
                    String contextKey = (String) iterator.next();
                    if (!(this.uri.startsWith(contextKey))){continue;}
                    StandardContext standardContext = (StandardContext) children.get(contextKey);
                    this.standardContext = standardContext;
                    return;
                }
            }
        }
    }

    public StandardContext getSTC(){
        return this.standardContext;
    }
}