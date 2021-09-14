/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class comparingNumbers{

    public static void main(String args[])
    {
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double y=sc.nextDouble();

        System.out.print("Enter the third number: ");
        double z=sc.nextDouble();

        //checking if the input numbers are different

        if(x!=y&&y!=z&&z!=x)
        {
            //manually comparing numbers
            
            if(x>y && x>z)
            {
                System.out.print("The largest number is "+x);
            }else if(y>z && y>x)
            {
                System.out.print("The largest number is "+y);
            }else
            {
                System.out.print("The largest number is "+z);
            }
        }else
        {
            System.out.print("Please enter different numbers.");
        }




    }





}