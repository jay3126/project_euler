
public class SumSquare {
	public static void main(String args[]){
		long sumOfSquares = 0;
		long squareOfSum  = 0;
		int n = 100;
		
		for(int i=1; i<=n; i++){
			sumOfSquares = (long) (sumOfSquares + Math.pow(i, 2));
			squareOfSum  = squareOfSum + i;
		}
		squareOfSum = (long) Math.pow(squareOfSum, 2);
		System.out.println(squareOfSum - sumOfSquares);
	}
}
