package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);

        int n,total=1 ;
        System.out.print("Bir sayı giriniz=");
        n=inp.nextInt();

        for (int i=1;i<=n; i++){
            total=total*i;

        }
        System.out.println(n+  "   faktöriyel    "  +total);


    }

    }