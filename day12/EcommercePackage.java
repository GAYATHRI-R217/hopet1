package day12;

public class EcommercePackage {
    public void PlaceOrer(Order order)
    {
        System.out.println(order.user.name);
        System.out.println(order.product);
        double totalPrice=order.product*order.quantity;
        System.out.println(totalPrice);

    }
}
public class User
{
    public String name;
    public String address;
    public User(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
}
public class Product {
    public String name;
    public double price;
    public Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
}