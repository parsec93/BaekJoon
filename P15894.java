import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P15894 {
    public static void main(String[] args) throws IOException {
        // 입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        //도형 둘레의 길이는 윗면 + 옆면 + 아랫면 + 계단면(반씩 잘리는 면) = 1 + 2n + n + (n - 1) = 4n
        // 둘레 계산: 각 정사각형마다 4의 길이를 가짐
        // int 의 최댁닶은 21억 이므로, n이 5억 이상일 경우에 최대값이 
        long result = n * 4;

        // 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
