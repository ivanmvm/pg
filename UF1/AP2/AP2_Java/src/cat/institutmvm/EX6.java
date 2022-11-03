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

public class EX6 {

    private static final String MSG_1 = "Introdueix un any i un mes:";
    private static final String MSG_2 = "El mes te 29 dies";
    private static final String MSG_3 = "El mes te 28 dies";
    private static final String MSG_4 = "El mes te 30 dies";
    private static final String MSG_5 = "El mes te 31 dies";
    
    public static void main(String[] args) {
        //EX6_a
        int any, mes, answerCase;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        mes = sc.nextInt();
        if (mes % 2 == 0) {
            if (mes == 2) {
                if (any % 4 == 0) {
                    System.out.println(MSG_2);
                } else {
                    System.out.println(MSG_3);
                }
            } else {
                System.out.println(MSG_4);
            }
        } else {
            System.out.println(MSG_5);
        }
        //EX6_b
        System.out.println(MSG_1);
        any = sc.nextInt();
        mes = sc.nextInt();

        if (mes % 2 == 0) {
            if (mes == 2) {
                if (any % 4 == 0) {
                    answerCase = 2;
                } else {
                    answerCase = 1;
                }
            } else {
                answerCase = 3;
            }
        } else {
            answerCase = 4;
        }

        switch (answerCase) {
            case 1:
                System.out.println(MSG_2);
                break;
            case 2:
                System.out.println(MSG_3);
                break;
            case 3:
                System.out.println(MSG_4);
                break;
            case 4:
                System.out.println(MSG_5);
                break;
        }
    }
}