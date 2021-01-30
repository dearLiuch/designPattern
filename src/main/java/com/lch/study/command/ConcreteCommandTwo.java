package com.lch.study.command;

/**
 * 具体命令实现
 */
public class ConcreteCommandTwo implements Command {

    private Receiver receiver;

    public ConcreteCommandTwo(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionTwo();
    }
}
