package com.huliai;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(countD(h, a, b));
    }

    public static int countD(int h, int a, int b) {

        int path = 0;
        int step = 0;
        for (int i = 1; path < h; i++) {
            if ((path + a) >= h) {
                step = i;
                break;
            }

            path += a - b;
            step = i;


        }

        return step;
    }

}