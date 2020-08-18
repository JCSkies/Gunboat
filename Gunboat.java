import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter distance to target.\n");
        double d = reader.nextDouble(); 
        System.out.println("Enter the height of the battery relative to the water line .\n");
        double h = reader.nextDouble();
        System.out.println("Enter the velocity");
        double v = reader.nextDouble(); // reader.nextDouble stores the value printed with .\n //

        double a = -4.9*Math.pow((d/v), 2);
        double b = d;
        double c = a + h; //this is because it is the same as a, just 40 was added. a first because a needs to be defined before//
        
        double TanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a); // you gotta include parenthesis the way they are because it would result in an error //
                                                               // parenthesis around 2*a to effective divide with order of operations // 
        
        double angle = Math.atan(TanTheta)*180/3.1415926; // Math.acos, Math.asin, Math.atan //
        
        System.out.println("The angle is" + angle);
        
    }

}   