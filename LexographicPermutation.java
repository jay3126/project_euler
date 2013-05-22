
public class LexographicPermutation {
	public static char[] digits={'0', '1', '2', '3', '4'};	

	public static void main(String args[]){
		permute2(digits, 0, 4);
		//permute1();
	}
	
	public static void permute2(char[] digits, int start, int length){
		int j;
		if(start==length){
			System.out.println(digits);
		}else{
			for(j=start; j<length; j++){
				swap(start, j);
				permute2(digits, start+1, length);
				swap(start, j);
			}
		}
	}
	
	public static void permute3(){
		int p[] = new int[10];
		int i=1;
		for(int j=0; j<digits.length; j++)
			p[j]=0;
		int j;
		
		while(i<digits.length){	
			if(p[i]<i){
				j = i % 2 * p[i];
				swap(j, i);
				System.out.println(digits);
				p[i]++;
				i=1;
			}else{
				p[i]=0;
				i++;
			}
		}
	}	
	
	public static void permute1(){	
		for(int i=0; i<digits.length; i++){
			for(int j=0; j<digits.length; j++){
				for(int k=0; k<digits.length; k++){
					if(i!=j && j!=k && k!=i)
						System.out.println(digits[i] + " " + digits[j] + " " + digits[k]);
				}
			}
		}
	}

	public static void swap(int i, int j){
		char t=digits[i];
		digits[i]=digits[j];
		digits[j]=t;
	}
}
