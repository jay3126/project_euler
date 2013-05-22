
public class Pythagorean {
	public static void main(String args[]){
		int b;
		for(int c=333; c<1000; c++){			
			int ab = 1000 * (500 - c);
			if(ab > c){
				for(int a=1; a<(1000-c); a++){
					b = 1000 - a -c;
					if(checkPithagorean(a, b, c)){
						System.out.println(c);
						System.out.println(a*b*c);
					}
				}
			}
		}
	}
	
	public static boolean checkPithagorean(int a, int b, int c){
		if(a*a + b*b == c*c && a < b && b < c)
			return true;
		return false;
	}	
}
