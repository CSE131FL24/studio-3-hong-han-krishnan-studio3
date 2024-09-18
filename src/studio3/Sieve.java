package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] n = new int[in.nextInt()];
		for(int i=0;i<n.length;i++) {
			n[i] = i+1;
		}
		for(int i=1;i<n.length;i++) {
			if(n[i]!=0) {
				for(int j=2;j*n[i]<=n.length;j++) {
					n[j*n[i]-1]=0;
				}
			}
		}
		for(int i=1;i<n.length;i++) {
			if(n[i]!=0) System.out.println(n[i]);
		}
	}
}
