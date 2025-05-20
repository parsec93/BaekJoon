import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 2 < n < 100,000

        while( n!= -1){ //N이 -1일 때 까지 반복

                int sum = 0;
                StringBuilder sb = new StringBuilder();
                //배열 또는 리스트를 사용하는 방법도 고려했으나, 이후에 별도의 사용 없이 출력만 하기 때문에 이 경우에는 StringBuilder만을 사용하는게 효과적

                for(int i=1; i<n; i++){
                        if(n % i == 0){
                                sum += i;
                                sb.append(i).append(" + ");
                        }

                }                
                
            if (sum == n) {
                // 완전수
                sb.setLength(sb.length() - 3); // 마지막 " + " 제거
                bw.write(n + " = " + sb.toString() + "\n");
            } else {
                bw.write(n + " is NOT perfect.\n");
            }	

            n = Integer.parseInt(br.readLine());
        }

        bw.flush();
        bw.close();
    }
}
