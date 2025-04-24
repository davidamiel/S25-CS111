import java.util.Random;

public class TwoSum {

    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (a[i] + a[j] == 0)
                    cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        double start, end, duration = 0;
        Random r = new Random();
        double[] times = new double[5000];
        for(int i = 5; i < times.length; i++) {
            int[] a = new int[i];
            for(int j = 0; j < a.length; j++) {
                a[j] = r.nextInt();
            }
            start = System.currentTimeMillis();
            count(a);
            end = System.currentTimeMillis();
            duration = end - start;
            times[i] = duration;
        }
        for(int i = 0; i < times.length; i ++) {
            System.out.println(i + ", " + times[i]);
        }
    }
}
