import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 1 <= N <= 10,000,000

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                bw.write(i + "\n");
                N /= i;
            }
        }

        // 마지막 남은 소수가 1개 있을 수 있음 (예: N이 소수인 경우)
        if (N > 1) {
            bw.write(N + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}