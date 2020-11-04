package ru.betterend.blocks.basis;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BlockWallMushroom extends BlockWallPlant {
	public BlockWallMushroom(int light) {
		super(FabricBlockSettings.of(Material.WOOD)
				.breakByTool(FabricToolTags.AXES)
				.sounds(BlockSoundGroup.GRASS)
				.luminance(light)
				.sounds(BlockSoundGroup.WOOD)
				.hardness(0.2F)
				.breakByHand(true)
				.allowsSpawning((state, world, pos, type) -> { return false; })
				.suffocates((state, world, pos) -> { return false; })
				.blockVision((state, world, pos) -> { return false; })
				.noCollision());
	}
}