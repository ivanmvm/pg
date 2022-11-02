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

public class EX5 {

    private static final String MSG_1 = "Introdueix un any:";

    public static void main(String[] args) {
        int any;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) {
            System.out.println("És any de traspàs");
        } else {
            System.out.println("No és any de traspàs");
        }
    }
}