
public class FifthPower {
	public static final int NUM=5;
	public char[] digits=new char[10];
	public int[] powers=new int[10];
	
	public static void main(String args[]){
		FifthPower f = new FifthPower();
		f.generate();
		//f.permute(digits, 0, NUM);
	}
	
	private void generate() {
		permute();
	}
	
	public void permute(){	
		int sum=0;
		for(int number=2; number<(int)Math.pow(10, NUM)*2; number++){
			if(poweredNumber(number)){
				System.out.println(number);
				sum = sum + number;
			}
		}
		System.out.println(sum);
	}

	private boolean poweredNumber(int number) {
		int powered=0;
		int digit;
		int original_number = number;
		while(number > 0){
			digit = number % 10;
			powered = powered + (int)Math.pow(digit, NUM);
			number = number / 10;
		}
		return(original_number==powered);
	}

	public void swap(int i, int j){
		char t=digits[i];
		digits[i]=digits[j];
		digits[j]=t;
	}
	
}
