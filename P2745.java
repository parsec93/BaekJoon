import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2745 {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer st = new StringTokenizer(br.readLine());
        // String number = st.nextToken();//변환할 숫자
        // int base = Integer.parseInt(st.nextToken());//진법

        // int decimalValue = Integer.parseInt(number, base);
        // //Integer.parseInt("1010", 2); // 10 (2진수 1010을 10진수로 변환)

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // bw.write(String.valueOf(decimalValue));// 정수를 문자열로 변환하여 출력
        // bw.flush();
        // bw.close();

        //Integer.parseInt 를 사용해서 바로 10진수 출력을 해도 되지만,
        //알고리즘 문제이기 때문에 직접 숫자를 계산하는 방식으로 다시 문제 풀이 시도.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken(); // 변환할 숫자
        int B = Integer.parseInt(st.nextToken()); // 진법

        //직접 진법 변환 구현
        int decimalValue = 0; // 10진수 값
        int power = 1; // 진법의 거듭제곱

        for(int i = N.length() - 1; i >= 0; i--){//N의 자릿수를 오른쪽에서 왼쪽으로 처리
            char digit = N.charAt(i); // 현재 자리의 숫자
            int value; // 현재 자리의 값을 저장할 변수

            
            if (digit >= '0' && digit <= '9') {
                value = digit - '0'; // 0~9인 경우
                //이 부분은 문자(char)로 표현된 숫자('0'<del>'9')와 알파벳('A'</del>'Z')을 
                //정수(int)로 변환하는 로직. 이를 이해하려면 문자의 ASCII 값과 변환 방식을 알아야 한다.
                //'0'의 ASCII 값은 48이므로, '0' - '0' = 48 - 48 = 0.
                //'1'의 ASCII 값은 49이므로, '1' - '0' = 49 - 48 = 1.
                //'9'의 ASCII 값은 57이므로, '9' - '0' = 57 - 48 = 9.
            } else {
                value = digit - 'A' + 10; // A~Z인 경우
                //'A'의 ASCII 값은 65이므로, 'A' - 'A' + 10 = 65 - 65 + 10 = 10.
                //'B'의 ASCII 값은 66이므로, 'B' - 'A' + 10 = 66 - 65 + 10 = 11.
                //'Z'의 ASCII 값은 90이므로, 'Z' - 'A' + 10 = 90 - 65 + 10 = 35.
            }
            
            decimalValue += value * power; // 현재 자리의 값과 진법의 거듭제곱을 곱하여 더함
            power *= B; // 진법의 거듭제곱을 증가시킴
        }

        bw.write(String.valueOf(decimalValue));
        bw.flush();
        bw.close();

    }    
}