package heliecp.roadchina.Item;

import heliecp.roadchina.Block.BlockRegistry;
import heliecp.roadchina.Group.ModGroup;
import heliecp.roadchina.Utils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> wrench = ITEMS.register("wrench", Wrench::new);

    public static final RegistryObject<Item> asphaltRoad = ITEMS.register("asphalt_road", () -> new BlockItem(BlockRegistry.asphaltRoad.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));

    public static final RegistryObject<Item> whiteLine1 = ITEMS.register("white_line_1", () -> new BlockItem(BlockRegistry.whiteLine1.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine2 = ITEMS.register("white_line_2", () -> new BlockItem(BlockRegistry.whiteLine2.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine3 = ITEMS.register("white_line_3", () -> new BlockItem(BlockRegistry.whiteLine3.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine4 = ITEMS.register("white_line_4", () -> new BlockItem(BlockRegistry.whiteLine4.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine5 = ITEMS.register("white_line_5", () -> new BlockItem(BlockRegistry.whiteLine5.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine6 = ITEMS.register("white_line_6", () -> new BlockItem(BlockRegistry.whiteLine6.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine7 = ITEMS.register("white_line_7", () -> new BlockItem(BlockRegistry.whiteLine7.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine8 = ITEMS.register("white_line_8", () -> new BlockItem(BlockRegistry.whiteLine8.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine9a = ITEMS.register("white_line_9a", () -> new BlockItem(BlockRegistry.whiteLine9a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine9b = ITEMS.register("white_line_9b", () -> new BlockItem(BlockRegistry.whiteLine9b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine10a = ITEMS.register("white_line_10a", () -> new BlockItem(BlockRegistry.whiteLine10a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine10b = ITEMS.register("white_line_10b", () -> new BlockItem(BlockRegistry.whiteLine10b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine11a = ITEMS.register("white_line_11a", () -> new BlockItem(BlockRegistry.whiteLine11a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine11b = ITEMS.register("white_line_11b", () -> new BlockItem(BlockRegistry.whiteLine11b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine12a = ITEMS.register("white_line_12a", () -> new BlockItem(BlockRegistry.whiteLine12a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine12b = ITEMS.register("white_line_12b", () -> new BlockItem(BlockRegistry.whiteLine12b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine13 = ITEMS.register("white_line_13", () -> new BlockItem(BlockRegistry.whiteLine13.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine14 = ITEMS.register("white_line_14", () -> new BlockItem(BlockRegistry.whiteLine14.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine15 = ITEMS.register("white_line_15", () -> new BlockItem(BlockRegistry.whiteLine15.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine16a = ITEMS.register("white_line_16a", () -> new BlockItem(BlockRegistry.whiteLine16a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine16b = ITEMS.register("white_line_16b", () -> new BlockItem(BlockRegistry.whiteLine16b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine17a = ITEMS.register("white_line_17a", () -> new BlockItem(BlockRegistry.whiteLine17a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine17b = ITEMS.register("white_line_17b", () -> new BlockItem(BlockRegistry.whiteLine17b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine18a = ITEMS.register("white_line_18a", () -> new BlockItem(BlockRegistry.whiteLine18a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine18b = ITEMS.register("white_line_18b", () -> new BlockItem(BlockRegistry.whiteLine18b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine19a = ITEMS.register("white_line_19a", () -> new BlockItem(BlockRegistry.whiteLine19a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine19b = ITEMS.register("white_line_19b", () -> new BlockItem(BlockRegistry.whiteLine19b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine20a = ITEMS.register("white_line_20a", () -> new BlockItem(BlockRegistry.whiteLine20a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine20b = ITEMS.register("white_line_20b", () -> new BlockItem(BlockRegistry.whiteLine20b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine21a = ITEMS.register("white_line_21a", () -> new BlockItem(BlockRegistry.whiteLine21a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine21b = ITEMS.register("white_line_21b", () -> new BlockItem(BlockRegistry.whiteLine21b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine22a = ITEMS.register("white_line_22a", () -> new BlockItem(BlockRegistry.whiteLine22a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine22b = ITEMS.register("white_line_22b", () -> new BlockItem(BlockRegistry.whiteLine22b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine23a = ITEMS.register("white_line_23a", () -> new BlockItem(BlockRegistry.whiteLine23a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine23b = ITEMS.register("white_line_23b", () -> new BlockItem(BlockRegistry.whiteLine23b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine24 = ITEMS.register("white_line_24", () -> new BlockItem(BlockRegistry.whiteLine24.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine25 = ITEMS.register("white_line_25", () -> new BlockItem(BlockRegistry.whiteLine25.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine26a = ITEMS.register("white_line_26a", () -> new BlockItem(BlockRegistry.whiteLine26a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine26b = ITEMS.register("white_line_26b", () -> new BlockItem(BlockRegistry.whiteLine26b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine26c = ITEMS.register("white_line_26c", () -> new BlockItem(BlockRegistry.whiteLine26c.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine27a = ITEMS.register("white_line_27a", () -> new BlockItem(BlockRegistry.whiteLine27a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine27b = ITEMS.register("white_line_27b", () -> new BlockItem(BlockRegistry.whiteLine27b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine27c = ITEMS.register("white_line_27c", () -> new BlockItem(BlockRegistry.whiteLine27c.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine28 = ITEMS.register("white_line_28", () -> new BlockItem(BlockRegistry.whiteLine28.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine29a = ITEMS.register("white_line_29a", () -> new BlockItem(BlockRegistry.whiteLine29a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine29b = ITEMS.register("white_line_29b", () -> new BlockItem(BlockRegistry.whiteLine29b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine29c = ITEMS.register("white_line_29c", () -> new BlockItem(BlockRegistry.whiteLine29c.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine30a = ITEMS.register("white_line_30a", () -> new BlockItem(BlockRegistry.whiteLine30a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine30b = ITEMS.register("white_line_30b", () -> new BlockItem(BlockRegistry.whiteLine30b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine30c = ITEMS.register("white_line_30c", () -> new BlockItem(BlockRegistry.whiteLine30c.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine31a = ITEMS.register("white_line_31a", () -> new BlockItem(BlockRegistry.whiteLine31a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine31b = ITEMS.register("white_line_31b", () -> new BlockItem(BlockRegistry.whiteLine31b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine31c = ITEMS.register("white_line_31c", () -> new BlockItem(BlockRegistry.whiteLine31c.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine32 = ITEMS.register("white_line_32", () -> new BlockItem(BlockRegistry.whiteLine32.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine33a = ITEMS.register("white_line_33a", () -> new BlockItem(BlockRegistry.whiteLine33a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine33b = ITEMS.register("white_line_33b", () -> new BlockItem(BlockRegistry.whiteLine33b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine34 = ITEMS.register("white_line_34", () -> new BlockItem(BlockRegistry.whiteLine34.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine35 = ITEMS.register("white_line_35", () -> new BlockItem(BlockRegistry.whiteLine35.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine36 = ITEMS.register("white_line_36", () -> new BlockItem(BlockRegistry.whiteLine36.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine37a = ITEMS.register("white_line_37a", () -> new BlockItem(BlockRegistry.whiteLine37a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine37b = ITEMS.register("white_line_37b", () -> new BlockItem(BlockRegistry.whiteLine37b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine37c = ITEMS.register("white_line_37c", () -> new BlockItem(BlockRegistry.whiteLine37c.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine37d = ITEMS.register("white_line_37d", () -> new BlockItem(BlockRegistry.whiteLine37d.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine38a = ITEMS.register("white_line_38a", () -> new BlockItem(BlockRegistry.whiteLine38a.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine38b = ITEMS.register("white_line_38b", () -> new BlockItem(BlockRegistry.whiteLine38b.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine38c = ITEMS.register("white_line_38c", () -> new BlockItem(BlockRegistry.whiteLine38c.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine38d = ITEMS.register("white_line_38d", () -> new BlockItem(BlockRegistry.whiteLine38d.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));

    public static final RegistryObject<Item> yellowLine1 = ITEMS.register("yellow_line_1", () -> new BlockItem(BlockRegistry.yellowLine1.get(), new Item.Properties().tab(ModGroup.YELLOW_LINE_GROUP)));
    public static final RegistryObject<Item> yellowLine2 = ITEMS.register("yellow_line_2", () -> new BlockItem(BlockRegistry.yellowLine2.get(), new Item.Properties().tab(ModGroup.YELLOW_LINE_GROUP)));
    public static final RegistryObject<Item> yellowLine3 = ITEMS.register("yellow_line_3", () -> new BlockItem(BlockRegistry.yellowLine3.get(), new Item.Properties().tab(ModGroup.YELLOW_LINE_GROUP)));
    public static final RegistryObject<Item> yellowLine4 = ITEMS.register("yellow_line_4", () -> new BlockItem(BlockRegistry.yellowLine4.get(), new Item.Properties().tab(ModGroup.YELLOW_LINE_GROUP)));

    public static final RegistryObject<Item> roadchina = ITEMS.register("roadchina", () -> new BlockItem(BlockRegistry.roadchina.get(), new Item.Properties()));

    public static final RegistryObject<Item> asphaltRoadSlab = ITEMS.register("asphalt_road_slab", () -> new BlockItem(BlockRegistry.asphaltRoadSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));

    public static final RegistryObject<Item> whiteLine1Slab = ITEMS.register("white_line_1_slab", () -> new BlockItem(BlockRegistry.whiteLine1Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine2Slab = ITEMS.register("white_line_2_slab", () -> new BlockItem(BlockRegistry.whiteLine2Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine3Slab = ITEMS.register("white_line_3_slab", () -> new BlockItem(BlockRegistry.whiteLine3Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine4Slab = ITEMS.register("white_line_4_slab", () -> new BlockItem(BlockRegistry.whiteLine4Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine5Slab = ITEMS.register("white_line_5_slab", () -> new BlockItem(BlockRegistry.whiteLine5Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine6Slab = ITEMS.register("white_line_6_slab", () -> new BlockItem(BlockRegistry.whiteLine6Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine7Slab = ITEMS.register("white_line_7_slab", () -> new BlockItem(BlockRegistry.whiteLine7Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine8Slab = ITEMS.register("white_line_8_slab", () -> new BlockItem(BlockRegistry.whiteLine8Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine9aSlab = ITEMS.register("white_line_9a_slab", () -> new BlockItem(BlockRegistry.whiteLine9aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine9bSlab = ITEMS.register("white_line_9b_slab", () -> new BlockItem(BlockRegistry.whiteLine9bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine10aSlab = ITEMS.register("white_line_10a_slab", () -> new BlockItem(BlockRegistry.whiteLine10aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine10bSlab = ITEMS.register("white_line_10b_slab", () -> new BlockItem(BlockRegistry.whiteLine10bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine11aSlab = ITEMS.register("white_line_11a_slab", () -> new BlockItem(BlockRegistry.whiteLine11aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine11bSlab = ITEMS.register("white_line_11b_slab", () -> new BlockItem(BlockRegistry.whiteLine11bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine12aSlab = ITEMS.register("white_line_12a_slab", () -> new BlockItem(BlockRegistry.whiteLine12aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine12bSlab = ITEMS.register("white_line_12b_slab", () -> new BlockItem(BlockRegistry.whiteLine12bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine13Slab = ITEMS.register("white_line_13_slab", () -> new BlockItem(BlockRegistry.whiteLine13Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine14Slab = ITEMS.register("white_line_14_slab", () -> new BlockItem(BlockRegistry.whiteLine14Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine15Slab = ITEMS.register("white_line_15_slab", () -> new BlockItem(BlockRegistry.whiteLine15Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine16aSlab = ITEMS.register("white_line_16a_slab", () -> new BlockItem(BlockRegistry.whiteLine16aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine16bSlab = ITEMS.register("white_line_16b_slab", () -> new BlockItem(BlockRegistry.whiteLine16bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine17aSlab = ITEMS.register("white_line_17a_slab", () -> new BlockItem(BlockRegistry.whiteLine17aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine17bSlab = ITEMS.register("white_line_17b_slab", () -> new BlockItem(BlockRegistry.whiteLine17bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine18aSlab = ITEMS.register("white_line_18a_slab", () -> new BlockItem(BlockRegistry.whiteLine18aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine18bSlab = ITEMS.register("white_line_18b_slab", () -> new BlockItem(BlockRegistry.whiteLine18bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine19aSlab = ITEMS.register("white_line_19a_slab", () -> new BlockItem(BlockRegistry.whiteLine19aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine19bSlab = ITEMS.register("white_line_19b_slab", () -> new BlockItem(BlockRegistry.whiteLine19bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine20aSlab = ITEMS.register("white_line_20a_slab", () -> new BlockItem(BlockRegistry.whiteLine20aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine20bSlab = ITEMS.register("white_line_20b_slab", () -> new BlockItem(BlockRegistry.whiteLine20bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine21aSlab = ITEMS.register("white_line_21a_slab", () -> new BlockItem(BlockRegistry.whiteLine21aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine21bSlab = ITEMS.register("white_line_21b_slab", () -> new BlockItem(BlockRegistry.whiteLine21bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine22aSlab = ITEMS.register("white_line_22a_slab", () -> new BlockItem(BlockRegistry.whiteLine22aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine22bSlab = ITEMS.register("white_line_22b_slab", () -> new BlockItem(BlockRegistry.whiteLine22bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine23aSlab = ITEMS.register("white_line_23a_slab", () -> new BlockItem(BlockRegistry.whiteLine23aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine23bSlab = ITEMS.register("white_line_23b_slab", () -> new BlockItem(BlockRegistry.whiteLine23bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine24Slab = ITEMS.register("white_line_24_slab", () -> new BlockItem(BlockRegistry.whiteLine24Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine25Slab = ITEMS.register("white_line_25_slab", () -> new BlockItem(BlockRegistry.whiteLine25Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine26aSlab = ITEMS.register("white_line_26a_slab", () -> new BlockItem(BlockRegistry.whiteLine26aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine26bSlab = ITEMS.register("white_line_26b_slab", () -> new BlockItem(BlockRegistry.whiteLine26bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine26cSlab = ITEMS.register("white_line_26c_slab", () -> new BlockItem(BlockRegistry.whiteLine26cSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine27aSlab = ITEMS.register("white_line_27a_slab", () -> new BlockItem(BlockRegistry.whiteLine27aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine27bSlab = ITEMS.register("white_line_27b_slab", () -> new BlockItem(BlockRegistry.whiteLine27bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine27cSlab = ITEMS.register("white_line_27c_slab", () -> new BlockItem(BlockRegistry.whiteLine27cSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine28Slab = ITEMS.register("white_line_28_slab", () -> new BlockItem(BlockRegistry.whiteLine28Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine29aSlab = ITEMS.register("white_line_29a_slab", () -> new BlockItem(BlockRegistry.whiteLine29aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine29bSlab = ITEMS.register("white_line_29b_slab", () -> new BlockItem(BlockRegistry.whiteLine29bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine29cSlab = ITEMS.register("white_line_29c_slab", () -> new BlockItem(BlockRegistry.whiteLine29cSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine30aSlab = ITEMS.register("white_line_30a_slab", () -> new BlockItem(BlockRegistry.whiteLine30aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine30bSlab = ITEMS.register("white_line_30b_slab", () -> new BlockItem(BlockRegistry.whiteLine30bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine30cSlab = ITEMS.register("white_line_30c_slab", () -> new BlockItem(BlockRegistry.whiteLine30cSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine31aSlab = ITEMS.register("white_line_31a_slab", () -> new BlockItem(BlockRegistry.whiteLine31aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine31bSlab = ITEMS.register("white_line_31b_slab", () -> new BlockItem(BlockRegistry.whiteLine31bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine31cSlab = ITEMS.register("white_line_31c_slab", () -> new BlockItem(BlockRegistry.whiteLine31cSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine32Slab = ITEMS.register("white_line_32_slab", () -> new BlockItem(BlockRegistry.whiteLine32Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine33aSlab = ITEMS.register("white_line_33a_slab", () -> new BlockItem(BlockRegistry.whiteLine33aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine33bSlab = ITEMS.register("white_line_33b_slab", () -> new BlockItem(BlockRegistry.whiteLine33bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine34Slab = ITEMS.register("white_line_34_slab", () -> new BlockItem(BlockRegistry.whiteLine34Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine35Slab = ITEMS.register("white_line_35_slab", () -> new BlockItem(BlockRegistry.whiteLine35Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine36Slab = ITEMS.register("white_line_36_slab", () -> new BlockItem(BlockRegistry.whiteLine36Slab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine37aSlab = ITEMS.register("white_line_37a_slab", () -> new BlockItem(BlockRegistry.whiteLine37aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine37bSlab = ITEMS.register("white_line_37b_slab", () -> new BlockItem(BlockRegistry.whiteLine37bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine37cSlab = ITEMS.register("white_line_37c_slab", () -> new BlockItem(BlockRegistry.whiteLine37cSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine37dSlab = ITEMS.register("white_line_37d_slab", () -> new BlockItem(BlockRegistry.whiteLine37dSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine38aSlab = ITEMS.register("white_line_38a_slab", () -> new BlockItem(BlockRegistry.whiteLine38aSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine38bSlab = ITEMS.register("white_line_38b_slab", () -> new BlockItem(BlockRegistry.whiteLine38bSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine38cSlab = ITEMS.register("white_line_38c_slab", () -> new BlockItem(BlockRegistry.whiteLine38cSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));
    public static final RegistryObject<Item> whiteLine38dSlab = ITEMS.register("white_line_38d_slab", () -> new BlockItem(BlockRegistry.whiteLine38dSlab.get(), new Item.Properties().tab(ModGroup.WHITE_LINE_GROUP)));

    public static final RegistryObject<Item> yellowLine1Slab = ITEMS.register("yellow_line_1_slab", () -> new BlockItem(BlockRegistry.yellowLine1Slab.get(), new Item.Properties().tab(ModGroup.YELLOW_LINE_GROUP)));
    public static final RegistryObject<Item> yellowLine2Slab = ITEMS.register("yellow_line_2_slab", () -> new BlockItem(BlockRegistry.yellowLine2Slab.get(), new Item.Properties().tab(ModGroup.YELLOW_LINE_GROUP)));
    public static final RegistryObject<Item> yellowLine3Slab = ITEMS.register("yellow_line_3_slab", () -> new BlockItem(BlockRegistry.yellowLine3Slab.get(), new Item.Properties().tab(ModGroup.YELLOW_LINE_GROUP)));
    public static final RegistryObject<Item> yellowLine4Slab = ITEMS.register("yellow_line_4_slab", () -> new BlockItem(BlockRegistry.yellowLine4Slab.get(), new Item.Properties().tab(ModGroup.YELLOW_LINE_GROUP)));

    public static final RegistryObject<Item> whiteArrow1 = ITEMS.register("white_arrow_1", () -> new BlockItem(BlockRegistry.whiteArrow1.get(), new Item.Properties().tab(ModGroup.ARROW_GROUP)));
    public static final RegistryObject<Item> whiteArrow2a = ITEMS.register("white_arrow_2a", () -> new BlockItem(BlockRegistry.whiteArrow2a.get(), new Item.Properties().tab(ModGroup.ARROW_GROUP)));
    public static final RegistryObject<Item> whiteArrow2b = ITEMS.register("white_arrow_2b", () -> new BlockItem(BlockRegistry.whiteArrow2b.get(), new Item.Properties().tab(ModGroup.ARROW_GROUP)));
}
