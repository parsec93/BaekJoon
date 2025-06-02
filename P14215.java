import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr); // 오름차순 정렬

        if (arr[2] < arr[0] + arr[1]) {
            // 삼각형이 성립함
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else {
            // 가장 긴 변이 다른 두 변의 합보다 크거나 같으면 줄여야 함
            int maxPossible = (arr[0] + arr[1]) - 1;
            System.out.println(arr[0] + arr[1] + maxPossible);
        }
    }
}
