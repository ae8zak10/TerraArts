package TA.Common.Item;

import TA.Utils.TAUtils;
import am2.api.IExtendedProperties;
import DummyCore.Utils.MathUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArtifact_CobaltShield extends ItemArtifact{

	public ItemArtifact_CobaltShield(String par1) {
		super(par1);
	}
	
	@Override
	public String getSpeedModifierName(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		return "00012";
	}
	
	@Override
	public float getKnockbackModifierValue(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		return 1F;
	}

	@Override
	public float getSpeedModifierValue(ItemStack par1ItemStack) {
		// TODO Auto-generated method stub
		return 0F;
	}
	
	@Override
	public void onArtUpdate(ItemStack par1ItemStack, EntityPlayer p) {
		TAUtils.applyKnokbackModifier(p, getSpeedModifierName(par1ItemStack), getKnockbackModifierValue(par1ItemStack), false);
	}

}
