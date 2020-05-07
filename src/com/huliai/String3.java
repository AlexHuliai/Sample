package com.huliai;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.startsWith("J") || s.startsWith("j")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }




    }



}

