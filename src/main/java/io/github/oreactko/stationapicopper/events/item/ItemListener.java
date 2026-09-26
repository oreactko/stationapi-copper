package io.github.oreactko.stationapicopper.events.item;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Namespace;
import net.minecraft.item.Item;

public class ItemListener {
    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    public static Item COPPER_INGOT;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        COPPER_INGOT = new TemplateItem(
                NAMESPACE.id("copper_ingot")).setTranslationKey(
                        NAMESPACE,
                        "copper_ingot");
    }
}