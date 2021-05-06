package be.bxl.formation.models;

import java.util.HashMap;

public class Chien extends Animal {

    final private int COEFFICIENT_VIE_HUMAIN = 7;
    final private double PROB_DECE = 1;
    final private String CRI = "OuafWouaf";

    private String couleurCollier;
    private boolean dresse;
    private String race;


    public Chien(String nom, double poid, double taille, boolean sexe, int age,
                 String couleurCollier, boolean dresse, String race) {
        super(nom, poid, taille, sexe, age);
        setCouleurCollier(couleurCollier);
        setDresse(dresse);
        setRace(race);
    }

    public Chien(HashMap<String, String> animal) {
        this(
                (String) animal.get("nom"),
                (double) Double.parseDouble(animal.get("poid")),
                (double) Double.parseDouble(animal.get("taille")),
                (boolean) Boolean.parseBoolean(animal.get("sexe")),
                (int) Integer.parseInt(animal.get("age")),
                (String) animal.get("couleurCollier"),
                (boolean) Boolean.parseBoolean(animal.get("dresse")),
                (String) animal.get("race")
        );
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

    public int getAgeHumain() {
        return (getAge() * COEFFICIENT_VIE_HUMAIN);
    }

    public double getProbDeces() {
        return PROB_DECE;
    }

    public void setCouleurCollier(String couleurCollier) {
        this.couleurCollier = (couleurCollier.trim() != "") ? couleurCollier : null;
    }

    public void setDresse(boolean dresse) {
        this.dresse = dresse;
    }

    public void setRace(String race) {
        this.race = (race.trim() != "") ? race : null;
    }

    public void crier() {
        System.out.println(CRI);
    }

}
