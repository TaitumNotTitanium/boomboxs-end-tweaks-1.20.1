package net.boombox.bbxendtweaks.item;

import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.boombox.bbxendtweaks.item.custom.LinkingToolItem;
import net.boombox.bbxendtweaks.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDZITE_SHARD = registerItem("endzite_shard", new Item(new FabricItemSettings()));
    public static final Item REFINED_ENDZITE_SHARD = registerItem("refined_endzite_shard", new Item(new FabricItemSettings()));
    public static final Item LINKING_TOOL = registerItem("linking_tool", new LinkingToolItem(new FabricItemSettings().maxCount(1)));
    public static final Item END_GLOW_BERRIES = registerItem("end_glow_berries", new Item(new FabricItemSettings().food(ModFoodComponents.END_GLOW_BERRIES)));
    public static final Item END_GLOW_BERRIES_FREY = registerItem("end_glow_berries_frey", new Item(new FabricItemSettings().food(ModFoodComponents.END_GLOW_BERRIES_FREY)));

    public static final Item MUSIC_DISC_NOVAS_DREAM = registerItem("music_disc_novas_dream", new MusicDiscItem(1, ModSounds.NOVAS_DREAM, new FabricItemSettings().maxCount(1), 215));

    public static final Item ENDZITE_SWORD = registerItem("endzite_sword", new SwordItem(ModToolMaterial.ENDZITE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDZITE_PICKAXE = registerItem("endzite_pickaxe", new PickaxeItem(ModToolMaterial.ENDZITE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDZITE_SHOVEL = registerItem("endzite_shovel", new ShovelItem(ModToolMaterial.ENDZITE, 1, -3f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDZITE_AXE = registerItem("endzite_axe", new AxeItem(ModToolMaterial.ENDZITE, 5, -3f, new FabricItemSettings().maxCount(1)));
    public static final Item ENDZITE_HOE = registerItem("endzite_hoe", new HoeItem(ModToolMaterial.ENDZITE, -4, 0f, new FabricItemSettings().maxCount(1)));

    public static final Item ENDZITE_HELMET = registerItem("endzite_helmet", new ArmorItem(ModArmorMaterial.ENDZITE, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));
    public static final Item ENDZITE_CHESTPLATE = registerItem("endzite_chestplate", new ArmorItem(ModArmorMaterial.ENDZITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item ENDZITE_LEGGINGS = registerItem("endzite_leggings", new ArmorItem(ModArmorMaterial.ENDZITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item ENDZITE_BOOTS = registerItem("endzite_boots", new ArmorItem(ModArmorMaterial.ENDZITE, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));




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
