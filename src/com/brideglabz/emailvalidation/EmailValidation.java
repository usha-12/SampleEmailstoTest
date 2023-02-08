package com.brideglabz.emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        System.out.println("Welcome to Regular Expressions program to validate Email IDs!\\n");
        EmailValidation check = new EmailValidation();
        String email = "abc";
        String email1 = ".abc";
        String email2 = "1abc";
        check.validateEmail(email);
        check.validateEmail(email1);
        check.validateEmail(email2);
    }
    public void validateEmail(String input) {
        String email = "^[0-9a-zA-Z]*";
        Pattern pattern = Pattern.compile(email);
        Matcher match = pattern.matcher(input);
        printResult(match.matches(), input);
    }

    public void printResult(boolean isOkay, String email) {
        if (isOkay)
            System.out.println("\n" + email + "\tVALID");
        else
            System.out.println("\n" + email + "\tINVALID");
    }
}
//1. abc@yahoo.com,
