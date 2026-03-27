package day8;
import java.util.Scanner;
class stringpattern{
public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    String s=sc.nextLine();
    //String res="";
    StringBuilder res= new StringBuilder();
    //String[] arr=s.split(""); 
    for(int i=0;i<s.length();i+=2){
        //if(i%2==0){
            //res.append(arr[i]);
            res.append(s.charAt(i));
        //}
    }
    for(int i=1;i<s.length();i+=2){
        //if(i%2!=0){
            //res.append(arr[i]);
            res.append(s.charAt(i));
        //}
    }
    System.out.println(res);
    sc.close();
}
}