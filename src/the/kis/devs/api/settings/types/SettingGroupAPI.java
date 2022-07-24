package the.kis.devs.api.settings.types;

import com.kisman.cc.settings.types.SettingGroup;
import the.kis.devs.api.settings.SettingAPI;

/**
 * @author _kisman_
 * @since 17:32 of 08.06.2022
 */
public class SettingGroupAPI extends SettingGroup {
    public SettingGroupAPI(SettingAPI setting) {super(setting);}
    public SettingAPI add(SettingAPI setting) {return (SettingAPI) super.add(setting);}
    public SettingGroupAPI add(SettingGroup group) {return (SettingGroupAPI) super.add(group);}
}
