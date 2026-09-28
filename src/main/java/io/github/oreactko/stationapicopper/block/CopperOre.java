package io.github.oreactko.stationapicopper.block;

import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;
import io.github.oreactko.stationapicopper.events.item.ItemListener;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class CopperOre extends TemplateBlock {
    public CopperOre(Identifier identifier) {
        super(identifier, Material.STONE);
        this.setHardness(1.0F);
    }

    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return ItemListener.COPPER_INGOT.id; // So werid.
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 1;
    }
}
