// public class variable {

//     int instancevar  =35;
//     static int staticvar = 2110;
//     void display(){
//         int localvar = 45;
//         System.out.println(instancevar);
//         System.out.println(staticvar);
//         System.out.println(localvar);
//     }
//     public static void main(String[] args) {
//         variable obj1 = new variable();
//         obj1.display();
//         System.out.println();
    
//     variable obj2 = new variable();
//     obj2.instancevar = 30;
//     staticvar = 100;
//     obj2.display();
//     }
// }
//we can change the instance and static variable by creating the objects
//and by accessing it by calling the method.



// public class variable {

//     int instanceVar = 4;
//     static String staticVar = "hello";
    
//     void showVariables()
//     {
//         int localVar = 10;
//         System.out.println(localVar);
//         System.out.println(instanceVar);
//         System.out.println(staticVar);
//     }
//     public static void main(String[] args) {
//         variable obj = new variable();
//         obj.showVariables();
//         variable.staticVar = "Hi";
//         obj.showVariables();
//     }
// }



public class variable {

    int x =5;
    static int y =10;

    public void display()
    {
        int x = 20;
        System.out.println(x);
        System.out.println(this.x);//to access instance variable
        System.out.println(y);
    }

    public static void main(String[] args) {
        variable obj = new variable();
        obj.display();
    }
}

//FINAL variables cannot be changed once it is initiated.