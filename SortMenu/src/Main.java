import java.util.*;

public class Main {
    public static void main(String[] args) {

        int choice;

        Sorting bubbleSort = new Sorting();
        Menu inputUtil = new Menu();


        Scanner sc = new Scanner(System.in);


        System.out.println("menu:");
        System.out.println("1. Ascending order");
        System.out.println("2. Descending order");
        System.out.println("3. Alphabetical order");
        System.out.println("4. Reverse alphabetical order");
        System.out.println("0. Exit program");

        //do while loop
        do {
            System.out.println("select 0-4:");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    // 1. ascending order
                    inputUtil.printArray(bubbleSort.SortAscending(inputUtil.retrieveNumbers()));
                    break;
                case 2:
                    // 2. descending order
                    inputUtil.printArray(bubbleSort.SortDescending(inputUtil.retrieveNumbers()));
                    break;
                case 3:
                    // 3. alphabetical order
                    System.out.println(Arrays.toString(bubbleSort.SortAtoZ(inputUtil.retrieveLetters())));
                    break;
                case 4:
                    // 4. reverse alphabetical order
                    System.out.println(Arrays.toString(bubbleSort.SortZtoA(inputUtil.retrieveLetters())));
                    break;
                case 0:
                    // 0. Exit
                    System.out.println("exiting...");
                    break;
                default:
                    System.out.println("not valid");
            }
            System.out.println("-------------------------------------------------------------------------------------");
        } while (choice != 0);
    }
}