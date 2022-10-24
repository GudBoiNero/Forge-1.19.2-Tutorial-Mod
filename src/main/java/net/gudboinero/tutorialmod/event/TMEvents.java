package net.gudboinero.tutorialmod.event;

import net.gudboinero.tutorialmod.TutorialMod;
import net.minecraftforge.fml.common.Mod;

public class TMEvents {
    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
    public static class ForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {

    }
}
