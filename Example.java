import java.util.Scanner;

class Example {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        double x = 0;
        double area = 0;
        //... other variables go here
        
        //2. get user input
        System.out.println("R-A Calculator");
        System.out.println("Type Area");   
        area = sc.nextDouble();
        
        
        //3. calculate and display answer
        x = Math.sqrt(area/Math.PI);
        System.out.println("radius is" + x);
       
    }
}