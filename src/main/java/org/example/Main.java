package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)
    {
        DoomProperties dp = new DoomProperties();
        GameProperties gp = new GameProperties();
        ModProperties mp = new ModProperties();
        MapProperties mapp = new MapProperties();

        String engine = dp.getEngine();
        String drla = gp.getDRLAMod();
        String drlm = gp.getDRLMMod();
//        String drlax = gp.getDRLAXMod();  // This is mod is not used with DoomRPG
        String drpg = gp.getDoomRPGMod();
        String drpgBr = gp.getDoomRPGBrightmapsMod();
        String drpgdDrla = gp.getDoomDRLAPatchMod();
        String drpgDrlm = gp.getDoomDRLMPatchMod();
        String drpgEx = gp.getDoomRPGExtrasMod();
        String wad = dp.getDoom2Wad();
        String cCards = mp.getCorruptionCardsMod();
        String music = mp.getDoomMetalVol6Mod();
        String sm4 = mp.getSm4BBgorev3Mod();
        String nukebarrel = mp.getNukebarrelMod();
        String map = mapp.getDoomMap();

        String cmd = engine + " " +
                "-iwad " +
                wad + " " +
                "-file " +
                map + " " +
                drla + " " +
                drlm + " " +
//                drlax + " " +  // This is mod is not used with DoomRPG
                drpg + " " +
                drpgBr + " " +
                drpgdDrla + " " +
                drpgDrlm + " " +
                drpgEx + " " +
                cCards + " " +
                music + " " +
                sm4 + " " +
                nukebarrel;

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", cmd);

        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
                System.exit(0);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}