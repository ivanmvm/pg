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
public class EX18 {

    private static final String MSG_1 = "Introdueix un número per convertir en valor absolut: ";
    private static final String MSG_2 = "El valor absolut és: ";

    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num1 = sc.nextInt();

        if (num1 < 0) {
            num1 = (num1 * -1);
        }
        System.out.println(MSG_2 + num1);
    }
}
