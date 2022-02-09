package com.zcf.dp.state.v2;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-19:02
 * @Description: com.zcf.dp.state.v2
 * @version: 1.0
 */
public class MMNervousState extends MMState {
    @Override
    void smile() {
        System.out.println("nervous smile");
    }

    @Override
    void cry() {
        System.out.println("nervous cry");
    }

    @Override
    void say() {
        System.out.println("nervous say");
    }
}
