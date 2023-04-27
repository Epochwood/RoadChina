package heliecp.roadchina.properties;

import com.google.common.collect.Maps;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.MathHelper;

import java.util.Locale;
import java.util.Map;

public enum BlockType implements IStringSerializable
{
    FULL_BLOCK("full_block",0),
    SLAB_BLOCK("slab_block",1);

    public static final BlockType[] INDEX = new BlockType[2];

    private static final Map<String, BlockType> NAME_LOOKUP = Maps.<String, BlockType>newHashMap();

    private final String name;
    private final int index;

    private BlockType(String name, int indexIn)
    {
        this.name = name;
        this.index = indexIn;
    }

    public String toString()
    {
        return this.name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getIndex()
    {
        return this.index;
    }

    public static BlockType getIndex(int indexIn)
    {
        return INDEX[MathHelper.abs(indexIn % INDEX.length)];
    }

    static
    {
        for (BlockType blockType : values())
        {
            INDEX[blockType.index] = blockType;

            NAME_LOOKUP.put(blockType.getName().toLowerCase(Locale.ROOT), blockType);
        }
    }
}
