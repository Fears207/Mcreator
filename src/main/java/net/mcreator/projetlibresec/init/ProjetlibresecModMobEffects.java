
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projetlibresec.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.projetlibresec.potion.ZeustrailMobEffect;
import net.mcreator.projetlibresec.ProjetlibresecMod;

public class ProjetlibresecModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ProjetlibresecMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ZEUSTRAIL = REGISTRY.register("zeustrail", () -> new ZeustrailMobEffect());
}
