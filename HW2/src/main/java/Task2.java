import java.io.FileReader;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws Exception {
		StringBuilder jsonStr = new StringBuilder();
		try (FileReader reader = new FileReader("HW2/src/main/java/txt/sql2.txt")) {
			int c;
			while ((c = reader.read()) != -1) {
				jsonStr.append((char) c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		jsonParse(jsonStr);
	}

	private static void jsonParse(StringBuilder builder) {
		String str = new String(builder);

		str = str.replace("[", ",");
		str = str.replace("]", "");
		str = str.replace("{", "");

		String[][] strmass = new String[3][3];
		if (str.trim().length() != 0) {
			String[] strList1 = str.split("}");
			for (int i = 0; i < strList1.length; i++) {
				strList1[i] = strList1[i].replace("}", "");
				String[] strList2 = strList1[i].split(",");
				for (int j = 1; j < strList2.length; j++) {
					strmass[i][j - 1] = strList2[j].substring(strList2[j].indexOf(':') + 1).replace("\"", "");
				}
				System.out.println("Студент " + strmass[i][0] + " получил " + strmass[i][1] + " по предмету "
						+ strmass[i][2] + ".");
			}
		} else
			System.out.println("Empty file");
	}
}