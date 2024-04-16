import java.util.List;

/**
 * The ActivityManager class manages the sign-up process of passengers for activities.
 */
public class ActivityManager {
    private List<Destination> destinations;
    private List<Passenger> passengers;

    /**
     * Constructs an activity manager with the specified destinations and passengers.
     *
     * @param destinations The list of destinations.
     * @param passengers   The list of passengers.
     */
    public ActivityManager(List<Destination> destinations, List<Passenger> passengers) {
        this.destinations = destinations;
        this.passengers = passengers;
    }

    /**
     * Signs up a passenger for the specified activity.
     *
     * @param passenger The passenger to sign up.
     * @param activity  The activity to sign up for.
     */
    public void signUpPassengerForActivity(Passenger passenger, Activity activity) throws Exception {
        synchronized (activity) {
            if (!passengers.contains(passenger)) {
                throw new Exception("Passenger " + passenger.getPassengerName() + " not registered with Travel Package. Cannot sign up for activity.");
            }
            boolean activityExists = false;
            for (Destination destination : destinations) {
                if (destination.getActivities().contains(activity)) {
                    activityExists = true;
                    break;
                }
            }
            if (!activityExists){
                throw new Exception("Activity " + activity.getName() + " not part of the Travel Package.");
            }
            if (activity.canAddPassenger()) {
                passenger.signUpForActivity(activity);
                activity.addPassenger(passenger);
            } else {
                throw new Exception("Activity capacity reached. Cannot add more passengers.");
            }
        }
    }

    /**
     * Gets the list of destinations managed by the activity manager.
     *
     * @return The list of destinations.
     */
    public List<Destination> getDestinations() {
        return destinations;
    }

    /**
     * Sets the list of destinations for the activity manager.
     *
     * @param destinations The list of destinations to set.
     */
    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Gets the list of passengers managed by the activity manager.
     *
     * @return The list of passengers.
     */
    public List<Passenger> getPassengers() {
        return passengers;
    }

    /**
     * Sets the list of passengers for the activity manager.
     *
     * @param passengers The list of passengers to set.
     */
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
