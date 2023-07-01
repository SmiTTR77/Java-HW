import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task {
	public static ArrayList<String[]> myList = new ArrayList<>();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("-------------------------");
		mainMenu();
		System.out.println("-------------------------");

	}

	public static void mainMenu() {
		System.out.println(
				"Меню: \n1. Ввести данные \n2. Показать данные (без сортировки) \n3. Показать данные (сортировка по возрасту) \n4. Выход");
		System.out.println("-------------------------");

		System.out.println("Выберите пункт меню: ");
		int menuItem = in.nextInt();

		switch (menuItem) {
			case 1: { // Ввод данных
				InputData(in.nextLine());
				break;
			}
			case 2: { // Показать даннае
				ShowData(myList, 0);
				break;
			}
			case 3: { // Сортировать данные
				ShowData(myList, 1);
				break;
			}
			case 4: {
				in.close();
				break;
			}
		}

	}

	public static void InputData(String str) {
		String[] myStr;

		System.out.println("-------------------------");
		System.out.println(
				"Введите данные в формате: \n<Фамилия> <Имя> <Отчество> <возраст> <пол> или нажмите <ввод> для выхода в <меню>: ");

		while (true) {
			myStr = GetArrayString(str);
			if (myStr == null) {
				System.out.println("-------------------------");
				mainMenu();
			}
			myList.add(myStr);
		}
	}

	public static String[] GetArrayString(String str) {
		str = in.nextLine();
		str.strip().split(" ");
		String[] result;
		result = str.strip().split(" ");

		if (result.length != 5) {
			return null;
		}
		return result;
	}

	public static void ShowData(ArrayList<String[]> arrList, int sortItem) {
		System.out.println("-------------------------");

		arrList.sort(new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				int res = Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
				return res * sortItem;
			}
		});
		for (String[] myStr : arrList) {
			System.out.println(String.format("%s %s. %s. %s %s", myStr[0], myStr[1].charAt(0), myStr[2].charAt(0),
					myStr[3], myStr[4]));
		}
	}
}

// Задание:
// 1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол
// 2. Вывод в формате Фамилия И.О. возраст пол
// 3. Добавить возможность выхода или вывода списка отсортированного по
// возрасту!)
// 4. *реализовать сортировку по возрасту с использованием индексов
// 5. *реализовать сортировку по возрасту и полу с использованием индексов