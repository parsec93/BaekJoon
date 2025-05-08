import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //동전 단위 정의
        int[] coins = {25, 10, 5, 1}; // 동전 단위: 25센트, 10센트, 5센트, 1센트

        int cnt = Integer.parseInt(br.readLine());

        for(int i =0; i < cnt; i ++){
            int change = Integer.parseInt(br.readLine()); // 잔돈
            int[] result = new int[4]; // 각 동전 단위의 개수

            //잔돈 동정 계산
            for(int j = 0; j < coins.length; j++){
                result[j] = change / coins[j]; // 동전 개수 계산
                change %= coins[j]; // 남은 잔돈 업데이트
            }

             //결과 출력
            for(int count : result){
                bw.write(count + " ");
            }
        }

        bw.flush();
        bw.close();
    }    
}