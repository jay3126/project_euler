
public class CoinSums {
	public static void main(String args[]){
		int counter=0;
		int sum = 0;
		for(int onepound=0; onepound<=2; onepound++){
			sum = (onepound * 100);
			for(int fiftyp=0; fiftyp<=(4-sum/50); fiftyp++){
				for(int twentyp=0; twentyp<=(10-(onepound * 100)/20 - (fiftyp * 50)/20); twentyp++){
					for(int tenp=0; tenp<=(20-(onepound * 100)/10 - (fiftyp * 50)/10 - (twentyp * 10)/10); tenp++){
						for(int fivep=0; fivep<=(40-(onepound * 100)/5 - (fiftyp * 50)/5 - (twentyp * 20)/5 - (tenp * 10)/5); fivep++){
							for(int twop=0; twop<=(100-(onepound * 100)/2 - (fiftyp * 50)/2 - (twentyp * 20)/2 - (tenp * 10)/2 - (fivep * 5)/2); twop++){
								for(int onep=0; onep<=200; onep++){
									if(onepound*100 + fiftyp * 50 + twentyp * 20 + tenp * 10 + fivep * 5 + twop * 2 + onep == 200){
										counter++;
									}		
								}	
							}	
						}	
					}
				}
			}
		}
		// when one two pound coin, scope of any other coin is not there
		counter=counter+1;
		
		System.out.println(counter);
	}
}
