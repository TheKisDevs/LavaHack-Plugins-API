package com.kisman.cc.util.manager.friend;

import net.minecraft.entity.player.EntityPlayer;

import java.util.ArrayList;

/**
 * Shadow class
 *
 * @author _kisman_
 * @since 23:20 of 15.06.2022
 */
@SuppressWarnings("unused")
public class FriendManager {
    public static FriendManager instance;
    public ArrayList<String> getFriends() {return null;}
    public void addFriend(String name) {}
    public void removeFriend(String name) {}
    public boolean isFriend(EntityPlayer player) {return false;}
    public boolean isFriend(String name) {return false;}
    public void setFriendsList(ArrayList<String> list) {}
}
