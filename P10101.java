import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int angleOne = Integer.parseInt(br.readLine());
        int angleTwo = Integer.parseInt(br.readLine());
        int angleThree = Integer.parseInt(br.readLine());

        if(angleOne + angleTwo + angleThree != 180){
            bw.write("Error");
        } else if (angleOne == 60 && angleTwo == 60 && angleThree == 60) {
            bw.write("Equilateral");
        } else if (angleOne + angleTwo + angleThree == 180 && (angleOne == angleTwo || angleTwo == angleThree || angleOne == angleThree)) {
            bw.write("Isosceles");
        } else if (angleOne + angleTwo + angleThree == 180 && (angleOne != angleTwo && angleTwo != angleThree && angleOne != angleThree)) {
            bw.write("Scalene");
        } else {
            bw.write("Error");
        }

        //위 방법으로 했을 때 if 문이 너무 길어져서 아래와 같이 간단하게 작성해 봄.
        //그러나 백준에서 테스트 했을 때 테스트 시간은 동일하게 나옴
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum = a + b + c;

        if (sum != 180) {
            bw.write("Error");
        } else if (a == b && b == c) {
            bw.write("Equilateral");
        } else if (a == b || b == c || a == c) {
            bw.write("Isosceles");
        } else {
            bw.write("Scalene");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
