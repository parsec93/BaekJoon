import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine()); // 0 < M <= N <= 10,000

        int sum = 0;       // 소수들의 합
        int min = -1;      // 소수 중 가장 작은 값

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min == -1) {
                    min = i; // 첫 번째 소수일 때만 갱신
                }
            }
        }

        if (min == -1) {
            bw.write("-1\n"); // 소수가 하나도 없는 경우
        } else {
            bw.write(sum + "\n");
            bw.write(min + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
