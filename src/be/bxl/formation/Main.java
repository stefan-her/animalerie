package be.bxl.formation;

import be.bxl.formation.models.Animalerie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animalerie spa = new Animalerie();
        spa.add();

        System.out.println("nombre d'animaux dans l' Animalerie : " + spa.afficherNbs());
        System.out.println("Liste des animaux:");
        spa.afficherTout();


/*
        System.out.println("Nombre de jour à surveiller");
        int nbNuit = Integer.parseInt(sc.nextLine());
        int i = 1;
        do {


        } while(i <= nbNuit);

*/

    }
}
