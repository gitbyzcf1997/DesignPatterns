package com.zcf.dp.command;

import org.aspectj.bridge.ICommand;

import java.util.ArrayList;

/**
 * @Auther:ZhenCF
 * @Date: 2022-02-09-0:39
 * @Description: com.zcf.dp.command
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content();
        Command insertCommand=new InsertCommand(content);
        insertCommand.doit();
        insertCommand.undo();
        Command copyCommend=new CopyCommend(content);
        copyCommend.doit();
        copyCommend.undo();
        Command deleteCommand=new DeleteCommand(content);
        deleteCommand.doit();
        deleteCommand.undo();
        //System.out.println(content.msg);
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(new InsertCommand(content));
        commands.add(new CopyCommend(content));
        commands.add(new DeleteCommand(content));
        for(Command command:commands){
            command.doit();
        }
        System.out.println(content.msg);
        for(int i=commands.size()-1;i>=0;i--){
            commands.get(i).undo();
        }
        System.out.println(content.msg);
    }
}
