/*
    Commentaires
*/
package polytech.com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("*****Test de nombre Premier*****");
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
                System.out.println("Premier\n");
            else
                System.out.println("Pas premier\n");
        }

        // Le cas Zero n'est pas géré. OSF
    }

}