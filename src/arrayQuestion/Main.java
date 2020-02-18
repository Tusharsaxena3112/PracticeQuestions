package arrayQuestion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[n2 - n1];
        int j = 0;
        for (int i = n1; i <= n2; i++) {
            int no = i;
            int d = 0;
            boolean isEven = false;
            while (no > 0) {
                d = no % 10;
                no = no / 10;
                if (d % 2 == 0) {
                    isEven = true;
                } else {
                    isEven = false;
                    break;
                }
            }
            if (isEven) {
                arr[j++] = i;
            }
        }
        int k = 0;
        while (arr[k] != 0) {
            if (arr[k] % 4 == 0 && arr[k] % 100 != 0 || arr[k] % 400 == 0) {
                System.out.println(arr[k] + " ");
            }
            k++;
        }
    }
}
