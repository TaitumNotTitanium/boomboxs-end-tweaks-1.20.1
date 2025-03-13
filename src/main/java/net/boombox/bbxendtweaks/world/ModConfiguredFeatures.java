package net.boombox.bbxendtweaks.world;

import net.boombox.bbxendtweaks.Block.ModBlocks;
import net.boombox.bbxendtweaks.BoomboxsEndTweaks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> EUROPIUM_ORE_KEY = registerKey("europium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEANIUM_ORE_KEY = registerKey("beanium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldEuropoiumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.EUROPIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_EUROPIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldBeaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.BEANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_BEANIUM_ORE.getDefaultState()));

        register(context, EUROPIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldEuropoiumOres, 20));
        register(context, BEANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBeaniumOres, 20));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BoomboxsEndTweaks.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
