package day8;
import java.util.Scanner;

public class SECONDSMALLESSTRING {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        String shor=null;

        for(int i=0;i<=s.length();i++){   // changed < to <=
            char ch = (i==s.length()) ? ' ' : s.charAt(i);

            if(ch!=' '){
                sb.append(ch);
            }
            else{
                if(shor==null||shor.length()>sb.length()){
                    s = String.valueOf(arr[i]);   // ✅
                }
                sb.setLength(0);   // fixed case
            }
        }

        System.out.println(shor);
        sc.close();
    }
}




/* 
package day8;
import java.util.Scanner;
public class SECONDSMALLESSTRING {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder sb=new StringBuilder();
    String shor=null;
    for(int i=0;i<s.length();i++){
        
        if(s.charAt(i)!=' '){
            sb.append(s.charAt(i));
        }
        else{
            if(shor==null||shor.length()>sb.length()){
                shor=sb.toString();
            }
            sb.setlength(0);
        }
    }
    System.out.println(shor);
sc.close();
}
}*/