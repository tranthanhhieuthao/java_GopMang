import java.util.Scanner;

public class TotalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayA = new int[5];
        int[] arrayB = new int[4];
        int[] arrayC = new int[9];
        System.out.println("Nhap phan tu mang A:");

        for (int i = 0; i < arrayA.length; i++) {
            int x = scanner.nextInt();
            arrayA[i] = x;
        }
        System.out.println("Nhap phan tu mang B:");
        for (int i = 0; i < arrayB.length; i++) {
            int y = scanner.nextInt();
            arrayB[i] = y;
        }
        for (int i = 0; i <arrayA.length; i++) {
                arrayC[i] = arrayA[i];
        }
        for (int i =0; i <arrayB.length; i++) {
            arrayC[i+arrayB.length+1] = arrayB[i];
        }
        System.out.println(" mang A:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arrayA[i]+" "+",");
        }
        System.out.println(" ");
        System.out.println("mang B:");
        for (int i = 0; i < 4; i++) {
            System.out.print(arrayB[i]+" "+",");
        }
        System.out.println(" ");
        System.out.println("mang C:");
        for (int i = 0; i < 9; i++) {
            System.out.print(arrayC[i]+" "+",");
        }
    }
}
