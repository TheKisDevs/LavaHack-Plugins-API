package the.kis.devs.api.features.plugins;

import com.kisman.cc.features.plugins.Plugin;

/**
 * @author _kisman_
 * @since 17:28 of 08.06.2022
 */
public interface PluginAPI extends Plugin {
    void load();
    void unload();
}
