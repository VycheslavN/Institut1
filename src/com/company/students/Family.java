package com.company.students;

public class Family {

    private String Ivanov, Petrov, Sidorov, Vasechkin, Ronaldo;

    public Family(String Ivanov, String Petrov, String Sidorov, String Vasechkin, String Ronaldo) {
        this.Ivanov = Ivanov;
        this.Petrov = Petrov;
        this.Sidorov = Sidorov;
        this.Vasechkin = Vasechkin;
        this.Ronaldo = Ronaldo;
    }

    public String getIvanov() {
        return Ivanov;
    }

    public void setIvanov(String ivanov) {
        Ivanov = ivanov;
    }

    public String getPetrov() {
        return Petrov;
    }

    public void setPetrov(String petrov) {
        Petrov = petrov;
    }

    public String getSidorov() {
        return Sidorov;
    }

    public void setSidorov(String sidorov) {
        Sidorov = sidorov;
    }

    public String getVasechkin() {
        return Vasechkin;
    }

    public void setVasechkin(String vasechkin) {
        Vasechkin = vasechkin;
    }

    public String getRonaldo() {
        return Ronaldo;
    }

    public void setRonaldo(String ronaldo) {
        Ronaldo = ronaldo;
    }
}