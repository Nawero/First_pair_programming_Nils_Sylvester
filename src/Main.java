import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the length and width of the first rectangle
        System.out.print("Enter the length of the first rectangle: ");
        double length1 = input.nextDouble();
        System.out.print("Enter the width of the first rectangle: ");
        double width1 = input.nextDouble();

        // Create a Rectangle object for the first rectangle
        Rectangle rect1 = new Rectangle(length1, width1);

        // Prompt the user to enter the length and width of the second rectangle
        System.out.print("Enter the length of the second rectangle: ");
        double length2 = input.nextDouble();
        System.out.print("Enter the width of the second rectangle: ");
        double width2 = input.nextDouble();

        // Create a Rectangle object for the second rectangle
        Rectangle rect2 = new Rectangle(length2, width2);

        // Prompt the user to choose whether to compare the area or perimeter
        System.out.print("Compare the area or perimeter? (a/p): ");
        String choice = input.next();

        // Compare the area or perimeter of the two rectangles and print the result
        compareRectangles(rect1, rect2, choice);
    }

    public static void compareRectangles(Rectangle rect1, Rectangle rect2, String choice) {
        if (choice.equals("a")) {
            if (rect1.getArea() > rect2.getArea()) {
                System.out.println("Area for the first rectangle is: " + rect1.getArea() + " Area for the second rectangle is: " + rect2.getArea() + " The difference between areas is: " + (rect1.getArea() - rect2.getArea()));
            } else if (rect1.getArea() < rect2.getArea()) {
                System.out.println("Area for the first rectangle is: " + rect1.getArea() + " Area for the second rectangle is: " + rect2.getArea() + " The difference between areas is: " + (rect2.getArea() - rect1.getArea()));
            } else {
                System.out.println("The area for both rectangles is: " + rect1.getArea() + " Both rectangles have the same area.");
            }
        } else if (choice.equals("p")) {

            if (rect1.getPerimeter() > rect2.getPerimeter()) {
                System.out.println("Perimeter for the first rectangle is: " + rect1.getPerimeter() + " Perimeter for the second rectangle is: " + rect2.getPerimeter() + " The difference between perimeters is: " + (rect1.getPerimeter() - rect2.getPerimeter()));
            } else if (rect1.getPerimeter() < rect2.getPerimeter()) {
                System.out.println("Perimeter for the first rectangle is: " + rect1.getPerimeter() + " Perimeter for the second rectangle is: " + rect2.getPerimeter() + " The difference between perimeters is: " + (rect2.getPerimeter() - rect1.getPerimeter()));
            } else {
                System.out.println("The perimeter for both rectangles is: " + rect1.getPerimeter() + " Both rectangles have the same perimeter.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

