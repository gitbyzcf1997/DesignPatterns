package com.zcf.dp.state.v2;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-19:00
 * @Description: com.zcf.dp.state.v2
 * @version: 1.0
 */
public class MMHappyState extends MMState {
    @Override
    void smile() {
        System.out.println("happy smile");
}

    @Override
    void cry() {
        System.out.println("happy cry");
    }

    @Override
    void say() {
        System.out.println("happy say");
    }
}
