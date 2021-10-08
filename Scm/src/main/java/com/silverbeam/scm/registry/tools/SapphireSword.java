package com.silverbeam.scm.registry.tools;


import net.minecraft.item.*;

public class SapphireSword extends SwordItem {

    public SapphireSword(ToolMaterial sapphire) {
        super(sapphire, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
