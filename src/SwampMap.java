final class SwampMap {
	
	private int a;
	private int b;

	
	SwampMap(int a , int b){
	
	//SwampMap( a , b){
	int grid[][] = new int[a][b];

	int place = 10;
	{

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
			
			grid[i][j] = place;
			place += 10;
		}
	}
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					System.out.print(grid[i][j] + " ");

				}
				System.out.println();
			}
		}
	}
}






