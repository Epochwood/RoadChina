package heliecp.roadchina.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

public class Road extends Block
{
    public Road()
    {
        super(Properties.of().mapColor(MapColor.STONE).strength(1.5F));
    }

}
