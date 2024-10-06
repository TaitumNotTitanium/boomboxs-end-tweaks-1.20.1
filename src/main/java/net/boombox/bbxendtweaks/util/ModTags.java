package net.boombox.bbxendtweaks.util;

import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> END_GLOW_BERRIES_PLACEABLE_ON = createTag("end_glow_berries_placeable_on");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BoomboxsEndTweaks.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> ENRICHED_ENDZITE_LOG = createTag("enriched_endzite_log");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BoomboxsEndTweaks.MOD_ID, name));
        }
    }

}
