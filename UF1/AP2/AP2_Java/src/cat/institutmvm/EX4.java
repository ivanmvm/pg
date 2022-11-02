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

public class EX4 {

    private static final String MSG_1 = "Introdueix el mes: ";

    public static void main(String[] args) {
        //EX4_a
        float num1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 == 1) {
            System.out.println("Gener");
        } else if (num1 == 2) {
            System.out.println("Febrer");
        } else if (num1 == 3) {
            System.out.println("Març");
        } else if (num1 == 4) {
            System.out.println("Abril");
        } else if (num1 == 5) {
            System.out.println("Maig");
        } else if (num1 == 6) {
            System.out.println("Juny");
        } else if (num1 == 7) {
            System.out.println("Juliol");
        } else if (num1 == 8) {
            System.out.println("Agost");
        } else if (num1 == 9) {
            System.out.println("Septembre");
        } else if (num1 == 10) {
            System.out.println("Octubre");
        } else if (num1 == 11) {
            System.out.println("Novembre");
        } else if (num1 == 12) {
            System.out.println("Desembre");
        } else if (num1 < 1 || num1 > 12) {
            System.out.println("Hi ha hagut un error");
        }
        //EX4_b
        int mes;
        System.out.println(MSG_1);
        mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Gener");
                break;
            case 2:
                System.out.println("Febrer");
                break;
            case 3:
                System.out.println("Març");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maig");
                break;
            case 6:
                System.out.println("Juny");
                break;
            case 7:
                System.out.println("Juliol");
                break;
            case 8:
                System.out.println("Agost");
                break;
            case 9:
                System.out.println("Septembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Desembre");
                break;
        }
    }
}