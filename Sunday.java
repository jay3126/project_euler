
public class Sunday {
	public static void main(String args[]){
		int startYear = 1901;
		int endYear=2000;
		int sundays = 0;
		
		for(int year=startYear; year<=endYear; year++){
			for(int month=1; month<=12; month++){
				System.out.println("Year=" + year + ", month=" + month + ", day=" + startingDayOfMonth(year, month));
				if(startingDayOfMonth(year, month)==0)
					sundays++;
			}
		}		
		System.out.println(sundays);
	}
	
	public static int startingDayOfYear(int year){
		int firstDay=1;
		for(int i=1901; i<=year; i++){
			firstDay = (firstDay + (isLeap(i-1) ? 366 : 365)) % 7;
		}
		return firstDay;
	}
	
	public static int startingDayOfMonth(int year, int month){
		int firstDay = startingDayOfYear(year);
		for(int i=2; i<=month; i++){
			int days = daysInMonth(i-1, year);
			firstDay = (days + firstDay) % 7;
			if(firstDay<0)
				firstDay = 7 + firstDay;			
		}
		return firstDay;
	}
	
	public static int sundaysInMonth(int month, int year, int firstDay){
		int counter=0;
		for(int i=0; i<daysInMonth(month, year); i++){
			if(firstDay == 0)
				counter++;
			firstDay = firstDay	+ 1;
			if(firstDay == 7)
				firstDay=0;
		}
		return counter;
	}
	
	public static int daysInYear(int year){
		if(isLeap(year)){
			return 366;
		}else{
			return 365;
		}
	}
	
	public static boolean isLeap(int year){
		if(year % 100 == 0 && year % 400 == 0){
			return true;
		}else if(year % 4 == 0 && year % 100 != 0){
			return true;
		}else{
			return false;
		}	
	}
	
	public static int daysInMonth(int month, int year){
		if(month==2){
			if(isLeap(year))
				return 29;
			else
				return 28;
		}
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10||month==12){
			return 31;
		}else{
			return 30;
		}
	}
}
