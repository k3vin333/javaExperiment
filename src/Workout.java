import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    private LocalDate dateEntered;
    private String workoutName;
    private List<WorkoutType> workoutType = new ArrayList<WorkoutType>();

    public Workout(LocalDate dateEntered, String workoutName) {
        this.dateEntered = dateEntered;
        this.workoutName = workoutName;
    }

    public LocalDate getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(LocalDate dateEntered) {
        this.dateEntered = dateEntered;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }
}
