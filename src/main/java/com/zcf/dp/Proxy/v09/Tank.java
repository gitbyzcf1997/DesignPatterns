package com.zcf.dp.Proxy.v09;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-07-14:53
 * @Description: com.zcf.dp.Proxy
 * @version: 1.0
 */

/**
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承? 但是如果要测试多个类呢？ 代码耦合度太高
 * 使用代理!
 * 代理有各种类型
 * 问题：如何实现代理的各种组合？继承？Decorator?
 * 代理的对象改成Movable类型 越来越像decorator了
 * 如果有stop方法需要代理。。
 * 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型 Object
 * （毕竟日志记录，时间计算是很多方法都需要的东西），这时候怎么做呢？
 * 分类代理行为与被代理对象
 * 使用jdk的动态代理
 *  *
 *  * 横切代码与业务逻辑代码分离 AOP
 *  通过反射观察生成代理对象
 *  jdk反射生成代理必须面向接口，这是由Proxy的内部实现决定的
 */
interface Movable{
    void move();
}

public class Tank implements Movable {
    /**
     * 模拟坦克移动一段时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla....");
        try{
            Thread.sleep(new Random().nextInt(10000));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Tank tank = new Tank();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        //reflection 通过二进制字节码分析的属性和方法

        Movable m=(Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHandler(tank));
        m.move();
    }
}

class LogHandler implements InvocationHandler{
    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method "+method.getName()+" start...");
        Object o = method.invoke(tank, args);
        System.out.println("method "+method.getName()+" end...");
        return o;
    }
}

