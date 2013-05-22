
public class CollazChain {
	public static void main(String args[]){
		long largest = 0;
		long length;
		
		for(long i=1; i<1000000; i++){
			length = collazChainLength(i);
			if(length > largest){
				largest = length;
				System.out.println(i + " -- " + length);
			}
		}
		System.out.println(largest);
	}
	
	public static long collazChainLength(long n){
		int counter=0;
		while(n>1){
			counter++;
			n=nextItem(n);
		}
		// counter increment 1 for "1"
		return ++counter;
	}
	
	public static long nextItem(long n){
		if(n == 1)
			return 1;
		if(n % 2 == 0)
			return(n/2);
		else
			return(3*n + 1);
	}
}
