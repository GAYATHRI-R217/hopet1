package day18;
//FileReader ->.read()method ->returns ASCII value of the character read
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
public class FileReader {
    public static void main(String[] args) {
        try{
            //FileReader fr=new FileReader("test.txt");
            BufferedReader fr=new BufferedReader(new FileReader("test.txt"));
            int character;
            while(character=fr.read()!=-1){
                System.out.print((char)character);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}
