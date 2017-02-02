package com.finepointmobile;


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String asdf = in.nextLine();
        String theString = in.nextLine();

        in.close();

        String[] newString = theString.split(" ");

        for (int i = newString.length - 1; i >= 0; i--) {
            System.out.print(newString[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}

// 6676 3216 4063 8373 423 586 8850 6762
