package com.huliai;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s2 = s.substring(a,b+1);

    System.out.println(s2);

    }
}
