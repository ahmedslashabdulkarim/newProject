
// diese Klasse enthält alle Methoden zur Passwortprüfung.
public class PasswordValidationTesting {

    // häufiger Passwörter.
    private static String[] commonPasswords = {
            "password",
            "passwort1",
            "12345678",
            "aa345678"
    };

    // ob das Passwort mindestens "min" Zeichen lang ist.
    public static boolean hasMinLength(String password, int min) {
        if (password == null) {
            return false;
        }
        return password.length() >= min ;
    }

    // ob mindestens eine Ziffer enthalten ist.
    public static boolean containsDigit(String password) {
        if (password == null) {
            return false;
        }
        // for-each alle durchgehem
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                return true;
            }
        }
        return false;
    }

    // ob Groß- als auch Kleinbuchstaben vorkommen.
    public static boolean containsUpperAndLower(String password) {
        if (password == null) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;

        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                hasUpper = true;
            }
            if (Character.isLowerCase(chars[i])) {
                hasLower = true;
            }
        }
        // return hasUpper && hasLower;
        if (hasUpper && hasLower) {
            return true;
        } else {
            return false;
        }
    }

    // ob das Passwort in der Liste häufiger Passwörter vorkommt.
    public static boolean isCommonPassword(String password) {
        if (password == null) {
            return false;
        }
        for (int i = 0; i < commonPasswords.length; i++) {
            if (password.equals(commonPasswords[i])) {
                return true;
            }
        }
        return false;
    }

    // ob ein erlaubtes Sonderzeichen vorkommt.
    public static boolean containsSpecialChar(String password, String allowed) {
        if (password == null || allowed == null) {
            return false;
        }

        //  nested for
        char[] chars = password.toCharArray();
        char[] allowedChars = allowed.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < allowedChars.length; j++) {
                if (chars[i] == allowedChars[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // Hauptvalidierung – prüft alle Basisregeln.
    public static boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        // viele einzelne ifs statt kombinierter Logik
        if (!hasMinLength(password, 8)) {
            return false;
        }

        if (!containsDigit(password)) {
            return false;
        }

        if (!containsUpperAndLower(password)) {
            return false;
        }

        if (isCommonPassword(password)) {
            return false;
        }

        //Bonus nicht eingebaut
        return true;
    }
}
