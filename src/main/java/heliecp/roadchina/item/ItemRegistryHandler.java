package heliecp.roadchina.item;

import heliecp.roadchina.block.BlockRegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegistryHandler
{
    public static final ItemBlock ITEM_BLOCK_ROAD = new ItemBlock(BlockRegistryHandler.BLOCK_ROAD);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_1 = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_1);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_2 = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_2);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_3 = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_3);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_4 = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_4);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_5 = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_5);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_6 = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_6);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_7 = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_7);
    public static final ItemBlock ITEM_BLOCK_ROAD_SLAB = new ItemBlock(BlockRegistryHandler.BLOCK_ROAD_SLAB);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_1_SLAB = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_1_SLAB);
    public static final ItemBlock ITEM_BLOCK_WHITE_LINE_2_SLAB = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_LINE_2_SLAB);
    public static final ItemBlock ITEM_BLOCK_WHITE_ARROW_1 = new ItemBlock(BlockRegistryHandler.BLOCK_WHITE_ARROW_1);
    public static final ItemWrench WRENCH = new ItemWrench();

    private static ItemBlock withRegistryName(ItemBlock item)
    {
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }

    @SubscribeEvent
    public static void onRegistry(Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(withRegistryName(ITEM_BLOCK_ROAD));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_1));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_2));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_3));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_4));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_5));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_6));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_7));
        registry.register(withRegistryName(ITEM_BLOCK_ROAD_SLAB));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_1_SLAB));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_LINE_2_SLAB));
        registry.register(withRegistryName(ITEM_BLOCK_WHITE_ARROW_1));
        registry.register(WRENCH);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item)
    {
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item,0,modelResourceLocation);
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event)
    {
        registerModel(ITEM_BLOCK_ROAD);
        registerModel(ITEM_BLOCK_WHITE_LINE_1);
        registerModel(ITEM_BLOCK_WHITE_LINE_2);
        registerModel(ITEM_BLOCK_WHITE_LINE_3);
        registerModel(ITEM_BLOCK_WHITE_LINE_4);
        registerModel(ITEM_BLOCK_WHITE_LINE_5);
        registerModel(ITEM_BLOCK_WHITE_LINE_6);
        registerModel(ITEM_BLOCK_WHITE_LINE_7);
        registerModel(ITEM_BLOCK_ROAD_SLAB);
        registerModel(ITEM_BLOCK_WHITE_LINE_1_SLAB);
        registerModel(ITEM_BLOCK_WHITE_LINE_2_SLAB);
        registerModel(ITEM_BLOCK_WHITE_ARROW_1);
        registerModel(WRENCH);
    }
}
