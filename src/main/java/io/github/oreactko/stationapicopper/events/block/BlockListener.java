package io.github.oreactko.stationapicopper.events.block;

import io.github.oreactko.stationapicopper.block.CopperOre;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Namespace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockListener {
    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    // A static object holding our bock
    public static Block COPPER_BLOCK;

    public static Block COPPER_ORE;

    public static Block RAW_COPPER_BLOCK;

    // An event listener listening to the BlockRegistryEvent
    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        COPPER_BLOCK = new TemplateBlock(NAMESPACE.id("copper_block"), Material.METAL).setTranslationKey(NAMESPACE,
                "copper_block").setHardness(2.0F);
        COPPER_ORE = new CopperOre(NAMESPACE.id("copper_ore")).setTranslationKey(NAMESPACE,
                "copper_ore");
        RAW_COPPER_BLOCK = new TemplateBlock(NAMESPACE.id("raw_copper_block"), Material.METAL).setTranslationKey(
                NAMESPACE,
                "raw_copper_block").setHardness(2.0F);

    }
}
