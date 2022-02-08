package com.zcf.dp.command;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-0:29
 * @Description: com.zcf.dp.command
 * @version: 1.0
 */
public abstract class Command {
    public abstract void doit();//exec  run
    public abstract void undo();
}
