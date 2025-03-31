package io.papermc.generator.types.goal;

import com.squareup.javapoet.ClassName;
import net.minecraft.resources.ResourceLocation;

public record GoalKey(ClassName entityClassName, ResourceLocation key) {
}
