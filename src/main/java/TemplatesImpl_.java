package lagou.edu.memshell;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;

import javax.xml.transform.TransformerConfigurationException;
import java.io.*;
import java.lang.reflect.Field;
import java.util.Base64;

public class TemplatesImpl_ {
    public static void main(String[] args) throws TransformerConfigurationException, IOException {
        String str="yv66vgAAADQAIQoABgASCQATABQIABUKABYAFwcAG" +
            "AcAGQEACXRyYW5zZm9ybQEAcihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3h" +
            "zbHRjL0RPTTtbTGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZ" +
            "XJpYWxpemF0aW9uSGFuZGxlcjspVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBAApFeGNlcHRpb" +
            "25zBwAaAQCmKExjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NO0xjb" +
            "20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7TGNvbS9zdW" +
            "4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjsp" +
            "VgEABjxpbml0PgEAAygpVgEAClNvdXJjZUZpbGUBABdIZWxsb1RlbXBsYXRlc0ltcGwuamF2YQwADgAP" +
            "BwAbDAAcAB0BABNIZWxsbyBUZW1wbGF0ZXNJbXBsBwAeDAAfACABABJIZWxsb1RlbXBsYXRlc0ltcGwBAEBjb" +
            "20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvcnVudGltZS9BYnN0cmFjdFRyYW5zbGV0AQA" +
            "5Y29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL1RyYW5zbGV0RXhjZXB0aW9uAQAQamF2Y" +
            "S9sYW5nL1N5c3RlbQEAA291dAEAFUxqYXZhL2lvL1ByaW50U3RyZWFtOwEAE2phdmEvaW8vUHJpbnRTdHJlYW0" +
            "BAAdwcmludGxuAQAVKExqYXZhL2xhbmcvU3RyaW5nOylWACEABQAGAAAAAAADAAEABwAIAAIACQAAABkAAAADAAA" +
            "AAbEAAAABAAoAAAAGAAEAAAAIAAsAAAAEAAEADAABAAcADQACAAkAAAAZAAAABAAAAAGxAAAAAQAKAAAABgABAAAA" +
            "CgALAAAABAABAAwAAQAOAA8AAQAJAAAALQACAAEAAAANKrcAAbIAAhIDtgAEsQAAAAEACgAAAA4AAwAAAA0ABAAO" +
            "AAwADwABABAAAAACABE=";
        //System.out.println(str);
        byte[] code = Base64.getDecoder().decode(str);
        byteToFile(code);
        String s = fileToBase64();
        System.out.println(s);
        //System.out.println(new String(code));
        TemplatesImpl templates = new TemplatesImpl();
        TemplatesImpl_.setFieldValue(templates,"_name","HelloTemplatesImpl");
        TemplatesImpl_.setFieldValue(templates,"_bytecodes",new byte[][]{code});
        TemplatesImpl_.setFieldValue(templates,"_tfactory",new TransformerFactoryImpl());
        templates.newTransformer();
    }

    public static void setFieldValue(Object obj, String FieldName, Object setObj){
        try {
            Field field = obj.getClass().getDeclaredField(FieldName);
            field.setAccessible(true);
            field.set(obj,setObj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static byte[] fileToByte() throws IOException {  //文件转字节
        File file = new File("D:\\Java\\project\\study\\serialBug\\ysoserial\\src\\main\\java\\serialbug\\shell.class");
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int n;
        while ((n=inputStream.read(bytes))!=-1){
            byteArrayOutputStream.write(bytes,0,n);
        }
        inputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static void byteToFile(byte[] bytes) throws IOException{  //字节转文件
        if(bytes.length == 0){
            return;
        }
        File file = new File("D:\\Java\\project\\study\\serialBug\\ysoserial\\src\\main\\java\\serialbug\\shell.class");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();
        fileOutputStream.close();
    }

    public static String fileToBase64() throws IOException{  //文件转base64编码
        byte[] bytes = fileToByte();
        byte[] encode = Base64.getEncoder().encode(bytes);
        return new String(encode);
    }
}
