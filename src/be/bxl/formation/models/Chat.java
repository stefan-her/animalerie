package be.bxl.formation.models;

import javax.naming.CannotProceedException;
import java.util.HashMap;
import java.util.Locale;

public class Chat extends Animal {

    final private int COEFFICIENT_VIE_HUMAIN = 5;
    final private double PROB_DECE = 0.5;
    final private String CRI = "Miaou";

    private int energie;
    private int farouche;
    private int calin;
    private boolean longPoil;
    private boolean griffes;

    public Chat(String nom, double poid, double taille, boolean sexe, int age,
                int energie, int farouche, int calin, boolean longPoil, boolean griffes) {
        super(nom, poid, taille, sexe, age);
        setEnergie(energie);
        setFarouche(farouche);
        setCalin(calin);
        setLongPoil(longPoil);
        setGriffes(griffes);
    }

    public Chat(HashMap<String, String> animal) {
        this(
                (String) animal.get("nom"),
                (double) Double.parseDouble(animal.get("poid")),
                (double) Double.parseDouble(animal.get("taille")),
                (boolean) Boolean.parseBoolean(animal.get("sexe")),
                (int) Integer.parseInt(animal.get("age")),
                (int) Integer.parseInt(animal.get("energie")),
                (int) Integer.parseInt(animal.get("farouche")),
                (int) Integer.parseInt(animal.get("calin")),
                (boolean) Boolean.parseBoolean(animal.get("longPoil")),
                (boolean) Boolean.parseBoolean(animal.get("griffes"))
        );
    }

    public int getEnergie() {
        return energie;
    }

    public int getFarouche() {
        return farouche;
    }

    public int getCalin() {
        return calin;
    }

    public boolean getLongPoil() {
        return longPoil;
    }

    public boolean getGriffes() {
        return griffes;
    }

    public int getAgeHumain() {
        return (getAge() * COEFFICIENT_VIE_HUMAIN);
    }

    public double getProbDeces() {
        return PROB_DECE;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public void setFarouche(int farouche) {
        this.farouche = farouche;
    }

    public void setCalin(int calin) {
        this.calin = calin;
    }

    public void setLongPoil(boolean longPoil) {
        this.longPoil = longPoil;
    }

    public void setGriffes(boolean griffes) {
        this.griffes = griffes;
    }

    public void crier() {
        System.out.println(CRI);
    }



}
