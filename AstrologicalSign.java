import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class AstrologicalSign {

    public static String getSignName(int day, String month) {
        String sign = "";

        switch (month) {
            case "Jan":
                if (day <= 20)
                    sign = "Capricorn";
                else
                    sign = "Aquarius";
                break;
            case "Feb":
                if (day <= 19)
                    sign = "Aquarius";
                else
                    sign = "Pisces";
                break;
            case "Mar":
                if (day <= 20)
                    sign = "Pisces";
                else
                    sign = "Aries";
                break;
            case "Apr":
                if (day <= 20)
                    sign = "Aries";
                else
                    sign = "Taurus";
                break;
            case "May":
                if (day <= 20)
                    sign = "Taurus";
                else
                    sign = "Gemini";
                break;
            case "Jun":
                if (day <= 21)
                    sign = "Gemini";
                else
                    sign = "Cancer";
                break;
            case "Jul":
                if (day <= 22)
                    sign = "Cancer";
                else
                    sign = "Leo";
                break;
            case "Aug":
                if (day <= 22)
                    sign = "Leo";
                else
                    sign = "Virgo";
                break;
            case "Sep":
                if (day <= 21)
                    sign = "Virgo";
                else
                    sign = "Libra";
                break;
            case "Oct":
                if (day <= 22)
                    sign = "Libra";
                else
                    sign = "Scorpio";
                break;
            case "Nov":
                if (day <= 22)
                    sign = "scorpio";
                else
                    sign = "Sagittarius";
                break;
            case "Dec":
                if (day <= 21)
                    sign = "Sagittarius";
                else
                    sign = "Capricorn";
                break;
        }
        return sign;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int test = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (test-- > 0) {
            int day = sc.nextInt();
            String month = sc.next();
            sb.append(getSignName(day, month)).append('\n');
        }
        System.out.println(sb.toString());

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
