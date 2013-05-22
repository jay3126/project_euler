import java.math.*;

public class LargestPrime {
	public static void main(String args[]){
		long largestPrime=2;
		long num = 600851475143L;
		int sqrt = (int)(Math.pow(num, 0.5));
		System.out.println(num);
		
		while(largestPrime <= sqrt){
			//System.out.println(largestPrime);
			if(num % largestPrime == 0){
				System.out.println(largestPrime);
			}
			largestPrime = nextPrime(largestPrime);
		}
		//System.out.println(largestPrime);
	}
	
	public static long nextPrime(long n){
		if(n == 1)
			return 2;
		n = n + 1;
				
		while(true){
			if(isPrime(n)){
				return n;
			}
			if(n%2==0)
				n = n + 1;
			else
				n = n + 2;
		}
	}
	
	public static boolean isPrime(long n){
		boolean isPrimeNum = true;
		int sqrt = (int)(Math.pow(n, 0.5));

		for(int i=2; i<=sqrt; i++){
			if(n % i == 0){
				isPrimeNum = false;
			}
		}
		return isPrimeNum;
	}
}
