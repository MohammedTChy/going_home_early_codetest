import java.util.ArrayList;
import java.util.List;

class Challenge {
    public static List<Integer> whoIsGoingHomeEarly(int n, int k) {
        List<Integer> result = new ArrayList<>();
        List<Integer> workers = new ArrayList<>();

       
        for (int i = 1; i <= n; i++) {
            workers.add(i);
        }

        int current = 0;
        while (workers.size() > n / 2) {
            /
            current = (current + k) % workers.size();
            result.add(workers.get(current));
            workers.remove(current);
        }

        return result;
    }
}

