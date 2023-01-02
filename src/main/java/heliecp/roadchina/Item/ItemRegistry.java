package heliecp.roadchina.Item;

import heliecp.roadchina.Block.BlockRegistry;
import heliecp.roadchina.Group.ModGroup;
import heliecp.roadchina.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> wrench = ITEMS.register("wrench", Wrench::new);
    public static final RegistryObject<Item> asphaltRoad = ITEMS.register("asphalt_road", () -> new BlockItem(BlockRegistry.asphaltRoad.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine1 = ITEMS.register("white_line_1", () -> new BlockItem(BlockRegistry.whiteLine1.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine2 = ITEMS.register("white_line_2", () -> new BlockItem(BlockRegistry.whiteLine2.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine3 = ITEMS.register("white_line_3", () -> new BlockItem(BlockRegistry.whiteLine3.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine4 = ITEMS.register("white_line_4", () -> new BlockItem(BlockRegistry.whiteLine4.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine5 = ITEMS.register("white_line_5", () -> new BlockItem(BlockRegistry.whiteLine5.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine6 = ITEMS.register("white_line_6", () -> new BlockItem(BlockRegistry.whiteLine6.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine7 = ITEMS.register("white_line_7", () -> new BlockItem(BlockRegistry.whiteLine7.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> asphaltRoadSlab = ITEMS.register("asphalt_road_slab", () -> new BlockItem(BlockRegistry.asphaltRoadSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine1Slab = ITEMS.register("white_line_1_slab", () -> new BlockItem(BlockRegistry.whiteLine1Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine2Slab = ITEMS.register("white_line_2_slab", () -> new BlockItem(BlockRegistry.whiteLine2Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine3Slab = ITEMS.register("white_line_3_slab", () -> new BlockItem(BlockRegistry.whiteLine3Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine4Slab = ITEMS.register("white_line_4_slab", () -> new BlockItem(BlockRegistry.whiteLine4Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine5Slab = ITEMS.register("white_line_5_slab", () -> new BlockItem(BlockRegistry.whiteLine5Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine6Slab = ITEMS.register("white_line_6_slab", () -> new BlockItem(BlockRegistry.whiteLine6Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine7Slab = ITEMS.register("white_line_7_slab", () -> new BlockItem(BlockRegistry.whiteLine7Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteArrow1 = ITEMS.register("white_arrow_1", () -> new BlockItem(BlockRegistry.whiteArrow1.get(), new Item.Properties().tab(ModGroup.ARROW_GROUP)));
}
