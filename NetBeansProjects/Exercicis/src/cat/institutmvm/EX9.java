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
//Pre: Llegim un numero introduit per teclat
public class EX9 {

    private static final String MSG_1 = "Introdueix un nombre";

    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        if (num1 >= 5 && num1 <= 50) {
            System.out.println("Es troba dins l'interval");
        } else {
            System.out.println("No es troba dins de l'interval");
        }
    }
}
//Post: Ens mostra si l'interval es troba dins de 5 fins 50
