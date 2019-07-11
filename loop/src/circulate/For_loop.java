package circulate;

import java.util.Scanner;

/**
 * For_loop
 */
public class For_loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int i = 1;
        int factor = 1;
        // while (i<=n) {
        // factor=factor*i;
        // i++;
        // }
        for (int i = 1; i <= n; i++) {
            factor = factor * i;
        }
        // for循环总是可以和while循环呼唤
        System.out.println(factor);
    }
}