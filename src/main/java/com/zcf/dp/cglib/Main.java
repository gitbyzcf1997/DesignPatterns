package com.zcf.dp.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-07-17:11
 * @Description: com.zcf.dp.cglib
 * @version: 1.0
 */

/**
 * 使用cglib进行动态代理
 * cglib实现动态代理不需要接口  底层也是ASM
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}
class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before");
        Object result=null;
        result=proxy.invokeSuper(obj,args);
        System.out.println("after");
        return result;
    }
}
class Tank{
    public void move(){
        System.out.println("Tank moving claclacla...");
        try{
            Thread.sleep(new Random().nextInt(10000));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
