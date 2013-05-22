
public class NumberLetterCounter {
	public static String[] unitWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	public static String[] teenWords = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public static String[] twentiesWords = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	public static void main(String args[]){
		int sum=0;
		for(int i=1; i<=1000; i++){
			System.out.println(numberToWords(i));
			sum=sum+numberToWords(i).length();
		}
		System.out.println(sum);
	}

	public static String numberToWords(int num){
		if(num%10>0 && num <10){
			return(unitNumberToWords(num % 10));
		}else if(num>=10 && num<20){
			return(tensNumberToWords(num - 11));			
		}else if(num>=20 && num<100){
			return(twentiesNumberToWords(num / 10) + numberToWords(num%10));
		}else if(num>=100 && num<1000){
			return(unitNumberToWords(num/100) + "hundred" + (num % 100 > 0 ? "and" : "") + numberToWords(num - 100*(num/100)));
		}else if(num>=1000){
			return(unitNumberToWords(num/1000) + "thousand" + numberToWords(num - 1000*(num/1000)));
		}else{
			return "";
		}
	}
	
	public static String twentiesNumberToWords(int num){
		return twentiesWords[num-1];
	}
	
	public static String tensNumberToWords(int num){
		return teenWords[num+1];		
	}

	public static String unitNumberToWords(int num){
		return unitWords[num];		
	}

}
