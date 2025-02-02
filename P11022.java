import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class P11022{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i =1; i <= cnt; i ++){
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+A+" + " + B + " = " + (A+B) + "\n");
        }
        br.close(); // close, flush, close 3가지를 제대로 하지 않으면 출력이 제대로 되지 않는다.
	    bw.flush();
	    bw.close();
    }
}