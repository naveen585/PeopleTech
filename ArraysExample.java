import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        //Static array creation
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        //inserting data
        for(int i =0; i< arr.length;i++){
            arr[i] = scan.nextInt();
        }
        //traversing the array
        for(int i =0; i< arr.length;i++) {
            System.out.println("Element present at index " + i +" is " + arr[i]);
        }

        //deletion of an item
        System.out.println("Enter the item index you trying to delete: ");
        int k = scan.nextInt();
        System.out.println("Before deletion the element at index "+k+" is "+arr[k]);
        arr[k] = 0;
        System.out.println("After deletion the element at index "+k+" is "+arr[k]);
    }
}