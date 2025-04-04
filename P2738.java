import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2738{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //행렬 크기 확인
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //두개의 행렬과 합을 저장할 배열 생성
        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];
        int[][] sumMatrix = new int[n][m];

        //행렬 A 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //행렬 B 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrixB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //행렬 A + B 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        //결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(sumMatrix[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}