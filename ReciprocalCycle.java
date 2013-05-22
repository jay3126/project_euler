
public class ReciprocalCycle {
	public static void main(String args[]){
		int max=0;
		int number=0;		
		for(int d=2; d<1000; d++){
			int[] remainders=new int[1000];
			int remain=1;
			int step=0;
			do{	
				remainders[remain] = step++;
				remain = (10 * remain) % d;
			}while(remain>0 && remainders[remain]==0);

			int length = 0;
			if(remain>0)
				length = step - remainders[remain];
			if(length> max) {
				max=length;
				number= d;
			}

		}
		System.out.println(number);
	}

	
}
