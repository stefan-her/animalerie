package be.bxl.formation.models;

public class Chat extends Animal {

    private int energie;
    private int farouche;
    private int calin;
    private boolean longPoil;
    private boolean griffes;

    public void Chat() {
        setCoefficient(5);
        setProbDeces(0.5);
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

    public void crier() {

    }
}
