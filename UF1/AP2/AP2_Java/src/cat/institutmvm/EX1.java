/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author ivanmvm
 */
public class EX1 {

    public static void main(String[] args) {
        //EX1_a
        System.out.println("Ivan");
        //EX1_b
        System.out.println("Ivan Saez Serra");
        //EX1_c
        System.out.println("Ivan");
        System.out.println("Saez Serra");
        //EX1_d
        for (int i = 0; i < 10; i++) {
            System.out.println("* * * * * * * * * *");
        }
        //EX1_e
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}