/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

/*  
    Nom: Ivan
    Cognoms: Saez Serra
    INS Manuel Vázquez Montalbán
    Data d'edició: 28/10/22
    Nom del Cicle Formatiu: Disseny d'Aplicació Web (DAW)
    Nom del mòdul: Programació
*/

public class EX7 {

    private static final String MSG_1 = "Números del 0 al 10:";
    private static final String MSG_2 = "Numeros del 0 al 100:";
    private static final String MSG_3 = "Núumeros parells del 0 al 100:";

    public static void main(String[] args) {
        int cont = -1, num = 0;

        //EX7_a
        System.out.println(MSG_1);
        while (cont < 10) {
            cont = cont + 1;
            System.out.println(cont);

        }
        //EX7_b
        System.out.println(MSG_2);
        cont = -1;
        while (cont < 100) {
            cont = cont + 1;
            System.out.println(cont);

        }
        //EX7_c
        System.out.println(MSG_3);

        cont = -2;
        while (cont < 100) {
            cont = cont + 2;
            System.out.println(cont);
        }
        //EX7_d
        System.out.println(MSG_2);
        cont = 101;
        while (cont > 0) {
            cont = cont - 1;
            System.out.println(cont);

        }
    }
}