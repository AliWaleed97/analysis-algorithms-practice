import java.util.*;
public class knapsack{
	static int size = 12;
	static int [] weights = {10,4,20,5,7};
	static int [] values = {10,15,3,1,4};
	static int n = weights.length;
	static int [][] memo = new int [n+1][size+1];
	static int knapsack(int i, int w){
		if(i==n)
			return 0;
		if(memo[i][w] != -1)
			return memo[i][w];

		int leave = knapsack(i+1,w);
		int take = 0;
		if(w >= weights[i])
			take = knapsack(i+1,w-weights[i])+values[i];
		return memo[i][w]=Math.max(leave,take);
	}
	public static void main(String[] args) {
		for(int [] row : memo){
			Arrays.fill(row,-1);
		}
		System.out.println(knapsack(0,size));
	}
}