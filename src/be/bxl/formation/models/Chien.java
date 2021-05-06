package be.bxl.formation.models;

public class Chien extends Animal {

    final private int COEFFICIENT = 7;
    final private double PROB_DECE = 1;
    final private String CRI = "OuafWouaf";

    private String couleurCollier;
    private boolean dresse;
    private String race;


    public Chien(String nom, double poid, double taille, String sexe, int age,
                 String couleurCollier, boolean dresse, String race) {
        super(nom, poid, taille, sexe, age);
        setCouleurCollier(couleurCollier);
        setDresse(dresse);
        setRace(race);
    }

    public String getCouleurCollier() {
        return couleurCollier;
    }

    public boolean getDresse() {
        return dresse;
    }

    public String getRace() {
        return race;
    }

    public void setCouleurCollier(String couleurCollier) {
        this.couleurCollier = couleurCollier;
    }

    public void setDresse(boolean dresse) {
        this.dresse = dresse;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void crier() {}

}
