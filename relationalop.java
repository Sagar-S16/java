public class relationalop {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a == b : " + (a == b));  // false
        System.out.println("a != b : " + (a != b));  // true
        System.out.println("a > b  : " + (a > b));   // false
        System.out.println("a < b  : " + (a < b));   // true
        System.out.println("a >= b : " + (a >= b));  // false
        System.out.println("a <= b : " + (a <= b));  // true
    }
    
}

// public class RelationalDifferentTypes {
//     public static void main(String[] args) {
//         int num = 10;
//         double val = 10.0;

//         System.out.println(num == val);  // true (int promoted to double)
//         System.out.println(num >= val);  // true
//     }
// }

// public class RelationalChar {
//     public static void main(String[] args) {
//         char c1 = 'A'; // Unicode 65
//         char c2 = 'B'; // Unicode 66

//         System.out.println(c1 < c2); // true
//         System.out.println(c1 == 65); // true (char compared to int)
//     }
// }


// public class RelationalObjects {
//     public static void main(String[] args) {
//         String s1 = new String("Hello");
//         String s2 = new String("Hello");

//         System.out.println(s1 == s2);       // false (compares references)
//         System.out.println(s1.equals(s2)); // true (compares values)
//     }
// }

