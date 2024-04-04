package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        // Create a list with at least 10 integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // find the sum of even numbers
        int sumEven = sumEven(numbers);
        System.out.println("Sum of even numbers: " + sumEven);

        // print words with a specific length
        printWordsWithLength(numbers);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printWordsWithLength(ArrayList<Integer> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word length to search: ");
        int length = scanner.nextInt();

        // Converting integer values to words
        ArrayList<String> words = new ArrayList<>();
        for (int number : arr) {
            words.add(Integer.toString(number));
            words.add("To"); // 2
            words.add("Me"); // 2
            words.add("Hi"); // 2
            words.add("Ape"); // 3
            words.add("Ten"); // 3
            words.add("Fly"); // 3
            words.add("Four"); // 4
            words.add("Play"); // 4
            words.add("Flag"); // 4
            words.add("Apple"); // 5
            words.add("Maple"); // 5
            words.add("Later"); // 5
            words.add("Banana"); // 6
            words.add("Blower"); // 6
            words.add("Titans"); // 6
            words.add("Alabama"); // 7
            words.add("Country"); // 7
            words.add("Inspire"); // 7
            words.add("Cellular"); // 8
            words.add("Bookworm"); // 8
            words.add("Swimming"); // 8
            words.add("Crocodile"); // 9
            words.add("Commander"); // 9
            words.add("Framework"); // 9
            words.add("Validation"); // 10
            words.add("Washington"); // 10
            words.add("Toothbrush"); // 10
        }

        System.out.println("Words with " + length + " letters:");
        for (String word : words) {
            if (word.length() == length) {
                System.out.println("Words with the number " + length + " are:" + words);
            }
        }
    }
}