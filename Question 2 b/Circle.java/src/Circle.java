import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        // Displaying the results with 1 decimal place
        System.out.printf("Area: %.1f%n", area);
        System.out.printf("Circumference: %.1f%n", circumference);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
