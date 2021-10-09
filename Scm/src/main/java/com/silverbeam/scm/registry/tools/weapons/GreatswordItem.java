package com.silverbeam.scm.registry.tools.weapons;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class GreatswordItem extends SwordItem {


    public GreatswordItem(ToolMaterial material) {
        super(material, 6, -6f, new Item.Settings().group(ItemGroup.COMBAT));
    }

}

