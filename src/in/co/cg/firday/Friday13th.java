package in.co.cg.firday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Friday13th {

	public static void main(String[] args) throws ParseException {
		LocalDate start = LocalDate.of(1900, 1, 1);
		LocalDate end = LocalDate.of(2000, 12, 31);

		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("list of Friday the 13th in the 20th Century: ");

		// date for loop
		for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
			// checking for friday and if it's on 13th
			if (date.getDayOfMonth() == 13 && (date.getDayOfWeek().toString().equalsIgnoreCase("Friday")))
				System.out.println(format2.format(format1.parse(date.toString())));

		}
	}
}
