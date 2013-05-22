
public class Lattice {
	private int size;
	private int[][] grid;
	
	public static void main(String args[]){
		Lattice lattice = new Lattice();
		lattice.size = 6;
		lattice.grid = new int[lattice.size][lattice.size];
		lattice.solve();
	}
	
	
	
	private void solve() {
		
	}

	private boolean allowedStraight(int x, int y){
		if((x>=0 && x<20) && (y>=0 && y<20)){
			if(x==19)
				return false;
			return true;
		}
		return false;
	}
	
	private boolean allowedDown(int x, int y){
		if((x>=0 && x<20) && (y>=0 && y<20)){
			if(y==19)
				return false;
			return true;
		}
		return false;
	}

}
