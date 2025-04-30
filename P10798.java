import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10798{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            char[][] arr = new char[5][15]; //최대 5줄, 각 줄은 최대 15글자
            for (int i = 0; i < 5; i++) {
                String line = br.readLine();
                for(int j =0; j < line.length(); j++)
                    arr[i][j] = line.charAt(j);
            }

            //배열에 저장 된 문자열 세로로 읽기
            for(int j = 0; j < 15; j++){
                for(int i = 0; i < 5; i++){
                    if(arr[i][j] != '\0') //'\0'이 아닌 경우에만 출력
                        bw.write(arr[i][j]);
                }
            }

            bw.flush();
            bw.close();
            br.close();
    }
}