package com.samuel.spectrite.client.renderer;

import com.samuel.spectrite.Spectrite;
import com.samuel.spectrite.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public final class ItemRenderRegister {

	public static String modid = Spectrite.MOD_ID;
	
	@SubscribeEvent
	public void onRegisterItemModels(ModelRegistryEvent event) {
		registerItemModel(ModItems.diamond_rod);
		registerItemModel(ModItems.spectrite_rod);
		registerItemModel(ModItems.spectrite_brick);
		registerItemModel(ModItems.spectrite_bone);
		registerItemModel(ModItems.spectrite_dust);
		registerItemModel(ModItems.spectrite_blaze_rod);
		registerItemModel(ModItems.spectrite_blaze_powder);
		registerItemModel(ModItems.spectrite_gem);
		registerItemModel(ModItems.spectrite_orb);
		registerItemModel(ModItems.spectrite_shovel);
		registerItemModel(ModItems.spectrite_shovel_special);
		registerItemModel(ModItems.spectrite_pickaxe);
		registerItemModel(ModItems.spectrite_pickaxe_special);
		registerItemModel(ModItems.spectrite_axe);
		registerItemModel(ModItems.spectrite_axe_special);
		registerItemModel(ModItems.spectrite_sword);
		registerItemModel(ModItems.spectrite_sword_special);
		registerItemModel(ModItems.spectrite_sword_2);
		registerItemModel(ModItems.spectrite_arrow);
		registerItemModel(ModItems.spectrite_bow);
		registerItemModel(ModItems.spectrite_bow_special);
		registerItemModel(ModItems.spectrite_shield);
		registerItemModel(ModItems.spectrite_shield_special);
		registerItemModel(ModItems.spectrite_helmet);
		registerItemModel(ModItems.spectrite_chestplate);
		registerItemModel(ModItems.spectrite_leggings);
		registerItemModel(ModItems.spectrite_boots);
		registerItemModel(ModItems.spectrite_wither_skeleton_skull);
		registerItemModel(ModItems.spectrite_compass);
		
		ModelLoader.setBucketModelDefinition(ModItems.molten_spectrite_bucket);
	}

	public static void registerItemModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
			new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}