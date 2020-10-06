import java.util.Scanner;

class Intrest{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double P = 0;
        double r = 0;
        double n = 0;
        double A = 0;
        
        System.out.println("Simple interest formula");
        System.out.println("Starting amount $");
        P = sc.nextDouble();
        System.out.println("Rate of interest");
        r = sc.nextDouble();
        System.out.println("For how many years?");
        n = sc.nextDouble();
        
        A = P*Math.pow(1 + r, n);
        System.out.println("After" + n + "years, your amount is" + A);
        
    }
}
