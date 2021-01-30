package com.lch.study.command;

/**
 * 具体命令实现
 */
public class ConcreteCommandOne implements Command {

    private Receiver receiver;

    public ConcreteCommandOne(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionOne();
    }
}
