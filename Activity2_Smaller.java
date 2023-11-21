/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2_smaller;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Activity2_Smaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int small, big;
        System.out.println("This program can give you the biggest and smallest number of three");
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();

        System.out.println("Write another number");
        int variable_2 = scanner.nextInt();

        System.out.println("Write the third number");
        int variable_3 = scanner.nextInt();

        if (variable_1 > variable_2 && variable_1 > variable_3) {
            big = variable_1;
            if (variable_2 > variable_3) {

                small = variable_3;
            } else {

                small = variable_2;
            }
            System.out.println("The biggest number is " + big + " The smallest number is:" + small);
        }

        if (variable_2 > variable_1 && variable_2 > variable_3) {
            big = variable_2;
            if (variable_1 > variable_3) {
                small = variable_3;
            } else {
                small = variable_1;
            }
            System.out.println("The biggest number is " + big + "The smallest number is:" + small);

        }

        if (variable_3 > variable_1 && variable_3 > variable_2) {
            big = variable_3;
            if (variable_2 > variable_1) {

                small = variable_1;
            } else {

                small = variable_2;
            }

            System.out.println("The biggest number is " + big + "The smallest number is:" + small);

        }

    }
}
