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
public class EX_Dilluns {

    private static final String MSG_1 = "El resultat de la divisió és:";
    private static final String MSG_2 = "Ingresa dos nombres";
    private static final String MSG_3 = "Número no vàlid, proba una altra vegada";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_2);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        while (num2 == 0) {
            System.out.println(MSG_3);
            num2 = sc.nextInt();
        }
        System.out.println(MSG_1 + num1 / num2);
    }
}
