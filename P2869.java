import java.io.*;
import java.util.StringTokenizer;

public class P2869 {
    public static void main(String[] args) throws IOException {
        // 입력용 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력용 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 공백 단위로 입력을 분리하기 위해 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 거리
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 거리
        int V = Integer.parseInt(st.nextToken()); // 총 올라가야 할 높이

        // 핵심 계산식
        int day = (V - B - 1) / (A - B) + 1;

        // 결과 출력
        bw.write(String.valueOf(day));
        bw.newLine(); // 개행
        bw.flush();   // 출력 버퍼 비우기

        // 자원 해제
        br.close();
        bw.close();
    }
}
