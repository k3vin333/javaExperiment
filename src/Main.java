import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate lc = LocalDate.parse("2024-08-24");
        Workout workout = new Workout(lc, "Bench Press");

        System.out.println(workout.getDateEntered());
        System.out.println(workout.getWorkoutName());

    }
}