import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x = "011011", y = "1010111";
        int i = x.length()-1;
        int j = y.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i>=0 || j >=0) {
            int sum = carry;
            if (i>=0) {
                sum += Character.getNumericValue(x.charAt(i));
            }
            if (j>=0){
                sum += Character.getNumericValue(y.charAt(j));
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append('0');
                carry = 1;
            }
            else {
                result.append('1');
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append(1);
        }
        result.reverse();
        System.out.println("result - "+result);
    }
}
