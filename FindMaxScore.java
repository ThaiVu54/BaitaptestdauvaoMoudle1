import java.util.Scanner;

class Bai2 {
    public static void main(String[] args) {
        int arrLength;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong diem can nhap: ");
        arrLength = input.nextInt();

        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.print("diem thu " + i + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("mang diem da nhap:");
        for (int i = 0; i < arrLength; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        double findMax = findMaxScore(array, arrLength);
        System.out.println("max = " + findMax);
    }

    static int findMaxScore(int arrScore[], int length) {
        int maxScore = arrScore[0];
        for (int i = 1; i < length; i++) {
            if (maxScore < arrScore[i]) {
                maxScore = arrScore[i];
            }
        }
        return maxScore;
    }
}