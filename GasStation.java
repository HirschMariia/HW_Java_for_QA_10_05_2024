import java.util.PriorityQueue;

public class GasStation {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>((s1, s2) -> {
            if (s1.equals("Emergency")) {
                return -1;
            } else if (s1.equals("PublicBus") && !s2.equals("Emergency")) {
                return -1;
            } else if (s1.equals("CityService") && !s2.equals("Emergency") && !s2.equals("PublicBus")) {
                return -1;
            }
            return 1;
        });

        queue.offer("Car1");
        queue.offer("PublicBus");
        queue.offer("CityService");
        queue.offer("Emergency");

        while (!queue.isEmpty()) {
            System.out.println("Next vehicle to refuel: " + queue.poll());
        }
    }
}
