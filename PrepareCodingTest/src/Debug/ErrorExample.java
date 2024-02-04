package Debug;

import java.util.Scanner;

public class ErrorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int answer = 0;
		int A[] = new int[100001]; // 4번째 오류 : 자료형 범위 오류
		int S[] = new int[100001];
		for (int i = 1; i < 10000; i++) { // 2번째 오류 : 반복문에서 인덱스 범위 잘못 지정
			A[i] = (int) (Math.random() * Integer.MAX_VALUE);
			S[i] = S[i - 1] + A[i];
		}
		for (int t = 1; t < testcase; t++) {
			int query = sc.nextInt();
			for (int i = 0; i < query; i++) {
				int start = sc.nextInt(); // 1번째 오류 : 변수 초기화가 제대로 이루어지고 있지 않음
				int end = sc.nextInt();
				answer += S[end] - S[start - 1];
				System.out.println(testcase + " " + answer); // 3번째 오류 : 잘못된 변수 사용 오류
			}
		}
	}

}
