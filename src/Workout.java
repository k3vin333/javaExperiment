import java.time.LocalDate;

public class Workout {
    private LocalDate dateEntered = LocalDate.now();
    private String workoutName;

    public Workout(LocalDate dateEntered, String workoutName) {
        this.dateEntered = dateEntered;
        this.workoutName = workoutName;
    }
}
