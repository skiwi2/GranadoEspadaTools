package com.skiwi.granadoespadatools.model.objects;

public class CombatStatsBuilder {
    private int str = 0;
    private int agi = 0;
    private int hp = 0;
    private int dex = 0;
    private int anInt = 0;
    private int sen = 0;
    private int ar = 0;
    private int atk = 0;
    private int acc = 0;
    private int spd = 0;
    private int cri = 0;
    private int ide = 0;
    private int ppe = 0;
    private int fpe = 0;
    private int ipe = 0;
    private int lpe = 0;
    private int mpe = 0;
    private int dr = 0;
    private int def = 0;
    private int eva = 0;
    private int blk = 0;
    private int imm = 0;
    private int fre = 0;
    private int ire = 0;
    private int lre = 0;
    private int mre = 0;
    private int add = 0;
    private int mspd = 0;

    public CombatStatsBuilder setSTR(int str) {
        this.str = str;
        return this;
    }

    public CombatStatsBuilder setAGI(int agi) {
        this.agi = agi;
        return this;
    }

    public CombatStatsBuilder setHP(int hp) {
        this.hp = hp;
        return this;
    }

    public CombatStatsBuilder setDEX(int dex) {
        this.dex = dex;
        return this;
    }

    public CombatStatsBuilder setINT(int anInt) {
        this.anInt = anInt;
        return this;
    }

    public CombatStatsBuilder setSEN(int sen) {
        this.sen = sen;
        return this;
    }

    public CombatStatsBuilder setAR(int ar) {
        this.ar = ar;
        return this;
    }

    public CombatStatsBuilder setATK(int atk) {
        this.atk = atk;
        return this;
    }

    public CombatStatsBuilder setACC(int acc) {
        this.acc = acc;
        return this;
    }

    public CombatStatsBuilder setSPD(int spd) {
        this.spd = spd;
        return this;
    }

    public CombatStatsBuilder setCRI(int cri) {
        this.cri = cri;
        return this;
    }

    public CombatStatsBuilder setIDE(int ide) {
        this.ide = ide;
        return this;
    }

    public CombatStatsBuilder setPPE(int ppe) {
        this.ppe = ppe;
        return this;
    }

    public CombatStatsBuilder setFPE(int fpe) {
        this.fpe = fpe;
        return this;
    }

    public CombatStatsBuilder setIPE(int ipe) {
        this.ipe = ipe;
        return this;
    }

    public CombatStatsBuilder setLPE(int lpe) {
        this.lpe = lpe;
        return this;
    }

    public CombatStatsBuilder setMPE(int mpe) {
        this.mpe = mpe;
        return this;
    }

    public CombatStatsBuilder setDR(int dr) {
        this.dr = dr;
        return this;
    }

    public CombatStatsBuilder setDEF(int def) {
        this.def = def;
        return this;
    }

    public CombatStatsBuilder setEVA(int eva) {
        this.eva = eva;
        return this;
    }

    public CombatStatsBuilder setBLK(int blk) {
        this.blk = blk;
        return this;
    }

    public CombatStatsBuilder setIMM(int imm) {
        this.imm = imm;
        return this;
    }

    public CombatStatsBuilder setFRE(int fre) {
        this.fre = fre;
        return this;
    }

    public CombatStatsBuilder setIRE(int ire) {
        this.ire = ire;
        return this;
    }

    public CombatStatsBuilder setLRE(int lre) {
        this.lre = lre;
        return this;
    }

    public CombatStatsBuilder setMRE(int mre) {
        this.mre = mre;
        return this;
    }

    public CombatStatsBuilder setADD(int add) {
        this.add = add;
        return this;
    }

    public CombatStatsBuilder setMSPD(int mspd) {
        this.mspd = mspd;
        return this;
    }

    public CombatStats createCombatStats() {
        return new CombatStats(str, agi, hp, dex, anInt, sen, ar, atk, acc, spd, cri, ide, ppe, fpe, ipe, lpe, mpe, dr, def, eva, blk, imm, fre, ire, lre, mre, add, mspd);
    }
}