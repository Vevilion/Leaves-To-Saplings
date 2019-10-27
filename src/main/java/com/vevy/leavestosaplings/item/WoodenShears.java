package com.vevy.leavestosaplings.item;

import com.vevy.leavestosaplings.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemShears;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WoodenShears extends ItemShears {

    public WoodenShears(){
        setRegistryName("wooden_shears");
        setMaxStackSize(1);
        setMaxDamage(16);
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName(Reference.MOD_ID + ".wooden_shears");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}

