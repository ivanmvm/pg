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
                    System.out.println("El mes té 29 dies");
                } else {
                    System.out.println("El mes té 28 dies");
                }
            } else {
                System.out.println("El mes té 30 dies");
            }
        } else {
            System.out.println("El mes té 31 dies");
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
                System.out.println("Té 28 dies");
                break;
            case 2:
                System.out.println("Ré 29 dias");
                break;
            case 3:
                System.out.println("Té 30 dias");
                break;
            case 4:
                System.out.println("Té 31 dias");
                break;
        }
    }
}