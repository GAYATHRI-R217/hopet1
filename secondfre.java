
import java.util.Scanner;
public class secondfre {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s="";
    String ss="";
    int sn=0;
    s1=s1.toLowerCase();    char[] arr=s1.toCharArray();
    for(int i=0;i<arr.length;i++){
        int c=1;
        for(int j=0;j<arr.length;j++){
            if(i!=j&&arr[i]==arr[j]){
                c++;
            }
        }
        if(sn==0||sn>c){
            ss=s;
            s=arr[i];
            sn=c;
        }
    }

System.out.println(ss);
    sc.close();
}
}
