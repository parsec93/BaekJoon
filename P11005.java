import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class P11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int decimalValue = Integer.parseInt(st.nextToken()); // 10진수 값
        int B = Integer.parseInt(st.nextToken()); // 진법

        //10진수 -> B진수 변환
        Stack<Character> stack = new Stack<>(); //변환된 숫자를 저장할 스택
        while (decimalValue > 0){
            int remainder = decimalValue % B; //나머지 계산
            if (remainder < 10) {
                stack.push((char) (remainder + '0'));  //숫자 0~9 처리
            } else {
                stack.push((char) (remainder - 10 + 'A')); // 문자(A~Z) 처리
            }
            decimalValue /= B; //몫 계산
        }
       
        while(!stack.isEmpty()){
            bw.write(stack.pop()); //스택에서 꺼내서 출력
        }       
        bw.flush();
        bw.close();

        //Stack을 공부할 때나 봤지, 실제 코드로는 처음 작성해 봄
        // 입력: 1234 36 일 때 계산 과정은 아래와 같다.
        // 1234 % 36 = 10 → 'A' (10은 36진수에서 'A'로 표현)
        // 스택에 'A' 저장.
        // 1234 / 36 = 34 (몫 계산)
        // 두 번째 나머지 계산:
        // 34 % 36 = 34 → 'Y' (34은 36진수에서 'Y'로 표현)
        // 스택에 'Y' 저장.
        // 34 / 36 = 0 (몫 계산, 종료)
        // 스택 내용:
        // ['Y', 'A']
        // 스택에서 꺼내서 출력하면 'YA'가 됨.
    }    
}