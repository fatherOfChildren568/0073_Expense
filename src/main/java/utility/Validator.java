package utility;

public class Validator {

    // private constructor
    private Validator() {

    }

    // check input is limit in [min,max]
    public static boolean isLimitInRange(int input, int min, int max) {
        return input >= min && input <= max;
    }

    // check input is greater than 0
    public static boolean isValidDouble(double input) {
        return input > 0;
    }

    //check string is empty?
    public static boolean isValidString(String input) {
        return !input.trim().isEmpty();
    }

}
