import java.util.*;
public class fibDP{
	static int [] memo;
	public static int fibRec(int n){
		if(n==1|| n==0)
			return 1;

		if(memo[n] != -1)
			return memo[n];
		else
			return memo[n]= fibRec(n-1)+fibRec(n-2);
	}
	public static void main(String[] args) {
		int n = 5;
		memo = new int[n+1];
		Arrays.fill(memo,-1);
		System.out.println(fibRec(n));
	}
}