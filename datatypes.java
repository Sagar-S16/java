public class datatypes {
    public static void main(String[] args) {
        
        // 1. Primitive Data Types
        byte b = 100;                  // 8-bit, range: -128 to 127
        short s = 30000;               // 16-bit
        int i = 100000;                 // 32-bit
        long l = 10000000000L;          // 64-bit, needs 'L' for long literal
        
        float f = 5.75f;                // 32-bit, needs 'f'
        double d = 19.99;               // 64-bit
        
        char c = 'A';                   // 16-bit Unicode character
        boolean bool = true;            // 1-bit (true/false)
        
        // 2. Reference Data Types
        String name = "Java";           // String object
        int[] numbers = {1, 2, 3, 4, 5}; // Array object

        // Output all values
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
        System.out.println("String: " + name);

        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
