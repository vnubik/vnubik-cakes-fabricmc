package com.example.vnubik.cakes.registry;

import com.example.vnubik.cakes.CakesMod;
import com.example.vnubik.cakes.ChocolateCakeBlock;
import com.example.vnubik.cakes.HoneyCakeBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block HONEY_CAKE = new HoneyCakeBlock(AbstractBlock.Settings
            .of(Material.CAKE)
            .strength(0.5F)
            .sounds(BlockSoundGroup.WOOL));
    public static final Block CHOCOLATE_CAKE = new ChocolateCakeBlock(AbstractBlock.Settings
            .of(Material.CAKE)
            .strength(0.5F)
            .sounds(BlockSoundGroup.WOOL));

    public static void register() {
        Registry.register(
                Registry.BLOCK,
                new Identifier(CakesMod.MOD_ID, "honey_cake"),
                HONEY_CAKE);
        Registry.register(
                Registry.BLOCK,
                new Identifier(CakesMod.MOD_ID, "chocolate_cake"),
                CHOCOLATE_CAKE);
    }
}
