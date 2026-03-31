package day9;
//Coupling->how much one class depends on another class
//cohesion-> responsiblities of class belong together
   //two types->high,low

//eg:low cohersion
// class room{
//void lightOn(){}
//void fanOn(){}
//void accoff(){}

//eg:high cohersion
//class light{high cohesion->lighton(),lightoff()}
//class fan{ fanon(),fanoff()}


//TASK:
//Smart home automation System//Trigger,device
 //->if motion is detected->light on
 //->if temp> 30degree C ->turn on AC
 //->At 7pm->light on
//It should support[[]]
 //->Multiple of device,
 //-> easy addition of new devices and rules in future
 //class light->both have turnOn and turnOff methods
 //class Ac->
 abstract class SmartDevice{
    abstract void Light();
    abstract void AC();
 }
 class SmartDevice extends
public class coupling {
    
}
