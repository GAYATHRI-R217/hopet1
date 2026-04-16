package day18;

import java.io.IOException;
import java.io.FileWriter;
public class Write {
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("test.txt");
            writer.write("write using FileWriter1");
            writer.write(65);
            writer.write("write using FileWriter");

            writer.close();
        }
        catch(IOException e){
System.out.println(e);
        }
    }
    
}
