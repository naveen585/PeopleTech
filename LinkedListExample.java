import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        //creation of linked list using default function
        LinkedList<Integer> linkedList = new LinkedList<>();
        //insertion of elements into linked list
        linkedList.add(25);
        linkedList.add(12);
        linkedList.add(14);
        linkedList.add(65);
        linkedList.add(42);
        Scanner scan = new Scanner(System.in);
        // Traversing the linkedlist
        int index =0;
        for(int value : linkedList){
            System.out.println("The value present at index "+index+" is "+value );
            index++;
        }
        //deletion of an element from linked list
        System.out.println("Enter the index to delete:");
        int k = scan.nextInt();
        System.out.println("Before deletion the element at index "+k+" is "+ linkedList.get(k));
        linkedList.remove(k);
        System.out.println("After deletion the element at index "+k+" is "+ linkedList.get(k));
    }
}
