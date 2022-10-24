package org.example;

public class GameProperties extends DoomProperties {

    private String getDoomRPGFolder() {
        return  this.getDoomFolder() + "/DoomRPG";
    }

    public String getDoomRPGMod(){
        return this.getDoomRPGFolder() + "/DoomRPG";
    }

    public String getDoomRPGBrightmapsMod(){
        return this.getDoomRPGFolder() + "/DoomRPG-Brightmaps";
    }

    public String getDoomDRLAPatchMod(){
        return this.getDoomRPGFolder() + "/DoomRPG-RLArsenal";
    }

    public String getDoomDRLMPatchMod(){ return this.getDoomRPGFolder() + "/DoomRPG-RLMonsters";}

    public String getDoomRPGExtrasMod(){
        return this.getDoomRPGFolder() + "/DoomRPG-Extras";
    }
    private String getDoomRLAFolder() {
        return this.getDoomFolder() + "/DoomRLA";
    }
    public String getDRLAMod() {
        return this.getDoomRLAFolder() + "/DoomRL_Arsenal_1.1.5.pk3";
    }
    public String getDRLMMod() {
        return this.getDoomRLAFolder() + "/DoomRL_Monsters_Beta_7.3.pk3";
    }
    public String getDRLAXMod() {
        return this.getDoomRLAFolder() + "/DRLAX_0.9beta.pk3";
    }
}
