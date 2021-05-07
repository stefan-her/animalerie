package be.bxl.formation.models;

public abstract class Animal {

    private String nom;
    private double poid;
    private double taille;
    private boolean sexe;
    private int age;
    private boolean vieMort;

    public Animal(String nom, double poid, double taille, boolean sexe, int age) {
        setNom(nom);
        setPoid(poid);
        setTaille(taille);
        setSexe(sexe);
        setAge(age);
        setVieMort(true);
    }

    public boolean getVieMort() {
        return vieMort;
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
        return (sexe) ? "mâle" : "femelle";
    }

    public int getAge() {
        return age;
    }

    public int getAgeHumain() { return 1; }

    public double getProbDeces() {
        return 1;
    }

    public void setVieMort(boolean vieMort) {
        this.vieMort = vieMort;
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

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void crier();

    public void testDeVie() {
        if(getVieMort()) {
            double rand = Math.round(Math.random() * 100);
            if(rand < this.getProbDeces()) {
                setVieMort(false);
            }
        }
    }


}
