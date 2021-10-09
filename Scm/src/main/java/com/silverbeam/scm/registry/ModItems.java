package com.silverbeam.scm.registry;

import com.silverbeam.scm.Scm;
import com.silverbeam.scm.registry.armor.*;
import com.silverbeam.scm.registry.tools.*;
import com.silverbeam.scm.registry.tools.weapons.GreatswordItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SAPPHIRE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TOPAZ = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item MYTHRIL_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TOPAZ_BLOCK = new BlockItem(ModBlocks.TOPAZ_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SAPPHIRE_BLOCK = new BlockItem(ModBlocks.SAPPHIRE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MYTHRIL_BLOCK = new BlockItem(ModBlocks.MYTHRIL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Ore Block Items
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TOPAZ_ORE = new BlockItem(ModBlocks.TOPAZ_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SAPPHIRE_ORE = new BlockItem(ModBlocks.SAPPHIRE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MYTHRIL_ORE = new BlockItem(ModBlocks.MYTHRIL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Armor
    public static final ArmorMaterial RUBY_ARMOR = new RubyArmorMaterial();
    public static final ArmorMaterial SAPPHIRE_ARMOR = new SapphireArmorMaterial();
    public static final ArmorMaterial TOPAZ_ARMOR = new TopazArmorMaterial();
    public static final ArmorMaterial MYTHRIL_ARMOR = new MythrilArmorMaterial();
    public static final ArmorMaterial EMERALD_ARMOR = new EmeraldArmorMaterial();
    public static final ArmorMaterial AMETHYST_ARMOR = new AmethystArmorMaterial();


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz"), TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_shard"), MYTHRIL_SHARD);

        //Blocks
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_block"), MYTHRIL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_ore"), TOPAZ_ORE);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_ore"), MYTHRIL_ORE);

        //tools

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_greatsword"), new GreatswordItem(new ToolMaterialRuby()));



        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_pickaxe"), new RubyPickaxe(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_axe"), new RubyAxe(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_hoe"), new RubyHoe(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_shovel"), new RubyShovel(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_sword"), new RubySword(new ToolMaterialRuby()));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_pickaxe"), new SapphirePickaxe(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_axe"), new SapphireAxe(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_hoe"), new SapphireHoe(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_shovel"), new SapphireShovel(new ToolMaterialSapphire()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_sword"), new SapphireSword(new ToolMaterialSapphire()));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_pickaxe"), new TopazPickaxe(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_axe"), new TopazAxe(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_hoe"), new TopazHoe(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_shovel"), new TopazShovel(new ToolMaterialTopaz()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_sword"), new TopazSword(new ToolMaterialTopaz()));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_pickaxe"), new AmethystPickaxe(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_axe"), new AmethystAxe(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_hoe"), new AmethystHoe(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_shovel"), new AmethystShovel(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_sword"), new AmethystSword(new ToolMaterialAmethyst()));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_pickaxe"), new EmeraldPickaxe(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_axe"), new EmeraldAxe(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_hoe"), new EmeraldHoe(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_shovel"), new EmeraldShovel(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_sword"), new EmeraldSword(new ToolMaterialEmerald()));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_pickaxe"), new MythrilPickaxe(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_axe"), new MythrilAxe(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_hoe"), new MythrilHoe(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_shovel"), new MythrilShovel(new ToolMaterialMythril()));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_sword"), new MythrilSword(new ToolMaterialMythril()));

        //Armor
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_helmet"), new RubyArmor(RUBY_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_chestplate"), new RubyArmor(RUBY_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_leggings"), new RubyArmor(RUBY_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "ruby_boots"), new RubyArmor(RUBY_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_helmet"), new SapphireArmor(SAPPHIRE_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_chestplate"), new SapphireArmor(SAPPHIRE_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_leggings"), new SapphireArmor(SAPPHIRE_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "sapphire_boots"), new SapphireArmor(SAPPHIRE_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_helmet"), new TopazArmor(TOPAZ_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_chestplate"), new TopazArmor(TOPAZ_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_leggings"), new TopazArmor(TOPAZ_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "topaz_boots"), new TopazArmor(TOPAZ_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_helmet"), new AmethystArmor(AMETHYST_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_chestplate"), new AmethystArmor(AMETHYST_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_leggings"), new AmethystArmor(AMETHYST_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "amethyst_boots"), new AmethystArmor(AMETHYST_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_helmet"), new EmeraldArmor(EMERALD_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_chestplate"), new EmeraldArmor(EMERALD_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_leggings"), new EmeraldArmor(EMERALD_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "emerald_boots"), new EmeraldArmor(EMERALD_ARMOR, EquipmentSlot.FEET));


        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_helmet"), new MythrilArmor(MYTHRIL_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_chestplate"), new MythrilArmor(MYTHRIL_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_leggings"), new MythrilArmor(MYTHRIL_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Scm.MOD_ID, "mythril_boots"), new MythrilArmor(MYTHRIL_ARMOR, EquipmentSlot.FEET));


    }
}
