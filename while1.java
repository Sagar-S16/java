// public class while1 {
//     public static void main(String[] args) {
//         int i =1; 
//         while(i<=4){
//             System.out.println(i);
//             i++;
//         }
//     }
    
// }

// public class while1 {

//     public static void main(String[] args) {
//         int i = 1,sum=0;
//         while(i<=10){
//             sum = sum + i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }


// public class while1 {

//     public static void main(String[] args) {
//         int num =1234;
//         int rev = 0;
//         while(num>0){
//             int digit = num%10;
//             rev = rev*10 + digit;
//             num = num/10;
//         }
//         System.out.println(rev);
//     }
// }


public class while1 {

    public static void main(String[] args) {
        int num =5;
        int fact =1;

        while(num>0){
            fact= fact * num;
            num--;
        }
        System.out.println(fact);
    }    
}