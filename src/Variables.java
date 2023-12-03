public class Variables {
    public static void main(String[] args) {
        System.out.println("Variables");

        // byte: -128 до 127 (1 byte)
        byte byteVar = 127;
        System.out.println("byte: " + byteVar);

        // short: -32768 ... 32767 (2 bytes)
        short shortVar = 32767;
        System.out.println("short: " + shortVar);

        // int: -2147483648 ... 2147483647 (4 bytes)
        int intVar = 2147483647;
        System.out.println("int: " + intVar);

        // long: -9_223_372_036_854_775_808 ... 9_223_372_036_854_775_807 (8 bytes)
        long longVar = 9223372036854775807L;
        System.out.println("long: " + longVar);

        // float
        float floatVar = 3.1415926f;
        System.out.println("float" + floatVar);

        // double
        double doubleVar = 4.40598230495832049580342;
        System.out.println("double: " + doubleVar);

        // char: only 1 symbol, only ''
        char charVar = 'c';
        System.out.println("char: " + charVar);

        // String, only ""
        String stringVar = "some string...";
        System.out.println("String: " + stringVar);

        // boolean
        boolean booleanVar = true;
        System.out.println("boolean: " + booleanVar);
    }
}
