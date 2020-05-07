package com.huliai;

import java.util.Scanner;

public class StringStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = str.replace('a','b');
        System.out.println(newStr);
    }

    
    
}
