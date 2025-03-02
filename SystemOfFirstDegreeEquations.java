import java.util.Scanner;

public class SystemOfFirstDegreeEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The system is of the form:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();
        
        System.out.print("Enter f: ");
        double f = scanner.nextDouble();

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The system has no unique solution.");
            if (a * f == e * c && b * f == e * d) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            System.out.println("The solution is: ");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        scanner.close();
    }
}
