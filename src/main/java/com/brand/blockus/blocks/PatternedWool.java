package com.brand.blockus.blocks;

import com.brand.blockus.Blockus;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.GlazedTerracottaBlock;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PatternedWool extends GlazedTerracottaBlock {

		public PatternedWool(String name, float hardness, float resistance) {
			super(FabricBlockSettings.of(Material.WOOL).sounds(BlockSoundGroup.WOOL).strength(hardness, resistance).build());
			Registry.register(Registry.BLOCK, new Identifier(Blockus.MOD_ID, name), this);
			Registry.register(Registry.ITEM,new Identifier(Blockus.MOD_ID, name), new BlockItem(this, new Item.Settings().maxCount(64).group(Blockus.BLOCKUS_BUILDING_BLOCKS)));
		}		
	}
