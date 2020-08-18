package com.company.students;

public class Group {
    private String FMS, EMS, SNS, GDS, SSR;

    public Group(String FMS, String EMS, String SNS, String GDS, String SSR) {
        this.FMS = FMS;
        this.EMS = EMS;
        this.SNS = SNS;
        this.GDS = GDS;
        this.SSR = SSR;
    }

    public String getFMS() {
        return FMS;
    }

    public void setFMS(String FMS) {
        this.FMS = FMS;
    }

    public String getEMS() {
        return EMS;
    }

    public void setEMS(String EMS) {
        this.EMS = EMS;
    }

    public String getSNS() {
        return SNS;
    }

    public void setSNS(String SNS) {
        this.SNS = SNS;
    }

    public String getGDS() {
        return GDS;
    }

    public void setGDS(String GDS) {
        this.GDS = GDS;
    }

    public String getSSR() {
        return SSR;
    }

    public void setSSR(String SSR) {
        this.SSR = SSR;
    }
}
