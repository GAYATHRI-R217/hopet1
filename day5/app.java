package day5;
//app= fooddelivery app
//travel app like rapido
//inheritance->child class/sub class/derived class
//inherit properties from parent class/super class
//public class app {
    class User{
        String name;
        String phone;
        String address;
        String role="User";
        User(){
            System.out.println("By using ");
        }
        User(String name){
            this.name=name;
            System.out.println("User created");
        }
        void display(){
            System.out.println("Name: "+name);
            System.out.println("role: "+role);
            //System.out.println("Address"+address);
        }
}
    class Driver extends User{
        String role="Driver";
        String vehicle;
        Driver(String name,String vehicle){
            super(name);
            this.vehicle=vehicle;
            //System.out.println("Name"+name);
            //System.out.println("Role"+role);
        }
        void displayDriver(){
            super.display();
            System.out.println("Vehicle: " + vehicle);
            System.out.println("Driver class Role: " + role);
            System.out.println("User class Role: " + super.role);
        }
    }
   /*  class FoodUser extends User{
        String FavoriteFood;
        FoodUser(){
            System.out.println("Food user created");

        }
    }
    class TravelUser extends User{
        String preferredVehicle;
    }*/
    class app{
        public static void main(String[] args){
        //app app=new app();
    Driver d=new Driver("ABC", "Bike");
    d.displayDriver();
    }
}