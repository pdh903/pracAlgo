import java.util.ArrayList;
import java.util.Arrays;

public class array_test {

    static void insert(int idx, int num, int arr[]) {
        for (int i = arr.length-2; i > idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = num;
    }

    static void erase(int idx, ArrayList<Integer> arrL) {
        arrL.remove(idx);
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void printArr(ArrayList<Integer> arrL) {
        for (int i = 0; i < arrL.size(); i++) {
            System.out.print(arrL.get(i) + " ");
        }
        System.out.println();
    }


    static void insert_test() {
        System.out.println("insert_test");
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        insert(3, 40, arr);
        printArr(arr);
        insert(1, 50, arr);
        printArr(arr);
        insert(0, 15, arr);
        printArr(arr);

    }

    static void erase_test() {
        System.out.println("erase_test");
        ArrayList<Integer> arrL = new ArrayList<Integer>(Arrays.asList(10, 50, 40, 30, 70, 20));
        erase(4, arrL); // 10 50 40 30 20
        printArr(arrL);
        erase(1, arrL); // 10 40 30 20
        printArr(arrL);
        erase(3, arrL); // 10 40 30
        printArr(arrL);


    }

    public static void main(String[] args) {
        insert_test();
        erase_test();
    }
}
