/* Manual Car Showroom Inventory. Create a Car class with attributes: brand, model, price. 
Create 5 different Car objects with different details. 
Display the cars whose price is greater than 20,00,000 (use if statement). */

class Car{
    String brand;
    String model;
    int price;

    Car(String b, String m, int p){
        this.brand = b;
        this.model = m;
        this.price = p;
    }

    public void displayDetails(){
        if (price > 2000000){
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
            System.out.println("");
        } else {
            System.out.println("Car price too low.");
            System.out.println("");
        }
    }
}

public class Q10{
    public static void main(String[] args){
        Car car1 = new Car("BMW", "S-class", 3500000);
        Car car2 = new Car("BMW", "SUV", 1500000);
        Car car3 = new Car("BMW", "iX3", 6500000);
        Car car4 = new Car("Hyundai", "INSTER", 4500000);
        Car car5 = new Car("Hyundai", "SUV", 600000);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
        car4.displayDetails();
        car5.displayDetails();
    }
}