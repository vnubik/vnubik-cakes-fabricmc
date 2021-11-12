package com.example.vnubik.cakes;

import com.example.vnubik.cakes.registry.ModBlocks;
import com.example.vnubik.cakes.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class CakesMod implements ModInitializer {
    public static final String MOD_ID = "vnubikcakes";

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        System.out.println("Vnubik Cakes Mod Initialized!");
    }
}
