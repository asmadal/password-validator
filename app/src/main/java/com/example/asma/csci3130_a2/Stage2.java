package com.example.asma.csci3130_a2;
import java.util.regex.Pattern;
/**
 * This stage checks whether a string is a sufficiently strong password by adding extra THREE rules
 * and return the number of rules that the string passed.
 * Created by asma on 5/28/17.
 */

public class Stage2 {

    public static int passwordValidatorSecondStage(String password) {
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
        // THIRD RULE: it has at least 1 special character of # or & or *
        if (password.indexOf('#') != -1 || password.indexOf('&') != -1 || password.indexOf('*') != -1){
            counter++;
        }
        // FOURTH RULE: it has at least 1 digit
        if (Pattern.compile("[0-9]").matcher(password).find()){
            counter++;
        }
        // FIFTH RULE: it has both upper and lower case
        if (Pattern.compile("[a-z]").matcher(password).find() && Pattern.compile("[A-Z]").matcher(password).find()){
            counter++;
        }

        return counter;
    }
}