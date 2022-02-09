package com.zcf.dp.state.thread;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-19:30
 * @Description: com.zcf.dp.state.thread
 * @version: 1.0
 */
public abstract class ThreadState_ {
    abstract void move(Action input);
    abstract void run();
}
