/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author ibra
 */
public class ConectaCuatro {

    private int tabla[][] = new int[6][7];
    Scanner sc = new Scanner(System.in);

    public void ponerCeros() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tabla[i][j] = 0;

            }
        }

    }

    public int getTabla(int i, int j) {

        return tabla[i][j];

    }
  int ficha = 1;

    void actuar(int x, int i, int y) {
        


        if (tabla[x + 5][i] == 0) {
            tabla[x + 5][i] = y;
        } else if (tabla[x + 4][i] == 0) {
            tabla[x + 4][i] = y;
        } else if (tabla[x + 3][i] == 0) {
            tabla[x + 3][i] = y;
        } else if (tabla[x + 2][i] == 0) {
            tabla[x + 2][i] = y;
        } else if (tabla[x + 1][i] == 0) {
            tabla[x + 1][i] = y;
        } else if (tabla[x][i] == 0) {
            tabla[x][i] = y;
        }

    }
  
    public void tablah() {
        int i;
        int j;
        for (i = 0; i < 6; i++) {

            for (j = 0; j < 7; j++) {
                System.out.print(tabla[i][j] + " ");

            }
            System.out.println("");

        }
    }
}
