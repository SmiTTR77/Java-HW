import java.io.FileReader;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) throws Exception {
		StringBuilder jsonStr = new StringBuilder();
		try (FileReader reader = new FileReader(
				"HW2/src/main/java/txt/sql1.txt")) {
			int c;
			while ((c = reader.read()) != -1) {
				jsonStr.append((char) c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(sqlRequest(jsonStr));
	}

	private static String sqlRequest(StringBuilder builder) {
		String str = new String(builder);
		if (str.length() != 0) {

			str = str.replace("{", "");
			str = str.replace(":", "=");
			str = str.replace("\"", "");
			str = str.replace("}", "");

			String[] strList = str.split(", ");
			str = "select * from students where " + strList[0] + ", " + strList[1] + ", " + strList[2] + ", "
					+ strList[3];
		} else
			str = "Empty File";
		return str;
	}
}