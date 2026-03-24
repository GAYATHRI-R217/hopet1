package day3;

public class Method2 {
    static void change(int x)
{
    x=20;
    System.out.println("Inside Method "+x);
}
public static void main(String[] args) {
    int x=50;
    change(x);
    System.out.println("Outside Methos "+x);
}
}