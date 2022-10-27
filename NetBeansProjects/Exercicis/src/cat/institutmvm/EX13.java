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
public class EX13 {

    private static final int MAX = 5;
    private static final String MSG_1 = "Introdueix un nombre";
    private static final String MSG_2 = "La mitjana del nombre és:";

    public static void main(String[] args) {
        float num = 0; //declara variable num
        float i; //declara variable i
        float avg = 0; //declara variable avg

        Scanner sc = new Scanner(System.in); //Declara variable scanner
        for (i = 0; i < MAX; i++) { //loop for append nums
            System.out.println(MSG_1); //message for request numbers
            num = sc.nextFloat(); //variable num for save values
            avg += num; //variable avg for acumulation numbers
        }
        System.out.println(MSG_2 + " " + avg / MAX); //return avg of the differents 3 added numbers
    }
}
