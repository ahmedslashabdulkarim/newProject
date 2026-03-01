public class PasswordValidationTesting {


    public static boolean isNullCharactersLong(String password) {
        return false;
    }

    public static boolean is8CharactersLong(String password) {
        if(password.length() >= 8){
            return true;
        };
        return false;
    }

    public static boolean is7CharactersLong(String password) {
        return false;
    }
    //

    public static boolean is9CharactersLong(String password) {
        return true;
    }

    public static boolean containsDigit(String password) {
        return false;
    }

    public static boolean containsDigitOne(String password) {
        return password.matches("1");
    }

    public static boolean containsDigitText(String password) {
        return password.matches(".*\\d.*");
    }
}
