public class WrapperClassConversion {
    public static void main(String[] args) {
        // Convert integer to double
        Integer intObj = 100;
        Double doubleObj = intObj.doubleValue();
        System.out.println("Integer to Double: " + doubleObj);

        // Convert double to integer
        Double doubleValue = 45.67;
        Integer intValue = doubleValue.intValue();
        System.out.println("Double to Integer: " + intValue);
    }
}
