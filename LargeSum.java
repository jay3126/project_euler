import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


public class LargeSum {
	public static int NUM=50;
	public static void main(String args[]) throws IOException{
		String file = "data/100";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line;
		int digits[] = new int[NUM];
		for(int i=0; i<digits.length; i++){
			digits[i]=0;
		}
		
		while ((line = br.readLine()) != null) {
			for(int i=0; i<line.length(); i++){				
				digits[i]=digits[i]+(int)line.charAt(i)-48;
			}
		}
		br.close();
		
		int carryover=0;
		
		//System.out.println(digits.length);
		for(int i=digits.length-1; i>=0; i--){
			digits[i] = digits[i] + carryover;
			if(i>0){
				carryover = digits[i]/10;
				digits[i] = digits[i] % 10;
			}
		}
		for(int i=0; i<10-((char)digits[NUM-1]); i++)
			System.out.print(digits[i]);
	}
}
