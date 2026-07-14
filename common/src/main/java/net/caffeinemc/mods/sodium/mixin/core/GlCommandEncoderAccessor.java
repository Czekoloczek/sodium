package net.caffeinemc.mods.sodium.mixin.core;

import com.mojang.renderpearl.backend.opengl.GlProgram;
import com.mojang.renderpearl.api.pipeline.RenderPipeline;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(targets = "com.mojang.renderpearl.backend.opengl.GlCommandEncoder")
public interface GlCommandEncoderAccessor {
    @Invoker("applyPipelineState")
    void sodium$applyPipelineState(RenderPipeline pipeline);

    @Accessor("lastProgram")
    void sodium$setLastProgram(GlProgram program);
}
