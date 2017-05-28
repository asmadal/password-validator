package com.example.asma.csci3130_a2;
/**
 * This stage checks whether a string is a sufficiently strong password according to TWO set of rules
 * and return the number of rules that the string passed.
 * Created by asma on 5/28/17.
 */

public class Stage1 {

        public static int passwordValidatorFirstStage(String password) {
            int counter = 0; //to count rules passed
            if (password == null || password.isEmpty()) {
                return 0;
            }
            // FIRST RULE: it is not "password" (case insensitive)
            if (!password.equalsIgnoreCase("PASSWORD")) {
                counter++;
            }
            // SECOND RULE: it is at least 8 characters long
            if (password.length() >= 8) {
                counter++;
            }
            return counter;
        }
}
