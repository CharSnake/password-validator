package com.example.user.csci3130assignment2;

/**
 * Created by User on 2018-02-10.
 */

public class Validator {

    int tests;

    public int validate(String pass) {

        //Set all test values to 0 (failed)
        tests = 0;

        //Test 1, string does not equal "password"
        //Ex: "PassWorD" and any other case combinations will fail, but "Password5" will succeed
        if (!pass.equalsIgnoreCase("password"))
           tests += 1;

        //Alternate Test 1, string does not CONTAIN "password"
        //Ex: "24PassWorDqz" will fail
        /*
        if (!pass.toLowerCase().contains("password"))
            tests += 1;
        */

        //Test 2, string is at least 8 characters long
        //Ex: "vV34567" will fail, "vV345678" will succeed
        if (pass.length() >= 8)
            tests += 1;

        //Test 3, string contains at least one number
        //Ex: "Abcdefgh" will fail, "Abcdefg8" will succeed
        if (pass.matches(".*\\d.*"))
            tests += 1;

        //Test 4, string contains at least one upper case AND one lower case
        //Ex: "abcdefg8" will fail, "Abcdefg8" will succeed
        if (pass.matches(".*[a-z].*") && pass.matches(".*[A-Z].*"))
            tests += 1;

        //Test 5, string does not contain three of the same character in a row
        //Ex: "HellloW0rld" will fail, "HelloW0rld" will succeed.
        if (!pass.matches(".*(.)\\1{2}.*"))
            tests += 1;

        return tests;
    }
}
