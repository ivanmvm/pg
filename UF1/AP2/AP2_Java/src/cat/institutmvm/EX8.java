/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/*  
    Nom: Ivan
    Cognoms: Saez Serra
    INS Manuel Vázquez Montalbán
    Data d'edició: 28/10/22
    Nom del Cicle Formatiu: Disseny d'Aplicació Web (DAW)
    Nom del mòdul: Programació
*/

public class EX8 {

    private static final String MSG_1 = "Intodueix un número enter: ";
    private static final String MSG_2 = "Indica quants números vols introduir: ";
    private static final String MSG_3 = "Gràcies per utilitzar aquest programa.";

    public static void main(String[] args) {
        //EX8_a
        int num, quantitat, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while (num != 0) {
            num = sc.nextInt();
        }
        //EX8_b
        System.out.println(MSG_2);
        quantitat = sc.nextInt();
        System.out.println(MSG_1 + quantitat + "num");
        num = sc.nextInt();
        System.out.println(MSG_2);
        while (i < quantitat) {
            i++;
            num = sc.nextInt();
            System.out.println(MSG_1);
        }
        System.out.println(MSG_3);
        }
    }