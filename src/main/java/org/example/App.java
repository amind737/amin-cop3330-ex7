/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) {
        int length,width;
        double Area;

        Scanner sc=new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        length=sc.nextInt();

        System.out.print("What is the width of the room in feet? ");
        width=sc.nextInt();

        Area=length*width;

        System.out.println("You entered dimension of "+length+" feet by "+width+" feet. ");
        int x = (int) Area;
        System.out.println("The area is \n"+ x +" square feet ");

        Area=Area/10.764;

        System.out.print("The area is ");
        System.out.printf("%.3f", Area);
        System.out.print(" square meters ");

    }
}
