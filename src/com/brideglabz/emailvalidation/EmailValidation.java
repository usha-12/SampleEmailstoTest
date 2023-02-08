package com.brideglabz.emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        System.out.println("Welcome to Regular Expressions program to validate Email IDs!\\n");
        EmailValidation check = new EmailValidation();
        String email = "abc@gmail.com";
        String email1 = "abc@google.COM";
        String email2 = "1abc@bridgelab.co";
        String email3 = "abc@bridgelab.commerce";
        check.validateEmail(email);
        check.validateEmail(email1);
        check.validateEmail(email2);
        check.validateEmail(email3);
    }

    public void validateEmail(String input) {
        String email = "^[0-9a-zA-Z]*[@][a-zA-Z]+[.][a-z]{2,4}$";
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