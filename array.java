// public class array {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         int sum = 0;
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//             sum = sum + arr[i];
//         }
//         System.out.println(sum);
//     }
// }

// public class array {

//     public static void main(String[] args) {
//         int[] arr = {25,12,78,56,89};
//         int max = arr[0];

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

// public class array {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         for(int i =arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// public class array {

//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50};
//         int key = 30;
//         boolean found = false;

//         for(int i = 0;i<arr.length;i++){
//             if(arr[i]=key){
//                 found = true;
//                 break;
//             }
//         }
//         if(found){
//             System.out.println("element found");
//         }
//         else{
//             System.out.println("element not found");
//         }
//     }
//}

// import java.util.Arrays;

// public class array {
//     public static void main(String[] args) {
        
   
//         int[] arr = {4,2,3,5,1};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// } 

// import java.util.Arrays;

// public class array {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         int[] arr1 = Arrays.copyOf(arr, arr.length);
//         System.out.println(Arrays.toString(arr1));
//     }
//}



public class Array2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
