package net.caffeinemc.mods.sodium.mixin.core;

import com.mojang.renderpearl.backend.vulkan.VulkanRenderPass;
import com.mojang.renderpearl.backend.vulkan.VulkanRenderPipeline;
import org.lwjgl.vulkan.VkCommandBuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(VulkanRenderPass.class)
public interface VulkanRenderPassAccessor {
    @Accessor("pipeline")
    VulkanRenderPipeline sodium$getPipeline();

    @Invoker("commandBuffer")
    VkCommandBuffer sodium$getCommandBuffer();
}
