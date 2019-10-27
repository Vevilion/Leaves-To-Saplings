package com.vevy.leavestosaplings;

import com.vevy.leavestosaplings.item.WoodenShears;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("leavestosaplings:wooden_shears")
    public static WoodenShears woodenShears;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        woodenShears.initModel();
    }
}
