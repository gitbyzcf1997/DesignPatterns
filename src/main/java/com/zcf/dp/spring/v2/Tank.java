package com.zcf.dp.spring.v2;

import java.util.Random;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-07-17:45
 * @Description: com.zcf.dp.spring
 * @version: 1.0
 */
public class Tank {
    /**
     * 模拟坦克移动了一段时间
     */
    public void move() {
        System.out.println("Tank moving claclacla....");
        try{
            Thread.sleep(new Random().nextInt(10000));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
