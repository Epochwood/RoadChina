package heliecp.roadchina.Block;

import heliecp.roadchina.Utils;
import net.minecraft.block.Block;
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
    public static final RegistryObject<Block> whiteLine8 = BLOCKS.register("white_line_8", Line::new);
    public static final RegistryObject<Block> whiteLine9a = BLOCKS.register("white_line_9a", Line::new);
    public static final RegistryObject<Block> whiteLine9b = BLOCKS.register("white_line_9b", Line::new);
    public static final RegistryObject<Block> whiteLine10a = BLOCKS.register("white_line_10a", Line::new);
    public static final RegistryObject<Block> whiteLine10b = BLOCKS.register("white_line_10b", Line::new);
    public static final RegistryObject<Block> whiteLine11a = BLOCKS.register("white_line_11a", Line::new);
    public static final RegistryObject<Block> whiteLine11b = BLOCKS.register("white_line_11b", Line::new);
    public static final RegistryObject<Block> whiteLine12a = BLOCKS.register("white_line_12a", Line::new);
    public static final RegistryObject<Block> whiteLine12b = BLOCKS.register("white_line_12b", Line::new);
    public static final RegistryObject<Block> whiteLine13 = BLOCKS.register("white_line_13", Line::new);
    public static final RegistryObject<Block> whiteLine14 = BLOCKS.register("white_line_14", Line::new);
    public static final RegistryObject<Block> whiteLine15 = BLOCKS.register("white_line_15", Line::new);
    public static final RegistryObject<Block> whiteLine16a = BLOCKS.register("white_line_16a", Line::new);
    public static final RegistryObject<Block> whiteLine16b = BLOCKS.register("white_line_16b", Line::new);
    public static final RegistryObject<Block> whiteLine17a = BLOCKS.register("white_line_17a", Line::new);
    public static final RegistryObject<Block> whiteLine17b = BLOCKS.register("white_line_17b", Line::new);
    public static final RegistryObject<Block> whiteLine18a = BLOCKS.register("white_line_18a", Line::new);
    public static final RegistryObject<Block> whiteLine18b = BLOCKS.register("white_line_18b", Line::new);
    public static final RegistryObject<Block> roadchina = BLOCKS.register("roadchina", Line::new);

    public static final RegistryObject<Block> asphaltRoadSlab = BLOCKS.register("asphalt_road_slab", RoadSlab::new);

    public static final RegistryObject<Block> whiteLine1Slab = BLOCKS.register("white_line_1_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine2Slab = BLOCKS.register("white_line_2_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine3Slab = BLOCKS.register("white_line_3_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine4Slab = BLOCKS.register("white_line_4_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine5Slab = BLOCKS.register("white_line_5_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine6Slab = BLOCKS.register("white_line_6_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine7Slab = BLOCKS.register("white_line_7_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine8Slab = BLOCKS.register("white_line_8_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine9aSlab = BLOCKS.register("white_line_9a_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine9bSlab = BLOCKS.register("white_line_9b_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine10aSlab = BLOCKS.register("white_line_10a_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine10bSlab = BLOCKS.register("white_line_10b_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine11aSlab = BLOCKS.register("white_line_11a_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine11bSlab = BLOCKS.register("white_line_11b_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine12aSlab = BLOCKS.register("white_line_12a_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine12bSlab = BLOCKS.register("white_line_12b_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine13Slab = BLOCKS.register("white_line_13_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine14Slab = BLOCKS.register("white_line_14_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine15Slab = BLOCKS.register("white_line_15_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine16aSlab = BLOCKS.register("white_line_16a_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine16bSlab = BLOCKS.register("white_line_16b_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine17aSlab = BLOCKS.register("white_line_17a_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine17bSlab = BLOCKS.register("white_line_17b_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine18aSlab = BLOCKS.register("white_line_18a_slab", LineSlab::new);
    public static final RegistryObject<Block> whiteLine18bSlab = BLOCKS.register("white_line_18b_slab", LineSlab::new);

    public static final RegistryObject<Block> whiteArrow1 = BLOCKS.register("white_arrow_1", ArrowA::new);
    public static final RegistryObject<Block> whiteArrow1Slab = BLOCKS.register("white_arrow_1_slab", ArrowASlab::new);

}
