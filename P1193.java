import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 값을 정수로 변환 (X번째 분수를 찾는 문제)
        int X = Integer.parseInt(br.readLine());

        int line = 1;   // 현재 대각선 줄 번호 (1부터 시작)
        int count = 0;  // 지금까지 누적된 항의 개수

        // X가 포함된 대각선 줄(line)을 찾기
        // 각 줄은 1, 2, 3, ... 개의 항을 가지므로
        // 누적합을 계속 더하면서 X보다 작을 동안 반복
        while (count + line < X) {
            count += line;
            line++;
        }

        // 해당 줄 안에서 몇 번째 항인지 계산
        int indexInLine = X - count;

        int numerator;     // 분자
        int denominator;   // 분모

        // 줄 번호가 홀수이면 위에서 아래로 내려가는 패턴
        // 예: 3/1 → 2/2 → 1/3
        if (line % 2 == 1) {
            numerator = line - indexInLine + 1;
            denominator = indexInLine;
        }
        // 줄 번호가 짝수이면 아래에서 위로 올라가는 패턴
        // 예: 1/4 → 2/3 → 3/2 → 4/1
        else {
            numerator = indexInLine;
            denominator = line - indexInLine + 1;
        }

        // 결과를 출력 형식에 맞게 작성 후 출력
        bw.write(numerator + "/" + denominator + "\n");

        // 출력 버퍼 비우기 및 리소스 정리
        bw.flush();
        bw.close();
        br.close();
    }
}
