package day8;
import java.util.Scanner;
//no split;
public class evenl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //String w="";
        StringBuilder w= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                //w+=s.charAt(i);
                w.append(s.charAt(i));
            }
                else{
                    if(w.length()>0 && w.length()%2==0){
                        System.out.print(w+" ");
                    }
                //w="";
                w.setLength(0);
                }
        }
                if(w.length()%2==0){
                    System.out.print(w+" ");
        }
sc.close();
    }
}
