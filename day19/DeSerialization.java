package day19;
import java.io.*;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[]args) throws Exception{
        FileInputStream fo=new FileInputStream("Student.txt");
        ObjectInputStream oo=new ObjectInputStream(fo);
        while(true){
            try{
                Student s=(Student)oo.readObject();
                System.out.println(s.name+" "+s.mark);
            }
            catch(EOFException e){
                break;
            }
        }
        fo.close();
        oo.close();
    }
    
}
