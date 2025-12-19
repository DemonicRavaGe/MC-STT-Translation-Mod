package net.demoravage.mcsttmod;

import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.VoicechatPlugin;

public class VoiceChatHandler implements VoicechatPlugin {
    public static final String MOD_ID = "mc-stt-translation-mod";

    @Override
    public String getPluginId() {
        return MOD_ID;
    }

    @Override
    public void initialize(VoicechatApi api) {

    }
}
