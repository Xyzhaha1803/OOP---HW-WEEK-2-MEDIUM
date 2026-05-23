/* Product Discount Calculator. Create a class Product with productName, price, and discountPercentage. 
Write a method calculateFinalPrice() which returns price after discount. 
Create 3 different products and print their final prices. */

class Product{
    String productName;
    double price;
    double discountPercentage;

    Product(String n, double p, double d){
        this.productName = n;
        this.price = p;
        this.discountPercentage = d;
    }

    public void calculateFinalPrice(){
        double finalPrice = price - (price * (discountPercentage/100.0));
        System.out.println("The final price is: " + finalPrice);
    }
}

public class Q07{
    public static void main(String[] args){
        Product bottle = new Product("Bottle", 5.0, 5);
        Product iphone = new Product("Iphone", 1200, 10);
        Product fan = new Product("Fan", 55.5, 15);

        bottle.calculateFinalPrice();
        iphone.calculateFinalPrice();
        fan.calculateFinalPrice();

    }
}