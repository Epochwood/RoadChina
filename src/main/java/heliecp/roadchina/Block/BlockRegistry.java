package heliecp.roadchina.Block;

import heliecp.roadchina.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> asphalt_road = BLOCKS.register("asphalt_road", Road::new);
    public static final RegistryObject<Block> whiteLine1 = BLOCKS.register("white_line_1", Line::new);
    public static final RegistryObject<Block> whiteLine2 = BLOCKS.register("white_line_2", Line::new);

}
