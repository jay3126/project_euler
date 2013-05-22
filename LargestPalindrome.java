import java.math.*;

public class LargestPalindrome {
	public static void main(String args[]){
		int palid=0;
		
		for(int i=99; i<1000; i++){
			for(int j=99; j<1000; j++){
				if(i!=j){
					//System.out.println("i=" + i + ", j=" + j + ", pro:" + i * j);
					
					if(isPalindrome(i*j)){
						System.out.println("i=" + i + ", j=" + j + ", pro:" + i * j);
						if(palid < i * j)
							palid = i * j;
					}
				}
			}
		}
		System.out.println(palid);
	}
	
	public static boolean isPalindrome(int num){
		int original_number = num;
		int remainder;
		int reverse = 0;

		while(num > 0){
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		
		if(original_number==reverse)
			return true;
		else
			return false;
	}
}
