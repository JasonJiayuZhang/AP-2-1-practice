import java.util.Scanner;

class Dist {
    
    public static void main (String[] args) {
    double x = 0;
    double y = 0;
    double x2 = 0;
    double y2 = 0;
    double Dist = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Distance between 2 points");
    System.out.println("Entre X value");
    x = sc.nextDouble();
    System.out.println("Entre Y value");
    y = sc.nextDouble();
    
    System.out.println("Entre X value");
    x2 = sc.nextDouble();
    System.out.println("Entre Y value");
    y2 = sc.nextDouble();
    
    Dist = Math.sqrt((x2 - x)*(x2 - x) + (y2- y)*(y2 - y));
    System.out.println("Distance is" + Dist);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    