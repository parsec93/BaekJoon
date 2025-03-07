import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P25206{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double totalCredits = 0.0; //총 학점
        double totalPoints = 0.0; //총 평점

        for(int i=0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();//subject를 사용하지는 않지만 다음 데이터 처리를 위해 읽어줌
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            double gradePoint = getGradePoint(grade);               
            if (gradePoint >= 0) {
                totalCredits += credit;
                totalPoints += credit * gradePoint;
            }
        }
        double gradePointAverage = totalPoints / totalCredits;
        bw.write(String.format("%.6f\n", gradePointAverage)); //예제 출력이 소수점 6자리라서 6자리로 맞춰봄
       
        
        bw.flush();
        bw.close();
    }

    private static double getGradePoint(String grade){
        switch (grade) {
            case "A+" : return 4.5;
            case "A0" : return 4.0;
            case "B+" : return 3.5;
            case "B0" : return 3.0;
            case "C+" : return 2.5;
            case "C0" : return 2.0;
            case "D+" : return 1.5;
            case "D0" : return 1.0;
            case "F" : return 0.0;
            default : return -1.0; //P 학점일 때는 무시하기 위하여 -1.0을 리턴
        }
        
        //copilot이 아래 코드로 바꿔줌 -> 백준의 자바는 11인데 아래 표현식은 자바14이상에서만 사용 가능
        /*
        return switch (grade) {
            case "A+" -> 4.5;
            case "A0" -> 4.0;
            case "B+" -> 3.5;
            case "B0" -> 3.0;
            case "C+" -> 2.5;
            case "C0" -> 2.0;
            case "D+" -> 1.5;
            case "D0" -> 1.0;
            case "F" -> 0.0;
            default -> -1.0;
        };
        */
    }
}