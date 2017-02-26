/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author ibra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConectaCuatro c = new ConectaCuatro();
        c.ponerCeros();
        System.out.println("0 1 2 3 4 5 6");
        System.out.println("_____________");
        c.tablah();
        System.out.println("_____________");
        int turno = 2;
        while (true) {

            if (turno == 2) {
                turno = 1;
            } else {
                turno = 2;
            }
            System.out.println(":Turno del jugador " + turno);
            int x = sc.nextInt();

            if (x < 7) {
                int i = 0;

                c.actuar(i, x, turno);
                System.out.println("0 1 2 3 4 5 6");
                System.out.println("_____________");
                c.tablah();
                System.out.println("_____________");
            } else {
                System.out.println("introduce un numero entre 0 y 6");
                if (turno == 1) {
                    turno = 2;
                } else {
                    turno = 1;
                }
            }

        }

    }
}
