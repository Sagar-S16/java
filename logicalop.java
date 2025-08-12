public class logicalop {
    
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        System.out.println((a < b) && (b < c)); // true && true → true
        System.out.println((a < b) || (b > c)); // true || false → true
        System.out.println(!(a < b));           // !true → false
    }

    
    
}