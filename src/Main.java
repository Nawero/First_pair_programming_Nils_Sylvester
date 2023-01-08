import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first rectangle: ");
        double length1 = input.nextDouble();
        System.out.print("Enter the width of the first rectangle: ");
        double width1 = input.nextDouble();

        Rectangle rect1 = new Rectangle(length1, width1);

        System.out.print("Enter the length of the second rectangle: ");
        double length2 = input.nextDouble();
        System.out.print("Enter the width of the second rectangle: ");
        double width2 = input.nextDouble();

        Rectangle rect2 = new Rectangle(length2, width2);

        System.out.print("Compare the area or perimeter? (a/p): ");
        String choice = input.next();

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

