import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OneChickenPerPerson {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        if (n2 - n1 > 1)
            System.out.println("Dr. Chaz will have " + (n2 - n1) + " pieces of chicken left over!");
        else if (n2 - n1 == 1)
            System.out.println("Dr. Chaz will have " + (n2 - n1) + " piece of chicken left over!");
        else if (n2 - n1 == -1)
            System.out.println("Dr. Chaz needs " + (n1 - n2) + " more piece of chicken!");
        else if (n2 - n1 < -1)
            System.out.println("Dr. Chaz needs " + (n1 - n2) + " more pieces of chicken!");


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

