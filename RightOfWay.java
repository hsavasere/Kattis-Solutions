import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class RightOfWay {

    public static int getLeft(int direction){
        int east = (direction - 1) % 4;
        if(east < 0)
            east += 4;
        return east;
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String from = sc.next();
        String to = sc.next();
        String approach = sc.next();

        HashMap<String, Integer> direction = new HashMap<>();
        direction.put("North", 0);
        direction.put("South", 2);
        direction.put("East", 1);
        direction.put("West", 3);

        HashMap<Integer, String> getDirection = new HashMap<>();
        getDirection.put(0, "North");
        getDirection.put(2, "South");
        getDirection.put(1, "East");
        getDirection.put(3, "West");

        String cond1To = getDirection.get((direction.get(from) + 2) % 4);
        String cond1Approach = getDirection.get(getLeft(direction.get(from)));

        String cond2To = getDirection.get((direction.get(from) + 1) % 4);
        String cond2Approach1 = getDirection.get(getLeft(direction.get(from)));
        String cond2Approach2 = getDirection.get((direction.get(from) + 2) % 4);

        if ((cond1To.equals(to) && cond1Approach.equals(approach)) || (cond2To.equals(to) &&
                (cond2Approach1.equals(approach) || cond2Approach2.equals(approach)))) {
            System.out.println("Yes");
        } else
            System.out.println("No");

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
