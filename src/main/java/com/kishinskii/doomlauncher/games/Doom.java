package com.kishinskii.doomlauncher.games;

import com.kishinskii.doomlauncher.DoomProperties;
import com.kishinskii.doomlauncher.SubProccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Doom extends DoomProperties implements  Runnable{

    private static final String wad = doomRoot + "/wads/doom2.wad";

    private static String engine = "gzdoom";
    private static String map = "";
    private static List<String> mods  = new ArrayList<>();

    public static void setEngine(String engine) {
        Doom.engine = engine;
    }

    public void setMap(String map) {
        Doom.map = map;
    }

    public void setMods(List<String> mods) {
        Doom.mods = mods;
    }


    @Override
    public void run() {

        StringBuilder sb = new StringBuilder();
        for (String mod : mods) {
            sb.append(mod + " ");

        }
            String modList = sb.toString();


            SubProccess subProccess = new SubProccess();

            SubProccess.run(engine + " -iwad " + wad + " -file " + map + " " + modList);
        }
    }

