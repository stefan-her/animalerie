package be.bxl.formation.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animalerie {

    private ArrayList<Animal> listAnimaux;
    private HashMap<String, String> animal;

    public Animalerie() {
        listAnimaux = new ArrayList<>();
    }

    public void add() {
        Scanner sc = new Scanner(System.in);

        boolean add = true;
        do {
            animal = new HashMap<>();
            System.out.println("Ajouter un animal (c = 'Chat', d = 'chien', b = 'oiseau', q = 'Quitter')");
            String choix = sc.nextLine();

            switch (choix) {
                case "c" :
                    ajouterChat();
                    break;
                case "d" :
                    ajouterChien();
                    break;
                case "b" :
                    ajouterOiseau();
                    break;
                case "q" :
                    System.out.println("Quitter les insertions");
                    add = false;
                    break;
            }
        } while(add);
    }

    private void ajouterAnimal() {
        Scanner sc = new Scanner(System.in);
        String test = "";

        System.out.println("nom:");
        test = sc.nextLine().trim();
        if(test != "") animal.put("nom", test);
        else animal.put("nom", "");

        System.out.println("poid:");
        test = sc.nextLine();
        if(test.matches("^[0-9]+$")) animal.put("poid", test);
        else animal.put("poid", "0");

        System.out.println("taille:");
        test = sc.nextLine();
        if(test.matches("^[0-9]+$")) animal.put("taille", test);
        else animal.put("taille", "0");

        System.out.println("sexe (m/f):");
        test = sc.nextLine();
        if(test.equals("m"))  animal.put("sexe", "true");
        else animal.put("sexe", "false");

        System.out.println("âge:");
        test = sc.nextLine();
        if(test.matches("^[0-9]+$")) animal.put("age", test);
        else animal.put("age", "0");
    }

    private void ajouterChat() {
        Scanner sc = new Scanner(System.in);
        String test = "";

        System.out.println("Ajouter un Chat");
        ajouterAnimal();

        System.out.println("energie (0/9)");
        test = sc.nextLine();
        if(test.matches("^[0-9]$")) animal.put("energie", test);
        else animal.put("energie", "0");

        System.out.println("farouche (0/10)");
        test = sc.nextLine();
        if(test.matches("^[0-9]$")) animal.put("farouche", test);
        else animal.put("farouche", "0");

        System.out.println("calin (0/10)");
        test = sc.nextLine();
        if(test.matches("^[0-9]$")) animal.put("calin", test);
        else animal.put("calin", "0");

        System.out.println("long poil (y/n)");
        test = sc.nextLine();
        if(test.equals("y")) animal.put("longPoil", "1");
        else animal.put("longPoil", "0");

        System.out.println("griffes (y/n)");
        test = sc.nextLine();
        if(test.equals("y")) animal.put("griffes", "true");
        else animal.put("griffes", "false");

        Chat item = new Chat(getAnimal());
        listAnimaux.add(item);
    }

    private void ajouterChien() {
        Scanner sc = new Scanner(System.in);
        String test = "";

        System.out.println("Ajouter un Chien");
        ajouterAnimal();

        System.out.println("couleur collier");
        test = sc.nextLine();
        if(test.trim() != "") animal.put("couleurCollier", test);
        else animal.put("couleurCollier", "");

        System.out.println("dressé (y/n)");
        test = sc.nextLine();
        if(test.equals("y")) animal.put("dresse", "true");
        else animal.put("dresse", "false");

        System.out.println("race");
        test = sc.nextLine();
        if(test.trim() != "") animal.put("race", test);
        else animal.put("race", "");

        Chien item = new Chien(getAnimal());
        listAnimaux.add(item);
    }
    private void ajouterOiseau() {
        Scanner sc = new Scanner(System.in);
        String test = "";

        System.out.println("Ajouter un Oiseau");
        ajouterAnimal();

        System.out.println("couleur");
        test = sc.nextLine();
        if(test.trim() != "") animal.put("couleur", test);
        else animal.put("couleur", "");

        System.out.println("type cage (c = cage / v = volière)");
        test = sc.nextLine();
        if(test.equals("c")) animal.put("typeCage", "true");
        else animal.put("typeCage", "false");

        Oiseau item = new Oiseau(getAnimal());
        listAnimaux.add(item);
    }

    public HashMap<String, String> getAnimal() {
        return animal;
    }

    public ArrayList<Animal> getListAnimaux() {
        return listAnimaux;
    }

    public void afficherTout() {
        String textPattern = "Animal : %s,  nom : %s sexe : %s, age : %d, age humain: %d, Vivant ou mort : %s";

        for (Animal obj : listAnimaux) {
            String animal = obj.getClass().getSimpleName();
            String nom = obj.getNom();
            String sexe = obj.getSexe();
            int age = obj.getAge();
            int ageHumain = obj.getAgeHumain();
            String vivantOuMort = (obj.getVieMort()) ? "Vivant" : "Mort";
            String text = String.format(textPattern, animal, nom, sexe, age, ageHumain, vivantOuMort);
            System.out.println("-> " + text);
        }
    }

    public int afficherNbs() {
        return listAnimaux.size();
    }

    public void enleverMort() {
        for (int i = listAnimaux.size() -1; i >= 0 ; i--) {
            if(!listAnimaux.get(i).getVieMort()) {
                listAnimaux.remove(i);
            }
        }

    }
}
