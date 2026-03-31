package day9;
//interface->100% abstraction, only abstract method, no concrete method, no constructor, multiple inheritance is possible
//Always public Abstract method
//We can acheive multiple inhertitance only thriugh Interface
//one child class with multiple behaviour
//no ambigity(NO method body on parent class)
//override method without conflict

abstract class SmartDevice{
    abstract void turnOn();//abstract method
    abstract void turnOff();
    void deviceInfo(){//concrete method
        System.out.println("It is a device");
    }
}//Light is a child class of the abstract class
/*abstract class SetLevel{
    abstract void level();
}*/
class Light extends SmartDevice{
    @Override
void turnOn(){
    System.out.println("Light On");
}
@Override
void turnOff(){
    System.out.println("Light off");
}
}
interface Remote{
    void change();
}
interface wifiControl{
    void connect();
    void change();//produce conflit while overriding 
}
class TV implements Remote{
    @Override
    public void change(){//if not public mention the it will be taken as default
        System.out.println("Change Channel");
    }
}
    public class Interface {
    public static void main(String[] args){
        SmartDevice device=new Light();//here child class 'Light' is use to craete the object and not the abstract class 'SmartDevice' because in abstract class not defined so there is no use if we create the object using it.
        device.turnOn();
        device.deviceInfo();//if it is a concrete method no need to override,we can directly use it from parent class
        TV tv=new TV();
        tv.change();
    }
}
