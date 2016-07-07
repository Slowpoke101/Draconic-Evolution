package com.brandon3055.draconicevolution.items.tools;

import net.minecraft.item.ItemStack;

/**
 * Created by brandon3055 on 5/06/2016.
 */
public class DraconicSword extends WyvernSword {
    public DraconicSword() {
        super(ToolStats.DRA_SWORD_ATTACK_DAMAGE, ToolStats.DRA_SWORD_ATTACK_SPEED);
        setEnergyStats(ToolStats.DRACONIC_BASE_CAPACITY, 8000000, 0);
    }

    @Override
    public int getMaxUpgradeLevel(ItemStack stack) {
        return 3;
    }

    @Override
    public int getToolTier(ItemStack stack) {
        return 1;
    }
}