import java.util.*;
/**
 * Author: Aubrie McIntyre
 * Date: 10/2/2024
 * Description: User will input an amount of numbers, and the code will output which of those numbers repeats the most.
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count , max = 0;
        // Creates two ArrayLists
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        System.out.println("Input: ");
        // Loop will stop if user enters 0
        while (true) { 
            int num = sc.nextInt();
            // If it is 0 then break the loop
            if (num == 0) {
                break;
            }
            // Otherwise add the number into list
            else {
                list.add(num);
            }
        }
        // Create an array to store occurrences of each number
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                    count++;
                }
            }
            // Store into array
            arr[i] = count;
        }
        // Find maximum number in the array
        max = arr[0];
        for (int i=0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                break;
            }
        }
        // Store the number having max occurences
        for (int i = 0; i < arr.length; i++) {
            if(max == arr[i]) {
                temp.add(list.get(i));
            }
        }
        System.out.println("\nOutput:");
        // Print the unique numbers having most occurrences
        for (int i = 0; i < temp.size(); i++) {
            int j;
            for (j = 0; j < temp.size(); j++) {
                if(Objects.equals(temp.get(i), temp.get(j))) {
                    break;
                }
            }
            if (i == j) {
                System.out.print( temp.get(i) + " ");
            }
        }
    }
}