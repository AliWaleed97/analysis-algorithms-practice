import java.util.*;
public class subset{
	static int [] arr = {5,2,7,3,4,6};
	static int n = arr.length;
	static int [][] memo = new int [n+1][n+1];
	static int subset(int i , int prev){
		if (i == n)
			return 0;
		if(memo[i][prev]!=-1)
			return memo[i][prev];

		int choice1 = subset(i+1,prev);
		int choice2 = 0;
		if(prev == n ||arr[prev] <= arr[i])
			choice2 = subset(i+1, i)+1;
		return memo[i][prev] = Math.max(choice1,choice2);
	}
	public static void main(String[] args) {
		for (int [] row : memo){
			Arrays.fill(row,-1);
		}
		System.out.println(subset(0,n));
	}
}