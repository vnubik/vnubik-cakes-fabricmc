package com.example.vnubik.cakes.registry;

import com.example.vnubik.cakes.CakesMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final BlockItem HONEY_CAKE = new BlockItem(
            ModBlocks.HONEY_CAKE,
            new Item.Settings().maxCount(1).group(ItemGroup.FOOD));
    public static final BlockItem CHOCOLATE_CAKE = new BlockItem(
            ModBlocks.CHOCOLATE_CAKE,
            new Item.Settings().maxCount(1).group(ItemGroup.FOOD));

    public static void register() {
        Registry.register(Registry.ITEM,
                new Identifier(CakesMod.MOD_ID, "honey_cake"), HONEY_CAKE);
        Registry.register(Registry.ITEM,
                new Identifier(CakesMod.MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);
    }
}
