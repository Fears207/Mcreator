
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projetlibresec.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.projetlibresec.block.PurestStoneBlock;
import net.mcreator.projetlibresec.block.PureStoneBlock;
import net.mcreator.projetlibresec.ProjetlibresecMod;

public class ProjetlibresecModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ProjetlibresecMod.MODID);
	public static final DeferredBlock<Block> PURE_STONE = REGISTRY.register("pure_stone", PureStoneBlock::new);
	public static final DeferredBlock<Block> PUREST_STONE = REGISTRY.register("purest_stone", PurestStoneBlock::new);
	public static final DeferredBlock<Block> PORTAL_TEXTURE = REGISTRY.register("portal_texture", PortalTextureBlock::new);
	public static final DeferredBlock<Block> VALORIA_PORTAL = REGISTRY.register("valoria_portal", ValoriaPortalBlock::new);
	public static final DeferredBlock<Block> PORTAL_BLOCK = REGISTRY.register("portal_block", PortalBlockBlock::new);
	public static final DeferredBlock<Block> AIRBLOCK = REGISTRY.register("airblock", AirblockBlock::new);
	public static final DeferredBlock<Block> PORTAL_FRAME = REGISTRY.register("portal_frame", PortalFrameBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
