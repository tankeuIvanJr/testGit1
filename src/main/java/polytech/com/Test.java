/*
    Commentaires
*/
package polytech.com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("*****Test de nombre Premier*****");
        System.out.println("Hello dev tankeuIvanJr");
        System.out.println("Test Nombre Premier");

        while (true) {
            System.out.println("Entrer un nombre :");
            int nombre = new Scanner(System.in).nextInt();
            int d = 1;
            for (int i = 1; i < (nombre); i++) {

                if (nombre % i == 0) {
                    d = i;
                }
            }

            if (d == 1)
                System.out.println("est Premier\n");
            else
                System.out.println("N'est pas premier\n");
        }

        // Le cas Zero n'est pas géré. OSEF
    }

}