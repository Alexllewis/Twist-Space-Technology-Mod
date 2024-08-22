package com.Nxer.TwistSpaceTechnology.recipe.specialRecipe.TCRecipes;

import net.minecraft.util.ResourceLocation;

import com.Nxer.TwistSpaceTechnology.common.GTCMItemList;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class TCBasic {

    public static Aspect EVOLUTION;

    public static void registerAspect() {
        EVOLUTION = new Aspect(
            "evolutio",
            0x4B0082,
            new Aspect[] { Aspect.LIFE, Aspect.EXCHANGE },
            new ResourceLocation("avaritia", "textures/misc/terminus.png"),
            771);
        ThaumcraftApi.registerObjectTag(
            GTCMItemList.OffSpring.get(1),
            new AspectList().add(EVOLUTION, 1)
                .add(Aspect.LIFE, 8)
                .add(Aspect.WATER, 32));
    }
}
