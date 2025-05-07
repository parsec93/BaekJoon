import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2563{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int paperCnt = Integer.parseInt(br.readLine());
            boolean[][] paper = new boolean[100][100];

            int totalArea = 0;
            
            for(int i = 0; i < paperCnt; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                for(int j = x; j < x + 10; j++){
                    for(int k = y; k < y + 10; k++){
                        if(!paper[j][k]){
                            paper[j][k] = true;
                            totalArea++;
                        }
                    }
                }
            }

            //bw.write(totalArea);  BufferedWriter.write() 메서드는 문자열을 출력해야 하므로, int 값을 출력하려면 문자열로 변환해야 함
            bw.write(totalArea + "\n");
            bw.flush();
            bw.close();
            br.close();
    }
}