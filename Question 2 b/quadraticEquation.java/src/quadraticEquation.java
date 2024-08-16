import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double[] roots = solveQuadratic(a, b, c);
        if (roots == null) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
    }

    public static double[] solveQuadratic(double a, double b, double c) {
        if (a == 0) {

            if (b != 0) {
                return new double[]{-c / b};
            } else {
                return null;
            }
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                return new double[]{root1, root2};
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                return new double[]{root};
            } else {
                return null;
            }
        }
    }
}
