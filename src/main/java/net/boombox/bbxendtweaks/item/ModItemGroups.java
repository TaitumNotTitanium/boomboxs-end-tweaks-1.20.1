package net.boombox.bbxendtweaks.item;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup END_TWEAKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BoomboxsEndTweaks.MOD_ID, "endtweaks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endtweaks"))
                    .icon( () -> new ItemStack(ModItems.ENDZITE_SHARD)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ENDZITE_SHARD);
                        entries.add(ModItems.REFINED_ENDZITE_SHARD);
                        entries.add(ModBlocks.ENDZITE_BLOCK);
                        entries.add(ModBlocks.REFINED_ENDZITE_BLOCK);
                        entries.add(ModBlocks.BUDDING_ENDZITE);

                    }).build());

    public static void registerItemGroups() {
        BoomboxsEndTweaks.LOGGER.info("Registering item groups for " + BoomboxsEndTweaks.MOD_ID);
    }
}
