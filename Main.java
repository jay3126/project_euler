
public class Main {
	public static void main(String[] args) {
		System.out.println(fib(3));
		System.out.println(fact(10));
	}
	
	public static int fib(int n){
		if(n < 3)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	
	public static long fact(long n){
		if(n<2)
			return 1L;
		else
			return n * fact(n - 1);
	}
}
