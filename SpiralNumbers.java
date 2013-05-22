
public class SpiralNumbers {
	public int size=1001;
	public int[][] grid=new int[size][size];
	
	public static void main(String args[]){
		SpiralNumbers g=new SpiralNumbers();
		g.fill();
		//g.print();
		System.out.println(g.calculateDiagonalSum());
	}

	public long calculateDiagonalSum(){
		long sum=0;
		for(int i=0; i<size; i++){
			sum=sum+grid[i][i];
			//prevent double counting
			if(i!=size/2)
				sum=sum+grid[size-i-1][i];
		}

		return sum;
	}
	public void fill() {
		int j;

		int val=size*size;
		int i=size-1;
		j = 0;
		
		for(int layer=size/2; layer>=0; layer--){
			// top row
			//j=size/2-layer;
			while(i>=size/2-layer){
				grid[j][i]=val--;
				i--;
			}
			
			//first col
			i++;
			j++;
			while(j<=size/2+layer){
				grid[j][i]=val--;
				j++;
			}

			// bottom row
			j--;
			i++;
			while(i<=size/2+layer){
				grid[j][i]=val--;
				i++;
			}
			
			// last col
			i--;
			j--;
			while(j>=size/2-layer+1){
				grid[j][i]=val--;
				j--;
			}
			i--;
			j++;
		}
	}
	private void print(){
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}
