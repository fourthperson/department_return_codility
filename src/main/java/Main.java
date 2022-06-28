import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String S = "300.01";
        String[] B = {"300.00", "200.00", "100.00"};

        String[] solved = new Solution().solution(S, B);

        System.out.println(Arrays.toString(solved));
    }
}
