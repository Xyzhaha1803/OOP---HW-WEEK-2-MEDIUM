/* Constants Usage Example. Create a Circle class with an attribute radius. 
Use a final constant PI = 3.14159. Write a method calculateCircumference() and calculateArea() using PI. 
Create two Circle objects and display their area and circumference. */

class Circle{
    final double PI = 3.13159;
    double radius;

    Circle(double r){
        this.radius = r;
    }

    public void calculateCircumference(){
        double circumference = 2 * PI * radius;

        System.out.println("The circumference is: " + circumference);
    }

    public void calculateArea(){
        double area = PI * (radius * radius);

        System.out.println("The area is: " + area);
    }
}

public class Q09{
    public static void main(String[] args){
        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(50);

        circle1.calculateArea();
        circle1.calculateCircumference();

        circle2.calculateArea();
        circle2.calculateCircumference();
    }
}