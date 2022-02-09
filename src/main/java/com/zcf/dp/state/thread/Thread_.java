package com.zcf.dp.state.thread;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-19:30
 * @Description: com.zcf.dp.state.thread
 * @version: 1.0
 */
public class Thread_ {
    ThreadState_ state;
    public void move(Action input){
        state.move(input);
    }
    public void run(){
        state.run();
    }
}
