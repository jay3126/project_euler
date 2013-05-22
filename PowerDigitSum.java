
public class PowerDigitSum {
	private static final int ARR_LEN = 1000;

	public static void main(String args[]){
		int num=1000;
		System.out.println(getSum(num));
	}
	
	private static int getLength(char[] num){
		int numlength=0;

		while(num[numlength]!='\0'){
			numlength++;
		}
		return numlength;
	}
	
	public static int getSum(int endPower){
		char[] num = new char[ARR_LEN];
		num[0] = '2';
				
		int startPower=1;

		for(int i=startPower; i<endPower; i++){
			int rem=0;
			for(int j=0; j<getLength(num); j++){
				rem = rem + ((int)num[j]-48) * 2;
				
				num[j]= (char)(rem % 10 + 48);
				rem = rem / 10;
			}
			if(rem>0){
				num[getLength(num)]=(char)(rem+48);
			}
		}
		return getSum(num);
	}
	
	public static int getSum(char[] num){
		int sum=0;
		for(int j=0; j<getLength(num); j++){
			sum=sum+(int)num[j]-48;
		}
		return sum;	
	}
}
