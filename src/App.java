import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < x; i++) {
            long a = 0;
            long b = 1;
            long sum = 0;
            int y = Integer.parseInt(br.readLine());

            for (int k = 0; k < y; k++) {
                if (k == 1) {
                    sum = 1;
                } else {
                    sum = a + b;
                    a = b;
                    b = sum;
                }

            }
            System.out.println("Fib(" + y + ") = " + sum);
        }

    }
}
