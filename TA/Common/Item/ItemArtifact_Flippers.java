package TA.Common.Item;

import TA.Utils.TAUtils;
import am2.api.IExtendedProperties;
import DummyCore.Utils.MathUtils;
import DummyCore.Utils.MiscUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockIce;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArtifact_Flippers extends ItemArtifact{

	public ItemArtifact_Flippers(String par1) {
		super(par1);
	}
	
	@Override
	public String getSpeedModifierName(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		return "00017";
	}

	@Override
	public float getSpeedModifierValue(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		return 0.5F;
	}
	
	@Override
	public void onArtUpdate(ItemStack par1ItemStack, EntityPlayer p) {
		Block b = MiscUtils.getBlock(p.worldObj, (int)p.posX, (int)p.posY, (int)p.posZ);
		if(b != null && b.blockMaterial == Material.water)
		{
			TAUtils.applySpeedModifier(p, getSpeedModifierName(par1ItemStack), getSpeedModifierValue(par1ItemStack), false);
		}else
		{
			TAUtils.applySpeedModifier(p, getSpeedModifierName(par1ItemStack), getSpeedModifierValue(par1ItemStack), true);
		}
	}

}
