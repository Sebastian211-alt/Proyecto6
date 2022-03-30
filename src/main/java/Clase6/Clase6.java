/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase6;

/**
 *
 * @author SebasTati
 */
public class Clase6 {

    public static void main(String[] args) {

        int c = 0, num, cp = 0;

        /*
        
        num = 6;

        for (int j = 1; j <= 6; j++) {
            if (num % j == 0) {
                c++;
            }
        }

        if (c == 2) {
            System.out.println("ES PRIMO");
        } else {
            System.out.println("NO ES PRIMO"); 
        }
        
        */
        
        int cnp = 0;
        System.out.println("Ciclo For");

        for (int i = 1; i <= 100; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }

                if (c == 2) {
                    cp++;
                } else {
                    cnp++;

                    System.out.println(" " + c);
                    c = 0;
                }
            }
            System.out.println();
            System.out.println("Total primos: " + cp++);
            System.out.println("Total no primos: " + cnp++);

        }
    }

}
