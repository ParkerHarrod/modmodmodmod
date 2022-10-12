package cattoplayz.cattos.flowers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class cattosflowers implements ModInitializer {

	public static final Block EYE_SEE_YOU = new Block(FabricBlockSettings.of(Material.PLANT).strength(0F,0F).sounds(BlockSoundGroup.GRASS).noCollision());
	
    public static final Block James_Charles = new Block(FabricBlockSettings.of(Material.PLANT).strength(9999F,9999F).sounds(BlockSoundGroup.GRASS).noCollision());
	
	public static final Block Foot = new Block(FabricBlockSettings.of(Material.STONE).strength(5F,5F).sounds(BlockSoundGroup.STONE).noCollision());

    public static final Block Bean_Block = new Block(FabricBlockSettings.of(Material.CAKE).strength(0F,0F).sounds(BlockSoundGroup.HONEY).noCollision());

	public static final Block Cotton_Candy_Block = new Block(FabricBlockSettings.of(Material.SCULK).strength(0F,0F).sounds(BlockSoundGroup.SAND).noCollision());

	public static final Block Bingus_Block = new Block(FabricBlockSettings.of(Material.BARRIER).strength(0F,0F).sounds(BlockSoundGroup.GRASS).noCollision());

	public static final Block Corn_Block = new Block(FabricBlockSettings.of(Material.PLANT).strength(0F,0F).sounds(BlockSoundGroup.GRASS).noCollision());

	public static final Block Im_Always_Watching = new Block(FabricBlockSettings.of(Material.STONE).strength(2F,2F).sounds(BlockSoundGroup.STONE).collidable(true));

	public static final Block Cheese_Block = new Block(FabricBlockSettings.of(Material.CAKE).strength(0F,0F).sounds(BlockSoundGroup.HONEY).collidable(true));                                              

	public static final Logger LOGGER = LoggerFactory.getLogger("cattosflowers");

	@Override
	public void onInitialize() {

		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "eye_see_you"), EYE_SEE_YOU);
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "eye_see_you"), new BlockItem(EYE_SEE_YOU, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers","cheese_block"), Cheese_Block);
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "cheese"), new BlockItem(Cheese_Block, new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "corn_block"), Corn_Block);
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "corn"), new BlockItem(Corn_Block,new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "cotton_candy_block"), Cotton_Candy_Block);
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "candy"), new BlockItem(Cotton_Candy_Block,new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "cotton"), new BlockItem(Cotton_Candy_Block,new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "bean"), new BlockItem(Bean_Block,new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "bean_block"), Bean_Block);
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "toe"), new BlockItem(Foot,new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "foot"), Foot);
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "im_always_watching"), Im_Always_Watching);
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "eye"), new BlockItem(Im_Always_Watching,new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "james_charles"), James_Charles);
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "hi_sisters"), new BlockItem(James_Charles,new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "bingus_block"), Bingus_Block);
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "bingus"), new BlockItem(Bingus_Block,new Item.Settings().group(ItemGroup.MISC)));

		LOGGER.info("A Robin movie what would that even be like");
	}
}
