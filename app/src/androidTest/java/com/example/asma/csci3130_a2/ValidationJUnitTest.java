package com.example.asma.csci3130_a2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ValidationJUnitTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.asma.csci3130_a2", appContext.getPackageName());
    }


    @Test
    public void testValidatePasswordStage1() {
        // FIRST RULE: it is not "password" (case insensitive)
        // SECOND RULE: it is at least 8 characters long
        assertEquals(Stage1.passwordValidatorFirstStage("password"), 1);
        assertEquals(Stage1.passwordValidatorFirstStage("asma"), 1);
        assertEquals(Stage1.passwordValidatorFirstStage("AsmaAsma"), 2);
        assertEquals(Stage1.passwordValidatorFirstStage("ASMAASMA"), 2);
    }

    @Test
    public void testValidatePasswordStage2() {
        // FIRST RULE: it is not "password" (case insensitive)
        // SECOND RULE: it is at least 8 characters long
        // THIRD RULE: it has at least 1 special character of # or & or *
        // FOURTH RULE: it has at least 1 digit
        // FIFTH RULE: it has both upper and lower case
        assertEquals(Stage2.passwordValidatorSecondStage("Asma"), 2);
        assertEquals(Stage2.passwordValidatorSecondStage("Asma93"), 3);
        assertEquals(Stage2.passwordValidatorSecondStage("asma1993"), 3);
        assertEquals(Stage2.passwordValidatorSecondStage("Asma1993"), 4);
        assertEquals(Stage2.passwordValidatorSecondStage("asma1993*"), 4);
        assertEquals(Stage2.passwordValidatorSecondStage("Asma1993*"), 5);
    }
}
