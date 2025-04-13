import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2566 {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       int[][] array = new int[9][9];
       int maxNum = Integer.MIN_VALUE;
       //int maxNum = 0;
       //maxNum 값을 0으로 초기화 한 경우에는 실패라고 나옴
       
       int row = 0;
       int col = 0;
       for(int i=0; i < 9; i++){
            String[] line = br.readLine().split(" ");
            for(int j=0; j < 9; j++){
                array[i][j] = Integer.parseInt(line[j]);
                if(array[i][j] > maxNum){
                    maxNum = array[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
       }
       bw.write(maxNum + "\n");
       bw.write(row + " " + col);

       br.close();
       bw.flush();
       bw.close();
    }
}