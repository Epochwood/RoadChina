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
    public static final RegistryObject<Item> whiteLine8 = ITEMS.register("white_line_8", () -> new BlockItem(BlockRegistry.whiteLine8.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine9a = ITEMS.register("white_line_9a", () -> new BlockItem(BlockRegistry.whiteLine9a.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine9b = ITEMS.register("white_line_9b", () -> new BlockItem(BlockRegistry.whiteLine9b.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine10a = ITEMS.register("white_line_10a", () -> new BlockItem(BlockRegistry.whiteLine10a.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine10b = ITEMS.register("white_line_10b", () -> new BlockItem(BlockRegistry.whiteLine10b.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine11a = ITEMS.register("white_line_11a", () -> new BlockItem(BlockRegistry.whiteLine11a.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine11b = ITEMS.register("white_line_11b", () -> new BlockItem(BlockRegistry.whiteLine11b.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine12a = ITEMS.register("white_line_12a", () -> new BlockItem(BlockRegistry.whiteLine12a.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine12b = ITEMS.register("white_line_12b", () -> new BlockItem(BlockRegistry.whiteLine12b.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));

    public static final RegistryObject<Item> asphaltRoadSlab = ITEMS.register("asphalt_road_slab", () -> new BlockItem(BlockRegistry.asphaltRoadSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));

    public static final RegistryObject<Item> whiteLine1Slab = ITEMS.register("white_line_1_slab", () -> new BlockItem(BlockRegistry.whiteLine1Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine2Slab = ITEMS.register("white_line_2_slab", () -> new BlockItem(BlockRegistry.whiteLine2Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine3Slab = ITEMS.register("white_line_3_slab", () -> new BlockItem(BlockRegistry.whiteLine3Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine4Slab = ITEMS.register("white_line_4_slab", () -> new BlockItem(BlockRegistry.whiteLine4Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine5Slab = ITEMS.register("white_line_5_slab", () -> new BlockItem(BlockRegistry.whiteLine5Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine6Slab = ITEMS.register("white_line_6_slab", () -> new BlockItem(BlockRegistry.whiteLine6Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine7Slab = ITEMS.register("white_line_7_slab", () -> new BlockItem(BlockRegistry.whiteLine7Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine8Slab = ITEMS.register("white_line_8_slab", () -> new BlockItem(BlockRegistry.whiteLine8Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine9aSlab = ITEMS.register("white_line_9a_slab", () -> new BlockItem(BlockRegistry.whiteLine9aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine9bSlab = ITEMS.register("white_line_9b_slab", () -> new BlockItem(BlockRegistry.whiteLine9bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine10aSlab = ITEMS.register("white_line_10a_slab", () -> new BlockItem(BlockRegistry.whiteLine10aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine10bSlab = ITEMS.register("white_line_10b_slab", () -> new BlockItem(BlockRegistry.whiteLine10bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine11aSlab = ITEMS.register("white_line_11a_slab", () -> new BlockItem(BlockRegistry.whiteLine11aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine11bSlab = ITEMS.register("white_line_11b_slab", () -> new BlockItem(BlockRegistry.whiteLine11bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine12aSlab = ITEMS.register("white_line_12a_slab", () -> new BlockItem(BlockRegistry.whiteLine12aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine12bSlab = ITEMS.register("white_line_12b_slab", () -> new BlockItem(BlockRegistry.whiteLine12bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));

    public static final RegistryObject<Item> whiteArrow1 = ITEMS.register("white_arrow_1", () -> new BlockItem(BlockRegistry.whiteArrow1.get(), new Item.Properties().tab(ModGroup.ARROW_GROUP)));
}
