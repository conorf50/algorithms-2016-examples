package assessment;

import java.util.Arrays;

public class Assess1Ex {

	public static int mystery(int target, int[] a) {
		int N = a.length;
		int cnt = 0;
		
	    Arrays.sort(a);;
		for (int i = 0; i < N-1; i++)
			for (int j = i+1; j < N; j++){
				int key = target-a[i]-a[j];
				if (Arrays.binarySearch(a,j+1,N, key) >0)
							cnt++;
			}
		return cnt;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int target = 6;

		System.out.println(mystery(target, a));

	}

}