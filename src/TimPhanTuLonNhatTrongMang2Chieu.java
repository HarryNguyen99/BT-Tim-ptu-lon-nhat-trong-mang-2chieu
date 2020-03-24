import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {

    static Scanner scanner = new Scanner(System.in);

    public static int nhapKichThuocMang(String type) {
        int m, n, result = 0;

        if (type.equals("hang")) {
            System.out.println("Nhập vào số dòng của ma trận: ");
            m = scanner.nextInt();
            result = m;
        } else if (type.equals("cot")) {
            System.out.println("Nhập vào số cột của ma trận: ");
            n = scanner.nextInt();
            result = n;
        }
        return result;
    }

    public static int[][] nhapMang(int[][] array) {
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }


    public static void xuatMang(int[][] array) {
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static int timPTuLonNhat(int[][] array) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int max;
        int[][] array = new int[nhapKichThuocMang("hang")][nhapKichThuocMang("cot")];
        System.out.println("Nhập mảng 2 chiều: ");
        nhapMang(array);
        System.out.println("Mảng 2 chiều: ");
        xuatMang(array);
        max = timPTuLonNhat(array);
        System.out.println("Phần tử lớn nhất: " + max);
    }
}
