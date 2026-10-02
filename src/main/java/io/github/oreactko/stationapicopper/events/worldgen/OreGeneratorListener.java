package io.github.oreactko.stationapicopper.events.worldgen;

import io.github.oreactko.stationapicopper.events.block.BlockListener;
import net.minecraft.world.gen.feature.OreFeature;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.event.world.gen.WorldGenEvent.ChunkDecoration;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;

public class OreGeneratorListener {
    @Entrypoint.Namespace
    public static Namespace NAMESPACE = Namespace.resolve();

    @EventListener
    public void registerOreGen(ChunkDecoration event) {
        for (int i = 0; i < 10; i++) {

            int x = event.x + event.random.nextInt(16);
            int y = 20 + event.random.nextInt(41);
            int z = event.z + event.random.nextInt(16);

            (new OreFeature(BlockListener.COPPER_ORE.id, 8)).generate(
                    event.world,
                    event.random,
                    x,
                    y,
                    z);
        }
    }
}
