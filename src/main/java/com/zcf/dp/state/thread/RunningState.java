package com.zcf.dp.state.thread;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-19:36
 * @Description: com.zcf.dp.state.thread
 * @version: 1.0
 */
public class RunningState extends ThreadState_{
    private Thread_ t;

    public RunningState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {

    }

    @Override
    void run() {

    }
}
