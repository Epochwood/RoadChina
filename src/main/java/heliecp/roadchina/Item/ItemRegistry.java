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
    public static final RegistryObject<Item> asphaltRoadSlab = ITEMS.register("asphalt_road_slab", () -> new BlockItem(BlockRegistry.asphaltRoadSlab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
    public static final RegistryObject<Item> whiteLine1Slab = ITEMS.register("white_line_1_slab", () -> new BlockItem(BlockRegistry.whiteLine1Slab.get(), new Item.Properties().tab(ModGroup.WHITE_ROAD_GROUP)));
}
