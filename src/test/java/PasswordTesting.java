import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// diese Testklasse prüft jede Methode einzeln.
public class PasswordTesting {

    @Test
    void testMinLengthNull() {
        // Null sollte immer false sein.
        assertFalse(PasswordValidationTesting.hasMinLength(null, 8));
    }

    @Test
    void testMinLength7() {
        // 7 Zeichen ist zu kurz.
        assertFalse(PasswordValidationTesting.hasMinLength("1234567", 8));
    }

    @Test
    void testMinLength8() {
        // 8 Zeichen ist gültig.
        assertTrue(PasswordValidationTesting.hasMinLength("12345678", 8));
    }

    @Test
    void testContainsDigitEmpty() {
        // Leerer String, keine Ziffer.
        assertFalse(PasswordValidationTesting.containsDigit(""));
    }

    @Test
    void testContainsDigitOne() {
        // Enthält eine Ziffer - true.
        assertTrue(PasswordValidationTesting.containsDigit("a1"));
    }

    @Test
    void testContainsDigitNone() {
        // Keine Ziffer - false.
        assertFalse(PasswordValidationTesting.containsDigit("abcdef"));
    }

    @Test
    void testUpperLowerMixed() {
        // Gross- und Kleinbuchstaben vorhanden.
        assertTrue(PasswordValidationTesting.containsUpperAndLower("Abc"));
    }

    @Test
    void testUpperLowerOnlyUpper() {
        // Nur Grossbuchstaben - false.
        assertFalse(PasswordValidationTesting.containsUpperAndLower("ABC"));
    }

    @Test
    void testCommonPassword() {
        // Passwort ist in der Liste - true.
        assertTrue(PasswordValidationTesting.isCommonPassword("password"));
    }

    @Test
    void testNotCommonPassword() {
        // Nicht in der Liste - false.
        assertFalse(PasswordValidationTesting.isCommonPassword("Abcdef1g"));
    }

    @Test
    void testIsValid() {
        // Ein gültiges Passwort.
        assertTrue(PasswordValidationTesting.isValid("Abcdef1g"));
    }

    @Test
    void testIsValidMissingDigit() {
        // Keine Ziffer - ungültig.
        assertFalse(PasswordValidationTesting.isValid("Abcdefgh"));
    }
}
