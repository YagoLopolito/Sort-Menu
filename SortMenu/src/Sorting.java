public class Sorting {
    public int[] SortAscending (int[] arr) {
        int n = arr.length;

        for (int j = 0; j < n - 1; j++) {

            for (int i = 0; i < n - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        return arr;
    }

    // descending order
    public int[] SortDescending(int[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++)
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        return arr;
    }


    public char[] SortAtoZ(char[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        return arr;
    }

    public char[] SortZtoA(char[] arr) {
        int n = arr.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++)
                if (arr[i] < arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        return arr;
    }
}