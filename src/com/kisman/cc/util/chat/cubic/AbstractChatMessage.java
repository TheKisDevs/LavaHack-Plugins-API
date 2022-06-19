package com.kisman.cc.util.chat.cubic;

import net.minecraft.util.text.ITextComponent;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 21:06 of 15.06.2022
 */
public abstract class AbstractChatMessage {
    public final void printMessage(ITextComponent textComponent){}
    public final void printMessage(String textComponentMessage){}
    public abstract void printClientMessage(ITextComponent textComponent);
    public abstract void printClientMessage(String message);
    public abstract void printClientModuleMessage(ITextComponent textComponent);
    public abstract void printClientModuleMessage(String message);
    public abstract void printModuleMessage(ITextComponent textComponent);
    public abstract void printModuleMessage(String message);
    public abstract void printClassMessage(ITextComponent textComponent);
    public abstract void printClassMessage(String message);
    public abstract void printClientClassMessage(ITextComponent textComponent);
    public abstract void printClientClassMessage(String message);
}
