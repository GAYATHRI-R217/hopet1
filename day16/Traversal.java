package day16;
//Traversal->Traversing collection element by element through cursor
//hasNext() and next() method of Iterator interface
//hasNext() method returns true if there are more elements to iterate over, otherwise it returns false
//next() method returns the next element in the iteration and advances the cursor position by one

public class Traversal {
     public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            int current = it.next();
            if(current == 4){
                it.remove();
            }
        }
        while(it.hasPrevious()){
            int prev = it.previous();
            System.out.print(prev);
        }
        System.out.println(list);
    }
}