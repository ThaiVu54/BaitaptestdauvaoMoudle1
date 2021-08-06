import java.util.Scanner;

class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrLength;
        System.out.print("Nhap so luong phan tu: ");
        arrLength = input.nextInt();

        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.print("so thu " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println("mang da nhap:");
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] result = evenFilter(arr, arrLength);
        System.out.print("cac phan tu chan la: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print("[" + result[i] + "]");
        }
    }

    static int[] evenFilter(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        int[] arrEven = new int[count];
        count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                arrEven[count++] = arr[i];
            }
        }
        return arrEven;
    }
}