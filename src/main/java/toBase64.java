import javassist.*;
import source.Valveimpl;
import sun.misc.BASE64Encoder;


public class toBase64 {
    public static void main(String[] args) throws Exception{
        ClassPool aDefault = ClassPool.getDefault();
        CtClass ctClass = aDefault.get(Valveimpl.class.getName());
        //CtClass ctClass = aDefault.get(source.addValve.class.getName());
        //CtClass ctClass = aDefault.get(shiroInject.class.getName());
        byte[] bytes = ctClass.toBytecode();
        String encode = new BASE64Encoder().encode(bytes);
        System.out.println(encode);
        String bcel = com.sun.org.apache.bcel.internal.classfile.Utility.encode(bytes, true);
        System.out.println(bcel);
        //密码：qax36oNb
    }
}
