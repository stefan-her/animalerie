package be.bxl.formation.models;

public class Animal {

    private String nom;
    private double poid;
    private double taille;
    private String sexe;
    private int age;

    private int coefficient;
    private double  probDeces;

    public void Animal() {}

    public int getCoefficient() {
        return coefficient;
    }

    public double getProbDeces() {
        return probDeces;
    }

    public String getNom() {
        return nom;
    }

    public double getPoid() {
        return poid;
    }

    public double getTaille() {
        return taille;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public void setProbDeces(double probDeces) {
        this.probDeces = probDeces;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getAgeHumain(int age, int coefficient) {
        return (age * coefficient);
    }
}
