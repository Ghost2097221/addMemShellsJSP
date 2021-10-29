import javassist.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class toBase64 {
    public static void main(String[] args) throws Exception{
        ClassPool aDefault = ClassPool.getDefault();
        //CtClass ctClass = aDefault.get(Valveimpl.class.getName());
        //CtClass ctClass = aDefault.get(addValve.class.getName());
        CtClass ctClass = aDefault.get(addMemShells.class.getName());
        byte[] bytes = ctClass.toBytecode();
        byte[] encode = Base64.getEncoder().encode(bytes);
        System.out.println(new String(encode));
        System.out.println((new String(Base64.getEncoder().encode("addMemShells".getBytes(StandardCharsets.UTF_8)))));
    }
}
