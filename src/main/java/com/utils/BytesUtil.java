package com.utils;

public class BytesUtil {
    public static String bytesToHexString(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        if(bytes.length >0){
            for(int i=0;i<bytes.length;i++){
                int v= bytes[i] & 0xFF;
                String hv=Integer.toHexString(v);
                if(hv.length()<2){
                    stringBuffer.append(0);
                }
                stringBuffer.append(hv);
            }
        }
        return stringBuffer.toString();
    }
}
