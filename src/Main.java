import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Integer.parseInt(br.readLine());
    
        System.out.println(fibonaci(x));

    }

    public static long fibonaci(long x){
        if(x == 0 || x == 1){
            return x;
        }else{
            return fibonaci(x -1) + fibonaci(x -2);
        }
    }
}
