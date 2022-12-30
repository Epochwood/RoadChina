package heliecp.roadchina.Block;

import heliecp.roadchina.Utils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> asphaltRoad = BLOCKS.register("asphalt_road", Road::new);
    public static final RegistryObject<Block> whiteLine1 = BLOCKS.register("white_line_1", Line::new);
    public static final RegistryObject<Block> whiteLine2 = BLOCKS.register("white_line_2", Line::new);
    public static final RegistryObject<Block> whiteLine3 = BLOCKS.register("white_line_3", Line::new);
    public static final RegistryObject<Block> whiteLine4 = BLOCKS.register("white_line_4", Line::new);

    public static final RegistryObject<Block> whiteLine5 = BLOCKS.register("white_line_5", Line::new);
    public static final RegistryObject<Block> whiteLine6 = BLOCKS.register("white_line_6", Line::new);
    public static final RegistryObject<Block> whiteLine7 = BLOCKS.register("white_line_7", Line::new);
    public static final RegistryObject<Block> asphaltRoadSlab = BLOCKS.register("asphalt_road_slab", RoadSlab::new);
    public static final RegistryObject<Block> whiteLine1Slab = BLOCKS.register("white_line_1_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine2Slab = BLOCKS.register("white_line_2_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine3Slab = BLOCKS.register("white_line_3_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine4Slab = BLOCKS.register("white_line_4_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine5Slab = BLOCKS.register("white_line_5_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine6Slab = BLOCKS.register("white_line_6_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine7Slab = BLOCKS.register("white_line_7_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteArrow1 = BLOCKS.register("white_arrow_1", ArrowA::new);

}
