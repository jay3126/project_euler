
public class SmallestMultiple {
	public static void main(String args[]){
		long num=1;
		boolean flag = true;
		int[] factors = new int[100];
		int counter = 0;
		
		for(int d=1; d<=20; d++){
			if(LargestPrime.isPrime(d)){
				num = num * d;
				//System.out.println(d);
				factors[counter++] = d;
			}
					
			if(num % d != 0){
				int leftover = d;

				for(int i=0; i<counter; i++){
					if(num % d !=0 && leftover % factors[i] == 0){
						leftover = leftover/factors[i];
						num = num * factors[i];
					}
				}

			}
		}	
		System.out.println(num);
	}
}
