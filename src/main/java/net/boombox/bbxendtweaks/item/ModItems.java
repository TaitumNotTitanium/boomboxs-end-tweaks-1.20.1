package net.boombox.bbxendtweaks.item;

import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.boombox.bbxendtweaks.item.custom.LinkingToolItem;
import net.boombox.bbxendtweaks.item.custom.ModFoodComponents;
import net.boombox.bbxendtweaks.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDZITE_SHARD = registerItem("endzite_shard", new Item(new FabricItemSettings()));
    public static final Item REFINED_ENDZITE_SHARD = registerItem("refined_endzite_shard", new Item(new FabricItemSettings()));
    public static final Item LINKING_TOOL = registerItem("linking_tool", new LinkingToolItem(new FabricItemSettings().maxCount(1)));
    public static final Item END_GLOW_BERRIES = registerItem("end_glow_berries", new Item(new FabricItemSettings().food(ModFoodComponents.END_GLOW_BERRIES)));

    public static final Item MUSIC_DISC_NOVAS_DREAM = registerItem("music_disc_novas_dream", new MusicDiscItem(1, ModSounds.NOVAS_DREAM, new FabricItemSettings().maxCount(1), 215));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDZITE_SHARD);
        entries.add(REFINED_ENDZITE_SHARD);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoomboxsEndTweaks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BoomboxsEndTweaks.LOGGER.info("Registering Mod Items for " + BoomboxsEndTweaks.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
