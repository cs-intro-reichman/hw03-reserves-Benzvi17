/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar{	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January

	
	public static void main(String args[]) {
		int selected_year = Integer.parseInt(args[0]);
		while (year < selected_year){
			advance();
		}
		while (year == selected_year) {
			System.out.println(dayOfMonth + "/" + month + "/" + selected_year + (dayOfWeek == 1 ? " Sunday" : ""));
			advance();
			
		}
		
	
	}
	 	
	
	 public static void advance() {	
		dayOfWeek++;
		if (dayOfWeek > 7) {
			dayOfWeek = 1;
		}

		dayOfMonth++;
		if (dayOfMonth > nDaysInMonth(month, year)) {
			dayOfMonth = 1;
			month++;
			if (month > 12) {
				month = 1;
				year++;
				
			}
		}
		
	}  
    // Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		return (year % 400) == 0|| ((year % 4) == 0) && ((year % 100) != 0 );
	}
	 
	
	public static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 4:
			case 6: 
			case 9: 
			case 11:
				return 30;
			
				case 2: 
			return isLeapYear(year) ? 29 : 28;
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
		
			default:
				break;
		}
		return 0;
	
	}
}