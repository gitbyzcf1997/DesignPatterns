package com.zcf.dp.spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-07-17:51
 * @Description: com.zcf.dp.spring
 * @version: 1.0
 */
@Aspect
public class TimeProxy {
    @Before("execution(void com.zcf.dp.spring.v2.Tank.move())")
    public void before(){
        System.out.println("method start.."+System.currentTimeMillis());
    }
    @After("execution(void com.zcf.dp.spring.v2.Tank.move())")
    public void after(){
        System.out.println("method stop.."+System.currentTimeMillis());
    }
}
