package com.silverbeam.scm.registry.tools;


import net.minecraft.item.*;

public class AmethystSword extends SwordItem {

    public AmethystSword(ToolMaterial amethyst) {
        super(amethyst, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
