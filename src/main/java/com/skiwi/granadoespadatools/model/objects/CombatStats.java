package com.skiwi.granadoespadatools.model.objects;

/**
 * @author Frank van Heeswijk
 */
public class CombatStats {
    private final int STR;
    private final int AGI;
    private final int HP;
    private final int DEX;
    private final int INT;
    private final int SEN;

    private final int AR;
    private final int ATK;
    private final int ACC;
    private final int SPD;
    private final int CRI;
    private final int IDE;
    private final int PPE;
    private final int FPE;
    private final int IPE;
    private final int LPE;
    private final int MPE;

    private final int DR;
    private final int DEF;
    private final int EVA;
    private final int BLK;
    private final int IMM;
    private final int FRE;
    private final int IRE;
    private final int LRE;
    private final int MRE;
    private final int ADD;
    private final int MSPD;

    CombatStats(int STR, int AGI, int HP, int DEX, int INT, int SEN, int AR, int ATK, int ACC, int SPD, int CRI, int IDE, int PPE, int FPE, int IPE, int LPE, int MPE, int DR, int DEF, int EVA, int BLK, int IMM, int FRE, int IRE, int LRE, int MRE, int ADD, int MSPD) {
        this.STR = STR;
        this.AGI = AGI;
        this.HP = HP;
        this.DEX = DEX;
        this.INT = INT;
        this.SEN = SEN;
        this.AR = AR;
        this.ATK = ATK;
        this.ACC = ACC;
        this.SPD = SPD;
        this.CRI = CRI;
        this.IDE = IDE;
        this.PPE = PPE;
        this.FPE = FPE;
        this.IPE = IPE;
        this.LPE = LPE;
        this.MPE = MPE;
        this.DR = DR;
        this.DEF = DEF;
        this.EVA = EVA;
        this.BLK = BLK;
        this.IMM = IMM;
        this.FRE = FRE;
        this.IRE = IRE;
        this.LRE = LRE;
        this.MRE = MRE;
        this.ADD = ADD;
        this.MSPD = MSPD;
    }

    public int getSTR() {
        return STR;
    }

    public int getAGI() {
        return AGI;
    }

    public int getHP() {
        return HP;
    }

    public int getDEX() {
        return DEX;
    }

    public int getINT() {
        return INT;
    }

    public int getSEN() {
        return SEN;
    }

    public int getAR() {
        return AR;
    }

    public int getATK() {
        return ATK;
    }

    public int getACC() {
        return ACC;
    }

    public int getSPD() {
        return SPD;
    }

    public int getCRI() {
        return CRI;
    }

    public int getIDE() {
        return IDE;
    }

    public int getPPE() {
        return PPE;
    }

    public int getFPE() {
        return FPE;
    }

    public int getIPE() {
        return IPE;
    }

    public int getLPE() {
        return LPE;
    }

    public int getMPE() {
        return MPE;
    }

    public int getDR() {
        return DR;
    }

    public int getDEF() {
        return DEF;
    }

    public int getEVA() {
        return EVA;
    }

    public int getBLK() {
        return BLK;
    }

    public int getIMM() {
        return IMM;
    }

    public int getFRE() {
        return FRE;
    }

    public int getIRE() {
        return IRE;
    }

    public int getLRE() {
        return LRE;
    }

    public int getMRE() {
        return MRE;
    }

    public int getADD() {
        return ADD;
    }

    public int getMSPD() {
        return MSPD;
    }
}
