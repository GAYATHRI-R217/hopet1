package day7;
//Task:Mini game
//game have 3 Characters-warrior,archer and mage
//All character have attack warrior-> attack with sword, archer-> attack with arrow
//mage-> attack with magic
//one common reference(name)
class name{
    String name;
    name(String name){
        this.name=name;
    }
}
class Character extends name{
    Character(String name){
        super(name);
    }
    void attack(){
        System.out.println(name+"Attack with weapon");
    }
}
class Warrior extends Character{
    Warrior(String name){
        super(name);
    }
    @Override
    void attack(){
        System.out.println( name +" Attack with sword");
    }
}
class Archer extends Character{
    Archer(String name){
        super(name);
    }
    @Override
    void attack(){
        System.out.println(name+" Attack with arrow");
    }
}
class Mage extends Character{
    Mage(String name){
        super(name);
    }
    @Override
    void attack(){
        System.out.println(name+" Attack with magic");
    }
}
public class task {
    public static void main(String[] args) {
        Character[] c={new Warrior("Arjun"), new Archer("Aravind"), new Mage("Magesh")};
        for(Character a:c){
            a.attack();
        }
        /*c=new Warrior("Warrior");
        c.attack();
        c=new Archer("Archer");
        c.attack();
        c=new Mage("Mage");
        c.attack();*/
    } 
}
