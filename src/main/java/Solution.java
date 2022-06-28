import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

class Solution {
    public String[] solution(String S, String[] B) {
        double amount = Double.parseDouble(S);

        double[] amounts = new double[B.length];
        double grandTotal = 0;

        for (int i = 0; i < B.length; i++) {
            double a = Double.parseDouble(B[i]);
            amounts[i] = a;
            grandTotal += a;
        }

        Arrays.sort(amounts);

        String[] solution = new String[B.length];

        for (int i = 1; i <= B.length; i++) {
            double value = amount * (amounts[B.length - i] / grandTotal);
            BigDecimal decimal = new BigDecimal(value);
            decimal = decimal.setScale(2, RoundingMode.UP);
            solution[i - 1] = decimal.toString();
        }

        return solution;
    }
}