import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            x[i] = Integer.parseInt(input[0]);
            y[i] = Integer.parseInt(input[1]);
        }

        int x4, y4;

        // x 좌표 중 유일한 값 찾기
        if (x[0] == x[1]){
             x4 = x[2];
        }else if (x[0] == x[2]) {
            x4 = x[1];
        }else {
            x4 = x[0];
        }

        // y 좌표 중 유일한 값 찾기
        if (y[0] == y[1]) {
            y4 = y[2];
        }else if (y[0] == y[2]) {
            y4 = y[1];
        }else {
            y4 = y[0];
        }

        bw.write(x4 + " " + y4);
        bw.flush();
        bw.close();
        br.close();
    }
}
