import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите колличество элементов: ");
		int size = in.nextInt();
		in.close();

		ArrayList<Integer> numList = new ArrayList<>(randomList(size));

		System.out.println("Исходный массив:" + numList);

		System.out.println("1. Нечетный массив: " + oddList(numList));
		System.out.println("2. Минимальное значение: " + Collections.min(numList));
		System.out.println("3. Максимальное значение: " + Collections.max(numList));
		System.out.println("4. Среднее значение: " + average(numList));
	}

	public static ArrayList<Integer> randomList(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new Random().nextInt(100));
		}
		return list;
	}

	public static ArrayList<Integer> oddList(ArrayList<Integer> arrLst) {
		for (int i = 0; i < arrLst.size(); i++) {
			if (arrLst.get(i) % 2 == 0) {
				arrLst.remove(arrLst.get(i));
			}
		}
		return arrLst;
	}

	public static int average(ArrayList<Integer> arrLst) {
		int sum = 0;
		for (int i = 0; i < arrLst.size(); i++) {
			sum += arrLst.get(i);
		}
		int res = sum / arrLst.size();
		return res;
	}
}
