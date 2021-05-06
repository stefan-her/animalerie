package be.bxl.formation.models;

public class Animal {

    private String nom;
    private double poid;
    private double taille;
    private String sexe;
    private int age;

    public Animal(String nom, double poid, double taille, String sexe, int age) {
        setNom(nom);
        setPoid(poid);
        setTaille(taille);
        setSexe(sexe);
        setAge(age);
    }

    public int getCoefficient() {
        return 1;
    }

    public double getProbDeces() {
        return 1;
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

    public void crier() {}

    public int getAgeHumain() {
        return (getAge() * getCoefficient());
    }
}
