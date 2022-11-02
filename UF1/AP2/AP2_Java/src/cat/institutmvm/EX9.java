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

public class EX9 {

    private static final String MSG_1 = "Introdueix un seguit de numéros i termina amb 0:";
    private static final String MSG_2 = "La mitjana de tots els números introduïts es:";

    public static void main(String[] args) {
        int num, suma = 0, quantitat = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while (num != 0) {
            quantitat = quantitat + 1;
            suma = suma + num;
            num = sc.nextInt();
        }
        System.out.println(MSG_2 + (suma / quantitat));
    }
}
