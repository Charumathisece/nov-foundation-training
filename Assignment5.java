
import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] seats = new String[3];
        Queue<String> waitlist = new LinkedList<>();

        // Get 5 learner names
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter learner name: ");
            String name = sc.nextLine();

            if (i < 3) {
                seats[i] = name;
            } else {
                waitlist.add(name);
            }
        }

        // Print seats and waitlist
        System.out.println("\nSeats: " + Arrays.toString(seats));
        System.out.println("Waitlist: " + waitlist);

        // Get learner name who drops out
        System.out.print("\nEnter learner name to drop out: ");
        String drop = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            if (drop.equals(seats[i])) {
                found = true;

                if (!waitlist.isEmpty()) {
                    seats[i] = waitlist.poll();
                } else {
                    seats[i] = null;
                }

                break;
            }
        }

        if (found) {
            System.out.println("Learner dropped out: " + drop);
        } else {
            System.out.println("Learner not found in batch.");
        }

        // Final output
        System.out.println("\nFinal Seats: " + Arrays.toString(seats));
        System.out.println("Final Waitlist: " + waitlist);

        sc.close();
    }
}
