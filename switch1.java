public class switch1 {

    public static void main(String[] args)
{
    int day =3;
    switch(day){
        case 1 : System.out.println("monday");
        break;
        case 2 : System.out.println("tuesday");
        break;
        case 3 : System.out.println("wednesday");
        break;
        default:
        System.out.println("invalid day number");
    }
}}

// public class StringSwitchExample {
//     public static void main(String[] args) {
//         String browser = "chrome";

//         switch (browser.toLowerCase()) {
//             case "chrome":
//                 System.out.println("Launching Chrome...");
//                 break;
//             case "firefox":
//                 System.out.println("Launching Firefox...");
//                 break;
//             case "edge":
//                 System.out.println("Launching Edge...");
//                 break;
//             default:
//                 System.out.println("Unknown browser");
//         }
//     }
//}
