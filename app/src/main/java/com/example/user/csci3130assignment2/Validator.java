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
        if (!pass.equalsIgnoreCase("password"))
            tests += 1;

        //Test 2, string is at least 8 characters long
        if (pass.length() >= 8)
            tests += 1;

        return tests;
    }
}
