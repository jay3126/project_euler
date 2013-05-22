import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class AbundantNumbers {
	public static void main(String args[]){
		ArrayList<Integer> numbers = abundantNumberGenerator(28123);
		Set<Integer> abundantSums  = new HashSet();
		
		for(int i=0; i<numbers.size(); i++){
			for(int j=i; j<numbers.size(); j++){
				abundantSums.add(numbers.get(i) + numbers.get(j));
			}
		}
		System.out.println(abundantSums);
		int sum=0;
		for(int i=1; i<=28123; i++){
			if(!abundantSums.contains(i))
				sum=sum+i;
		}
		System.out.println(sum);
	}

	public static ArrayList<Integer> abundantNumberGenerator(int n){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1; i<n; i++){
			if(i<AmicablePairs.properDivisors(i)){
				numbers.add(i);
			}
		}
		return numbers;
	}
}

