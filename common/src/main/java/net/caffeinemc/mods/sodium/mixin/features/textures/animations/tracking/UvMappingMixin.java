package net.caffeinemc.mods.sodium.mixin.features.textures.animations.tracking;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.UvMapping;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(UvMapping.class)
public interface UvMappingMixin {
    /**
     * In 26.3 {@code wrap(VertexConsumer)} moved from {@link TextureAtlasSprite} to a default method on the
     * {@link UvMapping} interface (it still builds a {@code SpriteCoordinateExpander} around the sprite). Hook it
     * at HEAD to mark the sprite as active whenever it is wrapped for immediate-mode rendering, as before. The
     * default is inherited by a few non-sprite {@link UvMapping} implementors, so guard the cast with instanceof.
     */
    @Inject(method = "wrap", at = @At("HEAD"))
    private void markSpriteAsActive(VertexConsumer consumer, CallbackInfoReturnable<VertexConsumer> cir) {
        if ((Object) this instanceof TextureAtlasSprite sprite) {
            SpriteUtil.INSTANCE.markSpriteActive(sprite);
        }
    }
}
