package com.zcf.dp.command;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-0:34
 * @Description: com.zcf.dp.command
 * @version: 1.0
 */
public class CopyCommend extends Command{
    Content content;

    public CopyCommend(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
         content.msg=content.msg+content.msg;
    }

    @Override
    public void undo() {
        content.msg= content.msg.substring(0, content.msg.length()/2);
    }
}
