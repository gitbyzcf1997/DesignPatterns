package com.zcf.dp.Proxy.v02;

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
        long start=System.currentTimeMillis();
        System.out.println("Tank moving claclacla....");
        try{
            Thread.sleep(new Random().nextInt(10000));
        }catch(Exception e){
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}
