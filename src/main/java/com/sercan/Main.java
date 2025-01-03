package com.sercan;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen yıl giriniz :");
        int yil=sc.nextInt();
        if(yil%4==0){
            System.out.println(yil +" bir artık yildir.");
        }else
            System.out.println(yil+" bir artık yıl değildir.");


    }
}