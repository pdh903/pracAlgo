// 주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면
// 1을, 존재하지 않으면 0을 반환하는 함수를 작성하라
// arr의 각 수 는 0 이상 100 이하이고 N은 1000이하이다.

import java.util.Scanner;

public class ex_0x001 {
    static int func2(int[] arr, int len) { // 인덱스를 생각해보자
        int[] idx = new int[101];
        for (int i = 0; i < len; i++) {
            if (idx[100 - arr[i]] == 1) {
                return 1;
            }
            idx[arr[i]] = 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(func2(arr, len));
        }

    }
}
