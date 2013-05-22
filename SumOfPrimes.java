
public class SumOfPrimes {
	public static void main(String args[]){
		long lastPrime=2;
		long num = 2000000L;
		long sum = 0;
		
		while(lastPrime < num){
			sum = sum + lastPrime;
			lastPrime = LargestPrime.nextPrime(lastPrime);
		}	
		System.out.println(sum);
	}
}
