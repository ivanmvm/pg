/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class EX16 {

    private static final String MSG_1 = "Escriu un número natural";
    private static final String MSG_2 = "Torna a escriure un número natural";
    private static final String MSG_3 = "Número correcte";

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);

        for (int i = 0; i < 3; i++) {
            numero = sc.nextInt();
            if (numero <= 1) {
                System.out.println(MSG_2);
            } else {
                System.out.println(MSG_3);
            }
        }
    }
}
