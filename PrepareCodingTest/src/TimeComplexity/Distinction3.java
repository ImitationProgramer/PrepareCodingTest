package TimeComplexity;

// 연산 횟수가 N^2인 경우
public class Distinction3 {

	public static void main(String[] args) {
		int N = 100000;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("연산 횟수 : " + cnt++);
			}
		}

	}

}
