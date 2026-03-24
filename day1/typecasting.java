package day1;

import java.util.Scanner;

//implicity change internally , small to large
//explicity change by user/externally , large to small
public class typecasting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //getting input from user
        int z=sc.nextInt();
        String m=sc.next();
        String s=sc.nextLine();
        char l=sc.next().charAt(0);
        System.out.println(z+m+s+l);
        short a=5;
        double b=a;
        System.out.println(b);
        double c=6.5;
        int d=(int)c;
        System.out.println(d);
        sc.close();
}
}
