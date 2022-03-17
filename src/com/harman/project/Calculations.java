package com.harman.project;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Add addobj=new Add();
        Multiply Multiplyobj=new Multiply();
        Div8 divobj=new Div8();
        Integer x,y,z,Addresult,Multiplyresult,div8result;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of x");
        x= input.nextInt();
        System.out.println("Enter the value of y");
        y=input.nextInt();
        System.out.println("Enter the value of z");
        z=input.nextInt();
        Addresult= addobj.Add2number(x,y);
        Multiplyresult= Multiplyobj.Multiply2number(x,y);
        div8result= divobj.Divisible(z);
        System.out.println(Addresult);
        System.out.println(Multiplyresult);
    }

}
