package com.example.apreu1;

public class reunion {
    String reunions[];
    String heures[];
    String salles[];
    String mails[];

    public reunion(String[] reunions, String[] heures, String[] salles, String[] mails) {
        this.reunions = reunions;
        this.heures = heures;
        this.salles = salles;
        this.mails = mails;
    }

    public String[] getReunions() {
        return reunions;
    }

    public void setReunions(String[] reunions) {
        this.reunions = reunions;
    }

    public String[] getHeures() {
        return heures;
    }

    public void setHeures(String[] heures) {
        this.heures = heures;
    }

    public String[] getSalles() {
        return salles;
    }

    public void setSalles(String[] salles) {
        this.salles = this.salles;
    }

    public String[] getMails() {
        return mails;
    }

    public void setMails(String[] mails) {
        this.mails = mails;
    }
}
