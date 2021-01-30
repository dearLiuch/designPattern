package com.lch.study.command;

/**
 * 调用者
 */
public class Invoker {

    // 这里用的是Command抽象封装的命令，而不是具体command类型
    private Command commandOne;
    private Command commandTwo;

    public Invoker(Command commandOne, Command commandTwo){
        this.commandOne = commandOne;
        this.commandTwo = commandTwo;
    }

    public void actionOne(){
        commandOne.execute();
    }

    public void actionTwo(){
        commandTwo.execute();
    }
}
