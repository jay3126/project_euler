
public class NthPrime {
	public static void main(String args[]){
		long prime=2;
		for(int i=1; i<=10000; i++){
			prime = LargestPrime.nextPrime(prime);
		}
		System.out.println(prime);
	}
}
