public class literals {

    public static void main(String[] args) {
        int decimal = 100;
        int binary = 0b1010;
        int octal = 012;
        int hex = 0x1F;
        long bigNum = 123456789L;

        // Floating-point literals
        float price = 9.99f;
        double pi = 3.14159;
        double sci = 2.5e3;

        // Character literals
        char letter = 'A';
        char unicode = '\u0041'; // 'A'

        // String literal
        String language = "Java";

        // Boolean literals
        boolean isFun = true;

        // Null literal
        String empty = null;

        // Printing all literals
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);
        System.out.println("Long: " + bigNum);
        System.out.println("Float: " + price);
        System.out.println("Double: " + pi);
        System.out.println("Scientific: " + sci);
        System.out.println("Char: " + letter);
        System.out.println("Unicode Char: " + unicode);
        System.out.println("String: " + language);
        System.out.println("Boolean: " + isFun);
        System.out.println("Null: " + empty);
    }
}