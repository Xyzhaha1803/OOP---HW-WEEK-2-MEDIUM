/*Rectangle and Area Calculation. Create a class Rectangle with length and width. 
Initialize using a constructor. Create a method calculateArea() that returns the area. 
Create 3 rectangles of different dimensions and display their areas. */

class Rectangle{
    double length;
    double width;
    double area;

    Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double calculateArea(){
        double area = length * width;
        this.area = area;
        return area;
    }

    public void displayArea(){
        System.out.println("Area: " + area);
    }
}

public class Q04 {
    public static void main(String[] args){
        Rectangle shape1 = new Rectangle(10, 5);
        Rectangle shape2 = new Rectangle(5, 25);
        Rectangle shape3 = new Rectangle(2, 3);

        shape1.calculateArea();
        shape2.calculateArea();
        shape3.calculateArea();

        shape1.displayArea();
        shape2.displayArea();
        shape3.displayArea();
    }
}
