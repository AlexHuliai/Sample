package com.huliai;

import java.util.Scanner;

public class CoffeMachineCount {
    public static void main(String[] args) {
        System.out.println("Plese enter number of people will drink coffee ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("For this amount of quest("+a+") you will need :");
        System.out.println(a*200+" ml of water");
        System.out.println(a*50+" ml of milk");
        System.out.println(a*15+" g of coffee");




    }
}
