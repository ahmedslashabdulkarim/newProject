import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTesting {

    @Test
    void characters8_whenEmpty_throwFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean result = PasswordValidationTesting.isNullCharactersLong(password);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void characters7_whenEmpty_throwFalse() {
        //GIVEN
        String password = "1111117";
        //WHEN
        boolean result = PasswordValidationTesting.is7CharactersLong(password);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
        void characters8_whenEmpty_throw8True() {
        //GIVEN
        String password = "11111118";
        //WHEN
        boolean result = PasswordValidationTesting.is8CharactersLong(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void characters9_whenEmpty_throw8True() {
        //GIVEN
        String password = "111111119";
        //WHEN
        boolean result = PasswordValidationTesting.is9CharactersLong(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigit_whenEmpty_throwFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean result = PasswordValidationTesting.containsDigit(password);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containsDigitOne_whenOne_throwTrue() {
        //GIVEN
        String password = "1";
        //WHEN
        boolean result = PasswordValidationTesting.containsDigitOne(password);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigitOne_whenText_throwTrue() {
        //GIVEN
        String password = "11wiegehts";
        //WHEN
        boolean result = PasswordValidationTesting.containsDigitText(password);
        //THEN
        Assertions.assertTrue(result);
    }
//
}
