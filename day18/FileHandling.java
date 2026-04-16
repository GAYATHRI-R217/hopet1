package day18;
//open ,close,read,write,create,delete,append
//I/O streams 
/* 
1-------->
Byte Streams
-> Input streams->File input Stream ,Buffered input
->Output stream->File output,Buffered output

2-------->
Character streams
->Reader->File Reader,Buffered Reader
->Writer->File writer,Buffered Writer
 */
import java.io.File;
import java.io.IOException;
public  class FileHandling {
    public static void main(String[] args) throws IOException{
        try{
    File newFile =new File("Test.txt");
    if(newFile.createNewFile()){
    System.out.println("File Created: "+newFile.getName());
}
else{
    System.out.println("Not able to create file");
}
        }
catch(IOException e){
System.out.print("e.getMessage()="+e.getMessage());
e.printStackTrace();
}
    }
}
