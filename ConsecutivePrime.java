
public class ConsecutivePrime {
	private static final int NUM = 1000000;
	int[] primes=new int[NUM];
	int counter=0;
	long maxPrime=2;
	int maxChainLength;
	int[] numbers = new int[NUM];

	public static void main(String args[]){
		long start = System.currentTimeMillis();
		ConsecutivePrime c = new ConsecutivePrime();
		c.generatePrimes();
		System.out.println("Primes generated in " + (int)(System.currentTimeMillis() - start)/1000);
		c.generateChains();
		System.out.println((int)(System.currentTimeMillis() - start)/1000);
	}
	
	public int findChain(long prime){
		for(int i=0; i<counter; i++){
			long sum=0;
			if(counter - i < maxChainLength)
				break;
			for(int j=i; j<counter; j++){
				sum=sum+primes[j];
				if((j -i + 1)>maxChainLength){
					if(sum>prime)
						break;
					if(sum==prime){
						if(maxChainLength < (j - i + 1)){
							maxChainLength = j - i + 1;
							maxPrime=prime;
						}
						break;
					}
				}
			}
		}
		return maxChainLength;
	}
	
	public int findChain2(){
		int[] sums = new int[NUM];
		int chainLength=(int)Math.pow(NUM, 0.1);
		
		while(chainLength<(int)Math.pow(NUM, 0.5)){
			for(int i=0; i<NUM; i++){				
				if(i>=chainLength)
					sums[i]=sums[i] + primes[i-chainLength];				
			}

			for(int j=sums.length-1; j>=chainLength; j--){
				if(sums[j]<NUM && numbers[sums[j]]>0 && primes[j]>0){
					if(maxChainLength<chainLength){
						maxPrime = numbers[sums[j]];
						maxChainLength = chainLength;
						//System.out.println(j + " -- " + chainLength + " -- "+ numbers[sums[j]] + " -- " + sums[j]);
					}
				}
			}

			chainLength++;
		}
		return 0;
	}
	
	public void generateChains(){
		int prime=2;
		int max=0;
		int length=0;
		
		int totalCount=counter;		
		int counter=0;
		
		//System.out.println(prime);
		//this.primes[counter++]=prime;
		//prime = (int)LargestPrime.nextPrime(prime);
		length=findChain2();
		
		if(length>max)
			max=length;
		
		System.out.println(maxPrime);
		System.out.println(maxChainLength);

	}
	
	public void generatePrimes(){
		int prime=2;
		
		for(int i=2; i<NUM; i++){
			numbers[i]=i;
		}
		
		while(prime<NUM){
			int pointer=prime;

			while(pointer<NUM){
				if(numbers[pointer] != 0 && pointer>prime){
					numbers[pointer]=0;
				}
				pointer = pointer + prime;
			}
			prime++;
			while(prime<NUM && numbers[prime]==0){
				prime++;
			}
		}
		
		for(int i=2; i<NUM; i++){
			if(numbers[i]==i){
				primes[counter++]=i;
			}
		}	
	}
}
