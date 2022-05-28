<%@ page import="sun.misc.BASE64Decoder" %>
<%@ page import="java.io.ByteArrayInputStream" %>
<%@ page import="java.io.ObjectInputStream" %><%
    String xml = request.getParameter("xml");
    if(xml != null){
        byte[] bytes = new BASE64Decoder().decodeBuffer(xml);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        objectInputStream.readObject();
    }
%>