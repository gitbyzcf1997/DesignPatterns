package com.zcf.dp.ASM;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-08-18:31
 * @Description: com.zcf.dp.ASM
 * @version: 1.0
 */
public class MyClassLoader extends ClassLoader{
    public Class defineClass(String name,byte[]b){
        return defineClass(name,b,0,b.length);
    }
}
