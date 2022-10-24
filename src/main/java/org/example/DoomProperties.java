package org.example;

public class DoomProperties {
    private String getUserHome(){
        return System.getProperty("user.home");
    }
    private String getEngineFolder() {
        return this.getUserHome() + "/gzdoom";
    }
    public String getEngine(){
        return this.getEngineFolder() + "/gzdoom";
    }
    public String getDoomFolder() {
        return this.getUserHome() + "/Doom";
    }
    public String getMapsFolder() {
        return this.getDoomFolder() + "/Maps";
    }

    public String getModsFolder() {
        return this.getDoomFolder() + "/Mods";
    }
    private String getWadsFolder() {
        return this.getDoomFolder() + "/WADS";
    }
    public String getDoom2Wad() {
        return this.getWadsFolder() + "/DOOM2.WAD";
    }
}
