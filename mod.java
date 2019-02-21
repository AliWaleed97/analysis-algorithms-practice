import java.util.*;
public class mod {
	static int [] v = {17,5,-21,15};
	static int n = v.length;
	static int [][] memo = new int [n+1][105];
	static int k = 7;
	static int mod(int i , int sum){
		if(memo[i][sum]!=-1)
			return memo[i][sum];
		if(i == n){
			if(sum%k == 0)
				return 1;
			else
				return 0;
		}
			
		if(mod(i+1,sum+v[i]) == 1 || mod(i+1,sum-v[i]) == 1)
			return memo[i][sum]=1;
		else
			return memo[i][sum]=0;
	}
	public static void main(String[] args) {
		for(int [] row : memo){
			Arrays.fill(row,-1);
		}
		System.out.println(mod(0,17));
	}
}