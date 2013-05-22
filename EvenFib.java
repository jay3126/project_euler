
public class EvenFib {
	public static void main(String args[]){
		int fib1 = 1;
		int fib2 = 2;
		int temp;
		long sum=0L;
		while(!(fib2>4000000)){
			if(fib2 % 2 == 0)
				sum=sum+fib2;
			temp = fib2 + fib1;
			fib1 = fib2;
			fib2 = temp;
			System.out.println(fib2);
		}
		System.out.println(sum);
	}
}
