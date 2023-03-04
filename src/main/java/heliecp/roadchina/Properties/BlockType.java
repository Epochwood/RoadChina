package heliecp.roadchina.Properties;

import net.minecraft.util.IStringSerializable;

public enum BlockType implements IStringSerializable
{
    FULL_BLOCK("full_block"),
    SLAB_BLOCK("slab_block");

    private final String name;

    private BlockType(String p_i49332_3_) {
        this.name = p_i49332_3_;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return this.name;
    }
}
