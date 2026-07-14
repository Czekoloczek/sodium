package net.caffeinemc.mods.sodium.mixin.core;

import com.mojang.renderpearl.api.commands.RenderPass;
import com.mojang.renderpearl.backend.api.RenderPassBackend;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RenderPass.class)
public interface RenderPassAccessor {
    @Accessor
    RenderPassBackend getBackend();
}
