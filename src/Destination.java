import java.util.ArrayList;
import java.util.List;

/**
 * The Destination class represents a destination with a name and a list of activities.
 */
public class Destination {
    private String name;
    private List<Activity> activities;

    /**
     * Constructs a destination with the specified name.
     *
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Gets the name of the destination.
     *
     * @return The name of the destination.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the destination.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of activities associated with the destination.
     *
     * @return The list of activities.
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * Sets the list of activities associated with the destination.
     *
     * @param activities The list of activities to set.
     */
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    /**
     * Adds an activity to the list of activities associated with the destination.
     * Sets the destination for the activity.
     *
     * @param activity The activity to add.
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
        activity.setDestination(this.getName()); // Set the destination for the activity
    }
}
