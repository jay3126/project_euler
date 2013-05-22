public class QuadraticPrime {
	public static void main(String args[]){
		int[] primes=new int[1000];
		int prime=2;
		int counter=0;
		
		primes[counter++]=1;
		primes[counter++]=-1;

		while(prime<1000){
			primes[counter++]=prime;
			primes[counter++]=-1*prime;
			prime = (int)LargestPrime.nextPrime((long)prime);
		}
		
		int product=1;
		int max=0;

		for(int i=0; i<counter; i++){
			for(int j=0; j<counter; j++){
				int a=primes[i];
				int b=primes[j];
				if(b>0){
					int n = chainLength(a, b);
				
					if(n>max){
						max=n;
						product=a*b;
					}
				}
			}
		}
		System.out.println(product);
		System.out.println(max);

	}

	private static int chainLength(int a, int b){
		int n=0;
		boolean flag=true;
		while(flag){
			if(LargestPrime.isPrime(evaluate(n, a, b))){
				n++;
			}else{
				flag=false;
			}
		}
		return n;
	}
	
	private static int evaluate(int n, int a, int b) {
		return(Math.abs(n*n + a * n + b));
	}
}
