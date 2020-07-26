package com.erikriosetiawan;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int length = A.length() + B.length();
        boolean isLexicographically = A.charAt(0) > B.charAt(0);
        String aCapitalize = A.substring(0, 1).toUpperCase() + A.substring(1);
        String bCapitalize = B.substring(0, 1).toUpperCase() + B.substring(1);
        String combine = aCapitalize.concat(" ").concat(bCapitalize);

        System.out.println(length);
        System.out.println(isLexicographically ? "Yes" : "No");
        System.out.println(combine);
    }
}
