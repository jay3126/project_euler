public class AmicablePairs {
	public static void main(String args[]){
		int sum=0;
		for(int i=1; i<=10000; i++){
			if(isAmicable(i)){
				//System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isAmicable(int n){
		int pair = properDivisors(n);
		if(properDivisors(pair)==n && pair!=n){
			return true;
		}
		return false;	
	}
	
	public static int properDivisors(int n){
		int sum=0;
		for(int i=1; i<n; i++){
			if(n % i == 0){
				sum=sum+i;
			}
		}
		return sum;
	}
}
