package day9;
import java.util.Scanner;
public class zigzagpattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int r=sc.nextInt();
        int n=r+1;
        int m=r-1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=i;j<s.length();j+=n){
                    sb.append(s.charAt(j));
                }
            }
            else{
                for(int k=i;k<s.length();k+=m){
                    sb.append(s.charAt(k));
                }
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
