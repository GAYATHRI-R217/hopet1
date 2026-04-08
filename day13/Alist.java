package day13;
import java.util.ArrayList;
import java.util.Arrays;
public class Alist {
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        //remove duplicates
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3));
        ArrayList<Integer> uniqueList=new ArrayList<>();
        for(int i=0;i<list2.size();i++){
            if(!uniqueList.contains(list2.get(i))){
                uniqueList.add(list2.get(i));
            }
        }
        System.out.println(uniqueList);
//LinkedList->collections of node connected using reference

    }
    }
