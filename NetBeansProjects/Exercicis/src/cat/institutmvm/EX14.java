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
public class EX14 {

    private final static int MAX = 10; //declare constant max
    private final static int MIN = 0; //declare constant main
    private final static String MSG_1 = "Introdueix un número:";
    private final static String MSG_2 = "El numero introduit és:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println(MSG_1);
            num = sc.nextInt();
        } while (num > MAX || num < MIN);
        System.out.println(MSG_2 + "" + num);
    }
}
