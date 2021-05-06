package be.bxl.formation.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Oiseau extends Animal {

    final private int COEFFICIENT_VIE_HUMAIN = 10;
    final private double PROB_DECE = 3;
    final private String CRI = "TchipTchip";

    private String couleur;
    private boolean typeCage;

    public Oiseau(String nom, double poid, double taille, boolean sexe, int age,
                  String couleur, boolean typeCage) {
        super(nom, poid, taille, sexe, age);
        setCouleur(couleur);
        setTypeCage(typeCage);
    }

    public Oiseau(HashMap<String, String> animal) {
        this(
                (String) animal.get("nom"),
                (double) Double.parseDouble(animal.get("poid")),
                (double) Double.parseDouble(animal.get("taille")),
                (boolean) Boolean.parseBoolean(animal.get("sexe")),
                (int) Integer.parseInt(animal.get("age")),
                (String) animal.get("couleur"),
                (boolean) Boolean.parseBoolean(animal.get("typeCage"))
        );
    }

    public String getCouleur() {
        return couleur;
    }

    public String getTypeCage() {
        return (this.typeCage) ? "Cage" : "Volière";
    }

    public int getAgeHumain() {
        return (getAge() * COEFFICIENT_VIE_HUMAIN);
    }

    public double getProbDeces() {
        return PROB_DECE;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setTypeCage(boolean typeCage) {
        this.typeCage = typeCage;
    }

    public void crier() {
        System.out.println(CRI);
    }
}
