
public class HighlyDivisible {
	public static void main(String args[]){
		int desiredDivisors=500;
		int triangleNumber = 1;
		int counter = 1;
		int numberOfDivisors;
		
		while(true){
			//System.out.println(triangleNumber);
			numberOfDivisors = findNumberOfDivisors(triangleNumber);
			//System.out.println("Triangle number: " +  triangleNumber + ", k="+ counter + ", num. of divisors:" + numberOfDivisors);
			
			if(numberOfDivisors>=desiredDivisors){
				System.out.println(triangleNumber);
				break;
			}

			triangleNumber = findNextTriangleNumber(triangleNumber, counter);
			counter++;
		}
	}
	
	public static int findNumberOfDivisors(int n){
		int count=1;
		int primeCount=0;
		long prime=2;
		while(n>1){
			if(n%prime==0){
				primeCount++;
				n=(int)(n/prime);
			}else{
				if(primeCount>0)
					count=count*(primeCount+1);
				primeCount=0;
				prime = LargestPrime.nextPrime(prime);
			}
		}
		if(primeCount>0)
			count=count*(primeCount+1);

		return count;
	}

	public static int findNextTriangleNumber(int n, int k){
		return n + k + 1;
		
	}
}
