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

public class EX3 {

    private static final String MSG_1 = "Introdueix un número: ";
    
    public static void main(String[] args) {
        //EX3_a
        float num1, num2 = 0, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 >= 0) {
            System.out.println("El número es positiu");
        } else {
            System.out.println("El número es negatiu");
        }
        //EX3_b
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 > 35) {
            System.out.println("El número es més gran que 35");
        } else {
            System.out.println("El número es més petit o igual a 35");
        }
        //EX3_c
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 < 100 && num1 > 0) {
            System.out.println("El número es positiu i menor que 100");
        } else {
            System.out.println("El número no entra en el rang");
        }
        //EX3_d
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 <= 27 && num1 >= -3) {
            System.out.println("El número entra en el rang");
        } else {
            System.out.println("El número no entra en el rang");
        }
        //EX3_e
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 <= 50 && num1 >= 25) {
            System.out.println("El número pertany al rang");
        } else {
            System.out.println("El número no pertany al rang");
        }
        //EX3_f
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 / num2 > 15) {
            System.out.println("El número es menor que 15");
        } else {
            System.out.println("El número es més gran que 15");
        }
        //EX3_g
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if (num1 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es senar");
        }
        //EX3_h
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
            if(num1 % 2 == 0){
                System.out.println("Par i elevat al quadrat: " + num1*num1);
            }
            else {
                System.out.println("Senar i elevat al cub: " + num1*num1*num1);
            }
        //EX3_i
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
            if(num1 > num2){
                System.out.println("El número més gran és: " + num1);
            }
            else if(num2 > num1) {
                System.out.println("El número més gran és: " + num2);
            }           
            else {
                 System.out.println("Els números son iguals"); 
                    }
        //EX3_j
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        num3 = sc.nextFloat();
            if(num1 > num2 && num1 > num3){
                System.out.println("El número més gran és: " + num1);
            }
            else if(num2 > num1 && num2 > num3) {
                System.out.println("El número més gran és: " + num2);
            }
            else if(num3 > num1 && num3 > num2) {
                System.out.println("El número més gran és: " + num3);
            }           
            else {
                 System.out.println("Els números son iguals"); 
                    }
        //EX3_k
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
            if(num1 % num2 == 0){
                System.out.println("El valor introduït es multiple");
            }
            else {
                System.out.println("El valor introduït no es multiple");
            }
        //EX3_l
        int fixa = 6;
        double total = 0;
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
            if(num1 <= 50){
                System.out.println("La cuota a pagar es: " + fixa);
            }
            else if (num1 >= 50 && num1 <= 200) {
                total = (num1 * 0.1) + fixa;
                System.out.println("La cuota a pagar es: " + total);
            }
            else if (num1 > 200){
                total = (num1 * 0.3) + fixa;
                System.out.println("La cuota a pagar es: " + total);
            }
    }
}