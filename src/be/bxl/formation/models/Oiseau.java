package be.bxl.formation.models;

import java.util.ArrayList;

public class Oiseau extends Animal {

    private ArrayList<String> couleurs;
    private boolean typeCage;

    public void Oiseau() {
        setCoefficient(10);
        setProbDeces(35);
        this.couleurs = new ArrayList<>();
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

    public void crier() {

    }
}
