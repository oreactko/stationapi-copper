package io.github.oreactko.stationapicopper.events.block;

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

    // An event listener listening to the BlockRegistryEvent
    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        COPPER_BLOCK = new TemplateBlock(NAMESPACE.id("copper_block"), Material.METAL).setTranslationKey(NAMESPACE,
                "copper_block");
    }
}
