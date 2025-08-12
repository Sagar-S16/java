// public class enhancedfor {
// public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};

//         System.out.println("Array Elements:");
//         for (int num : numbers) {
//             System.out.println(num);
//         }
//     }
    
// }

// public class SumArrayForEach {
//     public static void main(String[] args) {
//         int[] numbers = {5, 10, 15, 20};
//         int sum = 0;

//         for (int num : numbers) {
//             sum += num;
//         }

//         System.out.println("Sum = " + sum);
//     }
// }

public class ForEach2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for (int[] row : matrix) {         // each row is an int array
            for (int num : row) {          // iterate over each number in row
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
