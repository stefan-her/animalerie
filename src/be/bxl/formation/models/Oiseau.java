package be.bxl.formation.models;

import java.util.ArrayList;

public class Oiseau extends Animal {

    final private int COEFFICIENT = 10;
    final private double PROB_DECE = 35;
    final private String CRI = "TchipTchip";

    private ArrayList<String> couleurs;
    private boolean typeCage;

    public Oiseau(String nom, double poid, double taille, String sexe, int age,
                  ArrayList couleurs, boolean typeCage) {
        super(nom, poid, taille, sexe, age);
        this.couleurs = new ArrayList<>();
        setCouleurs(couleurs);
        setTypeCage(typeCage);
    }

    public ArrayList<String> getCouleurs() {
        return couleurs;
    }

    public String getTypeCage() {
        return (this.typeCage) ? "Cage" : "Volière";
    }

    public void setCouleurs(ArrayList<String> couleurs) {
        this.couleurs = couleurs;
    }

    public void setTypeCage(boolean typeCage) {
        this.typeCage = typeCage;
    }

    public void crier() {}

}
