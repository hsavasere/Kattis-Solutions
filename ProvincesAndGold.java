import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ProvincesAndGold {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int gold = sc.nextInt();
        int silver = sc.nextInt();
        int copper = sc.nextInt();

        TreeMap<Integer, String> victory = new TreeMap<>();
        victory.put(8, "Province");
        victory.put(5, "Duchy");
        victory.put(2, "Estate");

        TreeMap<Integer, String> treasure = new TreeMap<>();
        treasure.put(6, "Gold");
        treasure.put(3, "Silver");
        treasure.put(0, "Copper");

        int points = gold * 3 + silver * 2 + copper;

        for (int i : victory.descendingKeySet()) {
            if (points >= i) {
                System.out.print(victory.get(i) + " or ");
                break;
            }
        }


        for (int i : treasure.descendingKeySet()) {
            if (points >= i) {
                System.out.println(treasure.get(i));
                break;
            }
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
