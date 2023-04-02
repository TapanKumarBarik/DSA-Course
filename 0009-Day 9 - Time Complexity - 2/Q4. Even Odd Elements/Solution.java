import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int k = scn.nextInt();
            int odd = 0;
            int even = 0;

            for (int j = 0; j < k; j++) {
                int num = scn.nextInt();
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println(Math.abs(odd - even));
        }

    }
}