package com.finepointmobile;


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String theString = new String();

        int asdf = in.nextInt();
        theString = String.valueOf(asdf);

        in.close();

        System.out.println(theString);

//        for (int j = theString.length() - 1; j >= 0; j--) {
//            System.out.print(theString.charAt(j) + " " + j);
//        }
    }
}
