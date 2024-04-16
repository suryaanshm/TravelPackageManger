import java.util.ArrayList;
import java.util.List;

/**
 * The Activity class represents an activity with a name, description, cost, capacity,
 * signed-up passengers, and an associated destination.
 */
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private List<Passenger> signedUpPassengers;
    private String destinationName; // Reference to the associated destination

    /**
     * Constructs an activity with the specified name, description, cost, and capacity.
     *
     * @param name        The name of the activity.
     * @param description The description of the activity.
     * @param cost        The cost of the activity.
     * @param capacity    The capacity of the activity.
     */
    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.signedUpPassengers = new ArrayList<>();
    }

    /**
     * Displays information about the activity including name, description, cost, and remaining seats.
     */
    public void display() {
        System.out.printf("Activity : %s, Description : %s, Cost : %.1f, Remaining Seats :  %d\n", name, description, cost, capacity - signedUpPassengers.size());
    }

    /**
     * Gets the name of the activity.
     *
     * @return The name of the activity.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the description of the activity.
     *
     * @return The description of the activity.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the cost of the activity.
     *
     * @return The cost of the activity.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Gets the capacity of the activity.
     *
     * @return The capacity of the activity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Gets the list of signed-up passengers for the activity.
     *
     * @return The list of signed-up passengers.
     */
    public List<Passenger> getSignedUpPassengers() {
        return signedUpPassengers;
    }

    /**
     * Gets the name of the destination associated with the activity.
     *
     * @return The name of the destination.
     */
    public String getDestination() {
        return destinationName;
    }

    /**
     * Sets the name of the destination associated with the activity.
     *
     * @param destination The name of the destination to set.
     */
    public void setDestination(String destination) {
        this.destinationName = destination;
    }

    /**
     * Checks if a passenger can be added to the activity (i.e., if there are remaining seats).
     *
     * @return true if a passenger can be added, false otherwise.
     */
    public boolean canAddPassenger() {
        return signedUpPassengers.size() < capacity;
    }

    /**
     * Adds a passenger to the list of signed-up passengers for the activity.
     *
     * @param passenger The passenger to add.
     */
    public void addPassenger(Passenger passenger) {
        signedUpPassengers.add(passenger);
    }
}
