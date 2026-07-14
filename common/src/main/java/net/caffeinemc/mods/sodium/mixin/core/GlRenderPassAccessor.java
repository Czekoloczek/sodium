package net.caffeinemc.mods.sodium.mixin.core;

import com.mojang.renderpearl.backend.opengl.GlRenderPipeline;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets = "com.mojang.renderpearl.backend.opengl.GlRenderPass")
public interface GlRenderPassAccessor {
    @Accessor
    GlRenderPipeline getPipeline();
}
