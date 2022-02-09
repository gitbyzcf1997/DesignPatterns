package com.zcf.dp.state.v2;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-18:57
 * @Description: com.zcf.dp.state.v2
 * @version: 1.0
 */
public class MM {
    String name;
    MMState state;
    public void smile(){
        state.smile();
    }
    public void cry(){
        state.cry();
    }
    public void say(){
        state.say();
    }
}
