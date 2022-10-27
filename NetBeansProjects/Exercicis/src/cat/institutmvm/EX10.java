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
//Exercici A
//Pre:
public class EX10 {

    private static final String MSG_1 = "Introdueix un nombre";
    private static final String MSG_2 = "Es troba fora de l'interval, proba altra vegada";
    private static final String MSG_3 = "Es troba dins l'interval";
    private static final String MSG_4 = "Has excedit els 3 intents posibles";

    public static void main(String[] args) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextInt();
        while ((num < 1 || num > 100) && count < 2) {
            System.out.println(MSG_2);
            num = sc.nextInt();
            count++;
        }
        if (count == 2) {
            System.out.println(MSG_4);
        } else {
            System.out.println(MSG_3);
        }
    }
}
//Post:
