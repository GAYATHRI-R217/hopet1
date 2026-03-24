package day3;
public class StringTest {
    public static void main(String[]args){
        String s="Learning java programming";
        //System.out.println(s.length());
        String[] arr=s.split(" ");
        for(String i:arr){
            System.out.print(i);
        }
        s=s.replace("java","python");
        System.out.print(s);
        for(char c:s.toCharArray()){
            System.out.print(c);
        }
        //StringBuilder s3=new StringBuilder(s);
        char[]ch={'a','b','c'};
        System.out.println(new String (ch));
    }
    }
