package com.kishinskii.doomlauncher;

import com.kishinskii.doomlauncher.games.Doom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> mods = new ArrayList<>();
       mods.add("asdf");
       mods.add("rewq");

        Doom doom = new Doom();
        doom.setMods(mods);
        doom.run();
    }
}
