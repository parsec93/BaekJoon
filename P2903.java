import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 N (중앙 이동 횟수)
        int N  = Integer.parseInt(br.readLine());

        // 2^2
        // 3^2
        // 5^2
        // 9^2
        // 한 변의 점의 개수만 확인하면 총 점의 개수 확인 가능.
        // 1, 2, 4, 8 , 16 같이 2의 제곱으로 커지는 것을 확인
        // 0번:2^0 + 1
        // 1번:2^1 + 1 = 3의 제곱
        // 2번:2^2 + 1 = 5의 제곱
        // 3번:2^3 + 1 = 9의 제곱
        // 4번:2^4 + 1 = 17의 제곱이 되는 것을 확인

        int pointsPerSide = (int) Math.pow(2, N) + 1;
        int totalPoints = pointsPerSide * pointsPerSide; // 총 점의 개수

        bw.write(String.valueOf(totalPoints)); // BufferedWriter.write() 메서드는 문자열(String)만 출력 가능

        bw.flush();
        bw.close();
    }    
}