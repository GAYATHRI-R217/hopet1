package day8;
import java.util.Scanner;
public class nonrepeatingchar {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s=s.toLowerCase();
    int[] freq=new int[256];
    for(int i=0;i<s.length();i++){
        freq[s.charAt(i)]++;
    }
    for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)]==1){
            System.out.print(s.charAt(i)+" ");
        }
    }
    /*for(int i=0;i<s.length();i++){
        boolean un=true;
        for(int j=0;j<s.length();j++){
            if(i!=j&&s.charAt(i)==s.charAt(j)){
                un=false;
                break;
            }
        }
        if(un){
            System.out.print(s.charAt(i));
        }
    } */
    sc.close();
}
}

