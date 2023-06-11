# **HomeWork Java:**
## **HomeWork 1:**
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
   Пункты реализовать в методе main
   Пункты реализовать в разных методах


*Подсказки:*

	int i = new Random().nextInt(k); //кидалка случайных чисел!)

	int n = 12;
        String a = Integer.toBinaryString(i);
        a.length();


## **HomeWork 2:**
Дана строка sql-запроса "select * from students where ".

Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.

Если значение null, то параметр не должен попадать в запрос.

Параметры для фильтрации:

		{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

В итоге должно получится

	select * from students where name=Ivanov, country=Russia, city=Moscow, age=null

## **Дополнительные задания**

Дана json-строка (можно сохранить в файл и читать из файла)

	[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

*Пример вывода:*

	Студент Иванов получил 5 по предмету Математика.
	Студент Петрова получил 4 по предмету Информатика.
	Студент Краснов получил 5 по предмету Физика.

*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.	