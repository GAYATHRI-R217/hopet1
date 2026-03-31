//Abstraction-> Hiding internal implementation and shows only essential features
//->Abstract class(Partial abstraction)--- What child can do and not how it can do
//->interface (complete abstraction
//abstract method-> must override on child class
//Concrete method-> will be inherited automatically
 /*           (Stack)Referencetype
SmartDevice-->Device/
                    \(Heap)
                     new Light()
*/
//Create abstract method SetLevel(Level)
package day9;
abstract class SmartDevice{
    abstract void turnOn();//abstract method
    abstract void turnOff();
    abstract void SetLevel();
    void deviceInfo(){//concrete method
        System.out.println("It is a device");
    }
}//Light is a child class of the abstract class
class Light extends SmartDevice{
    @Override
void turnOn(){
    System.out.println("Light On");
}
@Override
void turnOff(){
    System.out.println("Light off");
}
void SetLevel(){
    System.out.println("Set Level");
}
}
public class abstraction{
    public static void main(String[] args){
        SmartDevice device=new Light();//here child class 'Light' is use to craete the object and not the abstract class 'SmartDevice' because in abstract class not defined so there is no use if we create the object using it.
        device.turnOn();
        device.deviceInfo();//if it is a concrete method no need to override,we can directly use it from parent class
        device.SetLevel();
    }
}