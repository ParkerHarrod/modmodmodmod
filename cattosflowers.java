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

import javax.xml.stream.events.Namespace;

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
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers","Cheese_Block"), Cheese_Block);
		Block Cheese;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "Cheese"), new BlockItem(Cheese, new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "Corn_Block"), Corn_Block);
		Block Corn;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "Corn"), new BlockItem(Corn,new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "Cotton_Candy_Block"), Cotton_Candy_Block);
		Block Candy;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "Candy"), new BlockItem(Candy,new Item.Settings().group(ItemGroup.FOOD)));
		Block Cotton;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "Cotton"), new BlockItem(Cotton,new Item.Settings().group(ItemGroup.MISC)));
		Block Bean;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "Bean"), new BlockItem(Bean,new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "Bean_Block"), Bean_Block);
		Block Toe;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "Toe"), new BlockItem(Toe,new Item.Settings().group(ItemGroup.FOOD)));
		Object Foot;
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "Foot"), Foot);
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "Im_Always_Watching"), Im_Always_Watching);
		Block eye;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "eye"), new BlockItem(eye,new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "James_Charles"), James_Charles);
		Block Hi_Sisters;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "Hi_Sisters"), new BlockItem(Hi_Sisters,new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("cattosflowers", "Bingus_Block"));
		Block Bingus;
		Registry.register(Registry.ITEM, new Identifier("cattosflowers", "Bingus"), new BlockItem(Bingus,new Item.Settings().group(ItemGroup.MISC)));

		LOGGER.info("A Robin movie what would that even be like");
	}
}