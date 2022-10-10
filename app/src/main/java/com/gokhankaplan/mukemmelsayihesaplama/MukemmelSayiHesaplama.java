package com.gokhankaplan.mukemmelsayihesaplama;

import java.util.Scanner;

public class MukemmelSayiHesaplama {
    public static void main(String[] args) {

        int n, i, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        n = input.nextInt();

        for(i =1; i<n; i++) {
            if (n % i == 0){
                b += i;

            } else {

            }
        }
        if (b == n) {
            System.out.println(n + " mükemmel bir sayıdır.");
        }
        else {
            System.out.println(n + " mükemmel bir sayı değildir.");
        }


    }
}
