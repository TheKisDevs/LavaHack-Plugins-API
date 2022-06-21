package com.kisman.cc.features.command;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 21:14 of 08.06.2022
 */
public abstract class Command {
    public Command(String command) {}
    public abstract void runCommand(String var1, String[] var2);
    public abstract String getDescription();
    public abstract String getSyntax();
}
