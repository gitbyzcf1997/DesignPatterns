package com.zcf.dp.command;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-0:32
 * @Description: com.zcf.dp.command
 * @version: 1.0
 */
public class InsertCommand extends Command {
    Content c;
    String strToInsert=" htt://www.baidu.com ";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg=c.msg+strToInsert;
    }

    @Override
    public void undo() {
        c.msg=c.msg.substring(0,c.msg.length()-strToInsert.length());
    }
}
