package com.eliezer666;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = "eliezer666",
    name = "Eliezer666",
    version = "1.0"
)
public class Eliezer666Mod {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("O Observador despertou...");
    }
}
