package net.caffeinemc.mods.sodium.mixin.core;

import com.mojang.renderpearl.api.commands.CommandEncoder;
import com.mojang.renderpearl.backend.api.CommandEncoderBackend;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(CommandEncoder.class)
public interface CommandEncoderAccessor {
    @Accessor("backend")
    CommandEncoderBackend sodium$getBackend();
}
