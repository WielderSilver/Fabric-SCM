package com.silverbeam.scm.registry.tools;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class EmeraldPickaxe extends PickaxeItem {

    public EmeraldPickaxe(ToolMaterial emerald) {
        super(emerald, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
