package day22;
//Process the data from collections array input and output
//Sequence of elements supports functional operations
//Java7:Imperative style(loops,mutation)
//JAva8+:Declarative style less Boilerplate
//Streams work as pipeline of Operations
//Source->Intermediate operation->Terminal operator
import java.util.List;
public class Streams {
    public static void main(String[] args){
        List<Integer>num=List.of(2,3,4,5,6);
        List<Integer>mulBy2=num.stream().map((i)->i*2).toList();
        System.out.println(mulBy2);
    }
    
}
