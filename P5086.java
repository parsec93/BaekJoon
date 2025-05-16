import java.io.InputStreamReader;
import java.io.OutputStreamReader;
import java.io.IOException;
import java.util.StringTokeninzer;

public class P5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());	
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		}
		
		if(A==0 && B==0 ) {break;}
		
		if (B % A == 0) {
               		bw.write("factor");
	            } else if (A % B == 0) {
            	    bw.write("multiple");
	            } else {
	                bw.write("neither");
	            }
	            bw.newLine();
		
	}
}