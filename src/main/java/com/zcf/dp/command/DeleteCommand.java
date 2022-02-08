package com.zcf.dp.command;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-0:34
 * @Description: com.zcf.dp.command
 * @version: 1.0
 */
public class DeleteCommand extends Command {
    Content c;
    String deleted;

    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        deleted=c.msg.substring(0,5);
        c.msg=c.msg.substring(5,c.msg.length());
    }

    @Override
    public void undo() {
        c.msg=deleted+c.msg;
    }
}
