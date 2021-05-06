package be.bxl.formation.models;

public class Chien extends Animal {

    private String couleurCollier;
    private boolean dresse;
    private String race;


    public void Chien() {
        setCoefficient(7);
        setProbDeces(1);
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

    public void crier() {

    }
}
