package day10;
//Design locker System where user can store items securely
//Each locker protect its internal data and only controlled operation
//Requirements
//1.Each locker has a lockerId isLockers(Boolean)pin stored item
//2.operation store Item(item,pin) retrieve item(pin) lock() unlock(pin)
//3.Rules Items cannot access directly Locker opens only with crt pin
//Invalid access should be blocked
class Locker {
    private String  lockerId;
    private boolean isLocked;
    private String pin;
    private String storedItem;

    Locker(String lockerId, String pin) {
        this.lockerId = lockerId;
        this.pin = pin;
        this.isLocked = true; // Lockers are locked by default
    }
    public String getLockerId() {
        return lockerId;
    }
    public void storeItem(String item, String inputPin) {
        if(inputPin==pin){
            if(!isLocked){
            storedItem=item;
                System.out.println("stored successfully.");
            }
            else{
                System.out.println("Locker is locked. Please unlock it first.");
            }
        }else{
            System.out.println("Invalid PIN. Access denied.");
        }
    }
       /*if (isLocked) {
            System.out.println("Locker is locked. Please unlock it first.");
            return;
        }
        if (!inputPin.equals(pin)) {
            System.out.println("Invalid PIN. Access denied.");
            return;
        }
        this.storedItem = item;
        System.out.println("Item stored successfully.");
    }*/
    public void retrieveItem(String inputPin) {
        /*if (isLocked) {
            System.out.println("Locker is locked. Please unlock it first.");
            return;
        }
        if (!inputPin.equals(pin)) {
            System.out.println("Invalid PIN. Access denied.");
            return;
        }
        if (storedItem == null) {
            System.out.println("No item stored in the locker.");
            return;
        }
        System.out.println("Retrieved item: " + storedItem);
        storedItem = null; // Clear the locker after retrieval*/
        if (inputPin==pin){
            if(!isLocked &&storedItem!=null){
                System.out.println("Retrieved item: " + storedItem);
                storedItem=null;
            }
            else if(storedItem==null){
                System.out.println("Locker is empty. No item to retrieve.");
            }
            else{
                System.out.println("Locker is locked.");
            }
        }
        else{
            System.out.println("Pin is wrong.");
        }
    }
    public void lock() {
        isLocked = true;
        System.out.println("Locker locked.");
    }

    public void unlock(String inputPin) {
        /*if (!inputPin.equals(pin)) {
            System.out.println("Invalid PIN. Cannot unlock the locker.");
            return;
        }
        isLocked = false;
        System.out.println("Locker is now unlocked.");
    }*/
        if(inputPin==pin){
            isLocked=false;
            System.out.println("Locker unlocked.");
        }
        else{
            System.out.println("Wrong Pin.");
        }
    }
}
public class Encapsulationtask {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        String inputPin=sc.next();
        Locker locker = new Locker("L001", "1234");
        locker.unlock(inputPin);
        locker.storeItem("Laptop", inputPin);
        locker.retrieveItem(inputPin);
        locker.lock();
        sc.close();*/
        Locker l1= new Locker("1", "123456");
        l1.unlock("123456");
        l1.storeItem("Bag","123456");
        l1.retrieveItem("123456");
        l1.lock();
}
}
