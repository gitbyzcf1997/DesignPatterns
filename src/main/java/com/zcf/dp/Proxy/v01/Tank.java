package com.zcf.dp.Proxy.v01;

import java.util.Random;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-07-14:53
 * @Description: com.zcf.dp.Proxy
 * @version: 1.0
 */

/**
 * 问题：我想记录坦克的移动时间
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
}
