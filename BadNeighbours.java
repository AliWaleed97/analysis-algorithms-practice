import java.util.*;

public class BadNeighbours{
	static int [] arr = { 10, 3, 2, 5, 7, 8 };
	static int n = arr.length;
	static int [][] memo = new int [n+1][19];
	public static int DP(int i , int sum){
		if(i==n)
			return 0;
		if(memo[i][sum]!=-1)
			return memo[i][sum];

		int choice1 = DP(i+1,sum);
		int choice2 = DP(i+2,sum+arr[i]) + arr[i];
		return memo[i][sum]=Math.max(choice2,choice1);
	}
	public static void main(String[] args) {
		for(int [] row : memo){
			Arrays.fill(row,-1);
		}
		System.out.println(DP(0,0));
	}
}