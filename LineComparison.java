package com.bl.line_comparison;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main (String[] args)
    {
        System.out.println("Welcome to LineComparison Computation Program");
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first Xaxis coordinator number as x1:  ");
        int x1= sc.nextInt();
        System.out.print("Enter second  Xaxis coordinator number as x2:  ");
        int x2= sc.nextInt();
        System.out.print("Enter first Yaxis coordinator number as y1: ");
        int y1= sc.nextInt();
        System.out.print("Enter Second Yaxis coordinator number as y2: ");
        int y2= sc.nextInt();
        double length1=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Total= " +length1);
        System.out.println("Total Length of line 1 is : " +length1);
        System.out.print("Enter  cordinates of x3:  ");
        int x3= sc.nextInt();
        System.out.print("Enter cordinates of x4:  ");
        int x4= sc.nextInt();
        System.out.print("Enter cordinates of  y3: ");
        int y3= sc.nextInt();
        System.out.print("Enter cordinates of  y4: ");
        int y4= sc.nextInt();
        double length2=Math.sqrt(((x4-x3)*(x4-x3))+((y4-y3)*(y4-y3)));
        System.out.println("Total Length of line 2 is : " +length2);
       
}
}
