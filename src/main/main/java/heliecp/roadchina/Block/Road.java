package heliecp.roadchina.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Road extends Block
{
    public Road()
    {
        super(Block.Properties.of(Material.STONE).harvestLevel(10));
    }


}
