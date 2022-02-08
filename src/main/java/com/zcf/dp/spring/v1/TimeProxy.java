package com.zcf.dp.spring.v1;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-07-17:51
 * @Description: com.zcf.dp.spring
 * @version: 1.0
 */
public class TimeProxy {
    public void before(){
        System.out.println("method start.."+System.currentTimeMillis());
    }
    public void after(){
        System.out.println("method stop.."+System.currentTimeMillis());
    }
}
