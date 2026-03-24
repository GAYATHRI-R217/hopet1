package day3;
import java.util.Scanner;

public class noofwordinstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String s="Learning java programming";
        String s=sc.nextLine();
        String[] words=s.split(" ");
        System.out.println("Number of words in the string: "+words.length);
        sc.close();
    }
}
