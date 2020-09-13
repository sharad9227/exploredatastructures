package test;

public class island {
	
		   
		  int n;
		 int m;

		public  int numIslands(char[][] grid) {
		   int  count = 0;
		    n = grid.length;
		   // System.out.println(n);
		    if (n == 0) return 0;
		    m = grid[0].length;
		//System.out.println(m);
		    for (int i = 0; i < n; i++){
		        for (int j = 0; j < m; j++)
		            if (grid[i][j] == '1') {
		                DFSMarking(grid, i, j);
		                ++count;
		               
		            }
		    }    
		    return count;
		}

		 void DFSMarking(char[][] grid, int i, int j) {
		    if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') {return;}
		    
		    
		    
		    grid[i][j] = '0';
		   
		    DFSMarking(grid, i + 1, j);
		    DFSMarking(grid, i - 1, j);
		    DFSMarking(grid, i, j + 1);
		    DFSMarking(grid, i, j - 1);
		
		} 
		
		
		public static void main(String[] args) {
			char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' }, { '0', '0','0', '1', '1' } };
			island isle=new island();
			System.out.println(isle.numIslands(grid));
		}
		    }


