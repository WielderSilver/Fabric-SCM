package com.silverbeam.scm;

import com.silverbeam.scm.registry.ModBlocks;
import com.silverbeam.scm.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Scm implements ModInitializer {

    public static final String MOD_ID = "scm";
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
