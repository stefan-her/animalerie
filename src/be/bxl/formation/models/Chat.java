package be.bxl.formation.models;

public class Chat extends Animal {

    final private int COEFFICIENT = 5;
    final private double PROB_DECE = 0.5;
    final private String CRI = "Miaou";

    private int energie;
    private int farouche;
    private int calin;
    private boolean longPoil;
    private boolean griffes;


    public Chat(String nom, double poid, double taille, String sexe, int age,
                int energie, int farouche, int calin, boolean longPoil, boolean griffes) {
        super(nom, poid, taille, sexe, age);
        setEnergie(energie);
        setFarouche(farouche);
        setCalin(calin);
        setLongPoil(longPoil);
        setGriffes(griffes);
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

    public void crier() {}

}
