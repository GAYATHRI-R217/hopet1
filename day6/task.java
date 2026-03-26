package day6;
//Task(Multiple Booking Platform)
//rideBooking ,Food delivery , parcel delivery
//Requirements:
//All users share common detials but each serveice has specialized users
//user(name, phone,location)displayInfo()iduser vehicletype displayRide 
//od -favfood, parceluser-parcelweight;
public class task {
    static class User{
        String name;
        String phone;
        String location;
        User(String name,String phone,String location){
            this.name=name;
            this.phone=phone;
            this.location=location;
        }
        void displayInfo(){
            System.out.println("Name:"+name);
            System.out.println("Phone:"+phone);
            System.out.println("Location:"+location);
        }
        static class RideUser extends User{
            String vehicleType;
            RideUser(String name,String phone,String location,String vehicleType){
                super(name,phone,location);
                this.vehicleType=vehicleType;
            }
            void displayRide(){
                System.out.println("Vehicle Type:"+vehicleType);
            }
        }
        static class FoodUser extends User{
            String favFood;
            FoodUser(String name,String phone,String location,String favFood){
                super(name,phone,location);
                this.favFood=favFood;
            }
            void displayFavFood(){
                System.out.println("Favourite Food:"+favFood);
            }
        }
        static class ParcelUser extends User{
            double parcelWeight;
            ParcelUser(String name,String phone,String location,double parcelWeight){
                super(name,phone,location);
                this.parcelWeight=parcelWeight;
            }
            void displayParcelWeight(){
                System.out.println("Parcel Weight:"+parcelWeight);
            }
        }
    }
    
    public static void main(String[] args) {
        User.RideUser rideUser=new User.RideUser("AB","1234567890","City A","Car");
        User.FoodUser foodUser=new User.FoodUser("BC","0987654321","City B","Pizza");
        User.ParcelUser parcelUser=new User.ParcelUser("CD","1122334455","City C",5.5);
        
        System.out.println("Ride User Details:");
        rideUser.displayInfo();
        rideUser.displayRide();
        
        System.out.println("\nFood User Details:");
        foodUser.displayInfo();
        foodUser.displayFavFood();
        
        System.out.println("\nParcel User Details:");
        parcelUser.displayInfo();
        parcelUser.displayParcelWeight();
    }
}

