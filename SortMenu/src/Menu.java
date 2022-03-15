import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);


    public int[] retrieveNumbers() {
        System.out.println("Enter Numbers separated with - ");
        String userInput = scanner.next();
        String[] splitArray = userInput.split("-");

        int[] numbers = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            numbers[i] = Integer.parseInt(splitArray[i]);
        }
        return numbers;
    }


    public char[] retrieveLetters() {
        System.out.println("Enter Letters");
        String userInput = scanner.next();
        return userInput.toCharArray();
    }


    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}