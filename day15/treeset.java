package day15;
import java.util.TreeSet;
//TreeSet user self-balancing Tree(Red-Black Tree) internally
//Binary Search Tree(BST)
//inorder traversal of BST is sorted order Left-Root-Right
//Self balancing Tree: AVL Tree, Red-Black Tree
//add(O)
//remove(O)
//contains(O)
//first() print lowest element
//last() print highest element
//ceil() check highest
//floor() check lowest
//higher() check higher than given element
//lower() check lower than given element
//treeSet find the closest element to given element



public class treeset {
    //Print the colsest element to given element
    int closestElement(int[] arr,int target){
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int num: arr){
            treeSet.add(num);
        }
        Integer floor = treeSet.floor(target);
        Integer ceil = treeSet.ceiling(target);
        if(floor == null) return ceil;
        if(ceil == null) return floor;
        if(Math.abs(target - floor) <= Math.abs(target - ceil)){
            return floor;
        }else{
            return ceil;
        }
        }
        public static void main(String[] args) {
            treeset ts = new treeset();
            int[] arr = {10, 15,20, 25, 40};
            int target = 20;
            int closest = ts.closestElement(arr, target);
            System.out.println("Closest element to " + target + " is: " + closest);
        }

}
