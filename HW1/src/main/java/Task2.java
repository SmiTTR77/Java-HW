import java.util.Random;

public class Task2 {
    // public static int i;
    // public static int n;

    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println("1. Выпавшее случайное число i = " + i);

        int n = Integer.toBinaryString(i).length();
        System.out.println("2. Номер старшего значащего бита числа " + i + " равен: " + n);

        // point_1(); // считает i
        // point_2(i); // не принимает значение i,
        point_3(i, n);
        point_4(i, n);
    }

    // public static int point_1() {
    // int i = new Random().nextInt(2000);
    // System.out.println("1. Выпавшее случайное число i = " + i);
    // return i;
    // }

    // public static int point_2(int i) {
    // int n = Integer.toBinaryString(i).length();
    // System.out.println("2. Номер старшего значащего бита числа " + i + " равен: "
    // + n);
    // return n;
    // }

    public static void point_3(int i, int n) {
        int m1_count = 0;

        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1_count++;
            }
        }

        int[] m1 = new int[m1_count];

        System.out.println("3. Все кратные " + n + " числа, в диапозоне от " + i + " до " + Short.MAX_VALUE + ": ");

        for (int j = i, k = 0; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[k] = j;
                System.out.print(m1[k] + ", ");
                k++;
            }
        }
    }

    public static void point_4(int i, int n) {

        int m2_count = 0;

        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m2_count++;
            }
        }

        int[] m2 = new int[m2_count];

        System.out.println("4. Все НЕкратные " + n + " числа, в диапозоне от " + Short.MIN_VALUE + " до " + i + ": ");

        for (int j = Short.MIN_VALUE, k = 0; j < i; j++) {
            if (j % n != 0) {
                m2[k] = j;
                System.out.print(m2[k] + ", ");
                k++;
            }
        }
    }
}