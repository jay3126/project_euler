
public class CircularPrime {
	public int circularCount;
	public int num=1000 * 1000;
	
	public static void main(String args[]){
		CircularPrime c = new CircularPrime();	
		c.find();
		System.out.println(c.circularCount);
	}
	
	public void find(){
		int prime = 2;
		circularCount=0;
		while(prime<num){
			//System.out.println(prime);
			if(prime<=10)
				circularCount++;
			else{
				if(isCircular(prime)){
					circularCount++;
				}
			}
			prime = (int) LargestPrime.nextPrime(prime);
			int stepTo = stepBy(prime);
			if(stepTo > 0)
				prime = stepBy(prime);
		}
	}
	
	private int stepBy(int prime) {
		int digit;
		int order = orderOf(prime)-1;
		while(order>0){
			digit = (int) (prime / Math.pow(10, order));
			if(digit % 2 == 0 || digit == 5)
				return((digit+1) * (int)Math.pow(10, order));
			order--;
			digit = digit * 10;
		}
		return 0;
	}

	private boolean isCircular(int prime) {
		long orig = prime;
		int order = orderOf(prime);
		int leftover;
		boolean flag = true;
		for(int i=0; i<order; i++){
			leftover = (int) (prime % 10);
			prime = prime / 10;
			prime = prime + leftover * (int)Math.pow(10, order-1);
			//System.out.println("Prime " + orig + " new " + prime + " order " + order);

			if(!LargestPrime.isPrime(prime))
				return false;
		}
		return true;
	}

	public int orderOf(int prime){
		int n = 1;
		while(Math.pow(10, n)<prime){
			n++;
		}
		return n;
	}
}
