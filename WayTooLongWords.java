//	Way Too Long Words
// Codeforces

import java.util.Scanner;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String str = sc.next();
            if (str.length() <= 10) {
                System.out.println(str);
            } else {
                System.out.print(str.charAt(0));
                System.out.print(str.length() - 2);
                System.out.print(str.charAt(str.length() - 1));
                System.out.println();
            }
        }
    }
}
