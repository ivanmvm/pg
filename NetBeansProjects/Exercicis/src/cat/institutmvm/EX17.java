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
public class EX17 {

    private static final String MSG_1 = "Introdueix un numero menor que cero: ";
    private static final String MSG_2 = "El numero ";
    private static final String MSG_4 = "Es múltiple del número ";
    private static final String MSG_5 = "No es múltiple del número ";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(MSG_1);
            num1 = sc.nextInt();
        } while (num1 < 1);

        do {
            System.out.println(MSG_1);
            num2 = sc.nextInt();
        } while (num2 < 1);

        if (num1 % num2 == 0) {
            System.out.println(MSG_2 + num1 + MSG_4 + num2);
        } else {
            System.out.println(MSG_2 + num1 + MSG_5 + num2);
        }
    }
}
