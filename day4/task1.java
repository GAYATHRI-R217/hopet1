package day4;
    //design shopping cart system
    //get input from the user about the id,name,price and quantity
    //1.class product->id,name,price(double),quantity(int)
    //2.constructor
    //3.methods getTotalPrice(),display->product details
    //4. atleast 3 product objects store them in array(cart) display all products calculate and print grand total Op:id name price(double) quantity grandtotal
    import java.util.Scanner;
    class Product{
        int id;
        String name;
        double price;
        int quantity;

        Product(int id,String name,double price,int quantity){
            this.id=id;
            this.name=name;
            this.price=price;
            this.quantity=quantity;
        }
         double getTotalPrice(){
            return price*quantity;
        }
        void display(){
            System.out.println(id+"\t"+name+"\t"+price+"\t"+quantity+"\t"+getTotalPrice());
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product[] cart=new Product[3];
        for(int i=0;i<cart.length;i++){
            System.out.println("Enter product details (id name price quantity):");
            int id=sc.nextInt();
            String name=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            cart[i]=new Product(id,name,price,quantity);
        }
        /*Product p1 = new Product(101, "Laptop", 50000.0, 2);
        Product p2 = new Product(102, "Smartphone", 20000.0, 3);
        Product p3 = new Product(103, "Headphones", 5000.0, 4);*/

        //Product[] cart = {p1, p2, p3};
        double grandTotal = 0.0;
        System.out.println("ID\tName\tPrice\tQuantity\tTotal");
        for (Product p : cart) {
            p.display();
            grandTotal += p.getTotalPrice();
        }
        System.out.println("Grand Total: " + grandTotal);
        sc.close();
    }
}
