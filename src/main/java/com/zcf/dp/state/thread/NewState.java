package com.zcf.dp.state.thread;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-19:32
 * @Description: com.zcf.dp.state.thread
 * @version: 1.0
 */
public class NewState extends ThreadState_{
    private Thread_ t;

    public NewState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if(input.msg=="start"){
            t.state=new RunningState(t);
        }
    }

    @Override
    void run() {

    }
}
