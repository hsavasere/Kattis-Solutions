import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TimeTravellingTemperatures {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        float b = sc.nextInt();
        float y = sc.nextInt();

        float x = (1 - y);

        if (b == 0 && y == 1)
            System.out.println("ALL GOOD");

        else if (x == 0)
            System.out.println("IMPOSSIBLE");

        else {
            float res = b / (1 - y);

            if (Math.round(res) == res)
                System.out.println(Math.round(res));
            else
                System.out.println(res);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
