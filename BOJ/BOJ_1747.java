package leejh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1747 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[] { 1, 2, 3, 5, 7, 11, 101, 131, 151, 181, 191, 313, 353, 373, 383, 727, 757, 787, 797, 919,
				929, 10301, 10501, 10601, 11311, 11411, 12421, 12721, 12821, 13331, 13831, 13931, 14341, 14741, 15451,
				15551, 16061, 16361, 16561, 16661, 17471, 17971, 18181, 18481, 19391, 19891, 19991, 30103, 30203, 30403,
				30703, 30803, 31013, 31513, 32323, 32423, 33533, 34543, 34843, 35053, 35153, 35353, 35753, 36263, 36563,
				37273, 37573, 38083, 38183, 38783, 39293, 70207, 70507, 70607, 71317, 71917, 72227, 72727, 73037, 73237,
				73637, 74047, 74747, 75557, 76367, 76667, 77377, 77477, 77977, 78487, 78787, 78887, 79397, 79697, 79997,
				90709, 91019, 93139, 93239, 93739, 94049, 94349, 94649, 94849, 94949, 95959, 96269, 96469, 96769, 97379,
				97579, 97879, 98389, 98689, 1003001 };
		int idx = Arrays.binarySearch(arr, N);
		if (idx < 0) {
			idx = idx * (-1) - 1;
			System.out.println(arr[idx]);
		} else
			System.out.println(arr[idx]);
	}
}

/*public class Main {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = 1;
	String n;
	boolean flag;
	while(true) {
		N++;
		if(N%2 == 0) continue;
		if(isPrime(N)) {
			n = String.valueOf(N);
			flag = false;
			for(int i = 0; i < (int)n.length()/2;i++) {
				if(n.charAt(i) != n.charAt(n.length()-i-1)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(n);
				break;
			}
		}
	}
}

private static boolean isPrime(int N) {
	for (int i = 2; i <= (int) N / 2; i++)
		if (N % i == 0)
			return false;
	return true;
}
}*/