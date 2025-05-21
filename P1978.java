import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 첫 줄: 정수 N <= 100
        StringTokenizer st = new StringTokenizer(br.readLine()); // 두 번째 줄: N개의 수 <= 1000

        int count = 0; // 소수 개수 저장 변수

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }

        // 소수 개수 출력
        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }

    // 소수 판별 함수
    private static boolean isPrime(int num) {
        // 2보다 작은 수는 소수가 아니다
        if (num < 2) return false;

        // 2부터 i * i <= num 까지만 검사 (sqrt 사용 안 함)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // 약수가 있으면 소수 아님
        }

        return true; // 약수가 없으면 소수
    }

}
