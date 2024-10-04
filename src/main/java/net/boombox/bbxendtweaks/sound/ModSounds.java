package net.boombox.bbxendtweaks.sound;

import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static SoundEvent NOVAS_DREAM = registerSoundEvent("novas_dream");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(BoomboxsEndTweaks.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        BoomboxsEndTweaks.LOGGER.info("Registering sounds for: " + BoomboxsEndTweaks.MOD_ID);
    }

}
