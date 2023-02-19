package heliecp.roadchina.Block;

import heliecp.roadchina.Utils;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);

    public static final RegistryObject<Block> asphaltRoad = BLOCKS.register("asphalt_road", Road::new);

    public static final RegistryObject<Block> whiteLine1 = BLOCKS.register("white_line_1", () -> new Line());
    public static final RegistryObject<Block> whiteLine2 = BLOCKS.register("white_line_2", () -> new Line());
    public static final RegistryObject<Block> whiteLine3 = BLOCKS.register("white_line_3", () -> new Line());
    public static final RegistryObject<Block> whiteLine4 = BLOCKS.register("white_line_4", () -> new Line());
    public static final RegistryObject<Block> whiteLine5 = BLOCKS.register("white_line_5", () -> new Line());
    public static final RegistryObject<Block> whiteLine6 = BLOCKS.register("white_line_6", () -> new Line());
    public static final RegistryObject<Block> whiteLine7 = BLOCKS.register("white_line_7", () -> new Line());
    public static final RegistryObject<Block> whiteLine8 = BLOCKS.register("white_line_8", () -> new Line());

    public static final RegistryObject<Block> roadchina = BLOCKS.register("roadchina", () -> new Line());

    public static final RegistryObject<Block> asphaltRoadSlab = BLOCKS.register("asphalt_road_slab", RoadSlab::new);

    public static final RegistryObject<Block> whiteLine1Slab = BLOCKS.register("white_line_1_slab", () -> new LineSlab());
    public static final RegistryObject<Block> whiteLine2Slab = BLOCKS.register("white_line_2_slab", () -> new LineSlab());
    public static final RegistryObject<Block> whiteLine3Slab = BLOCKS.register("white_line_3_slab", () -> new LineSlab());
    public static final RegistryObject<Block> whiteLine4Slab = BLOCKS.register("white_line_4_slab", () -> new LineSlab());
    public static final RegistryObject<Block> whiteLine5Slab = BLOCKS.register("white_line_5_slab", () -> new LineSlab());
    public static final RegistryObject<Block> whiteLine6Slab = BLOCKS.register("white_line_6_slab", () -> new LineSlab());
    public static final RegistryObject<Block> whiteLine7Slab = BLOCKS.register("white_line_7_slab", () -> new LineSlab());
    public static final RegistryObject<Block> whiteLine8Slab = BLOCKS.register("white_line_8_slab", () -> new LineSlab());
}
