import java.util.*;
public class maxPath{
	static int n = 3;
	static int [][] memo = new int [n+1][n+1];
	static int [][] grid = {{5,1,2},{6,7,8},{1,4,9}};
	static boolean valid(int i, int j){
		if(i == n || j == n)
			return false;
		else
			return true;
	}
	static int maxPath(int i, int j){
		if(!valid(i,j))
			return 0;
		if(i == n-1 && j == n-1)
			return grid[i][j];

		if(memo[i][j]!=-1)
			return memo[i][j];
		
		int p1 = maxPath(i,j+1);
		int p2 = maxPath(i+1,j);
		return memo[i][j]=grid[i][j] + Math.max(p1,p2);
		
	}
	public static void main(String[] args) {
		for(int [] row : memo){
			Arrays.fill(row,-1);
		}
		System.out.println(maxPath(0,0));
	}
}