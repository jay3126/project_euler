import java.math.BigDecimal;
import java.math.BigInteger;


public class SelfPowers {
	static int number = 1000;
	
	public static void main(String args[]){
		BigInteger sum=BigInteger.valueOf(0);
		
		for(Integer i=1; i<=number; i++){
			sum = sum.add(BigInteger.valueOf((long) Math.pow(i, i)));
		}
		System.out.println(sum);
	}
}
