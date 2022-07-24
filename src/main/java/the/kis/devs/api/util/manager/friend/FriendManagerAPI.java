package the.kis.devs.api.util.manager.friend;

import com.kisman.cc.util.manager.friend.FriendManager;
import net.minecraft.entity.player.EntityPlayer;

import java.util.ArrayList;

/**
 * @author _kisman_
 * @since 23:20 of 15.06.2022
 */
@SuppressWarnings("unused")
public class FriendManagerAPI {
    public static ArrayList<String> getFriends() {return FriendManager.instance.getFriends();}
    public static void addFriend(String name) {FriendManager.instance.addFriend(name);}
    public static void removeFriend(String name) {FriendManager.instance.removeFriend(name);}
    public static boolean isFriend(EntityPlayer player) {return FriendManager.instance.isFriend(player);}
    public static boolean isFriend(String name) {return FriendManager.instance.isFriend(name);}
    public static void setFriendsList(ArrayList<String> list) {FriendManager.instance.setFriendsList(list);}
}
