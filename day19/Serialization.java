package day19;
import java.io.*;
//Java.io.package 
//Product P: new Product()
//Obj->byte streams->Files
//Converting object into byte stream and storing it in file/database to maintain the state of the object is called Serialization.
//platform independent
import java.io.Serializable;
class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
public class Serialization {
    public static void main(String[] args)throws IOException {
        Student s=new Student("XYZ",44);
        FileOutputStream fo=new FileOutputStream("student.txt");
        ObjectOutputStream oo=new ObjectOutputStream(fo);//object to byte stream
        oo.writeObject(s);//writing on file
        fo.close();
        oo.close();
        

    }
}
