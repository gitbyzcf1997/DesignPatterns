package com.zcf.dp.state.v2;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-19:03
 * @Description: com.zcf.dp.state.v2
 * @version: 1.0
 */
public class MMSadSate extends MMState {
    @Override
    void smile() {
        System.out.println("sad smile");
    }

    @Override
    void cry() {
        System.out.println("sad cry");
    }

    @Override
    void say() {
        System.out.println("sad say");
    }
}
