import java.util.*;

public class Task1 {
    public static HashMap <Integer, ArrayList> phoneBook = new HashMap<Integer, ArrayList>();

    public static Integer id = 1;
    public static String name;
    public static String surname;
    public static Integer phone;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        MainMenu();
        System.out.println("------------------------------------");
    }

    public static ArrayList<Object> GetNewContact(){
        ArrayList <Object> newContact = new ArrayList <Object> ();
        sc.nextLine();
        System.out.println("Введите Имя:");
        name = sc.nextLine();
        newContact.add(name);

        System.out.println("Введите Фамилию:");
        surname = sc.nextLine();
        newContact.add(surname);

        System.out.println("Введите номер телефона:");
        phone = sc.nextInt();
        newContact.add(phone);

        return newContact;
    }
    public static void GetAddContact(){
        phoneBook.put(id,GetNewContact());
        id +=1;
        MainMenu();
    }

    public static void ShowContact(){
        for (int i: phoneBook.keySet()) {
            StringBuilder str = new StringBuilder();
            for (Object value : phoneBook.get(i)) {
                str.append(value);
                str.append(" ");
            }
            System.out.println(i + ". " + str);
        }
        MainMenu();
    }

    public static void GetSortContact(){
        ArrayList <String> sortedList = new ArrayList<>();
        for (int i: phoneBook.keySet()) {
            StringBuilder str = new StringBuilder();
            for (Object value : phoneBook.get(i)) {
                str.append(value);
                str.append(" ");
            }
            String newString = str.toString();
            sortedList.add(newString);
        }
        Collections.sort(sortedList);

        for(int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
        MainMenu();
    }


    public static void MainMenu(){
        System.out.println("\nВыберите пункт Меню: \n1. Добавить контакт \n2. Показать контакты \n3. Сортировать контакты \n4. Выход");

        int menuItem = sc.nextInt();
        switch (menuItem){
            case 1:
                GetAddContact();
                break;
            case 2:
                ShowContact();
                break;
            case 3:
                GetSortContact();
                break;
            case 4:
                sc.close();
                break;
        }
    }
}

