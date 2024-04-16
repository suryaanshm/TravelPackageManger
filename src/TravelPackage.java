import java.util.List;
import java.util.ArrayList;

/**
 * The TravelPackage class represents a travel package that includes destinations,
 * passengers, and activities.
 */
public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;
    private ActivityManager activityManager;

    /**
     * Constructs a travel package with the specified name, passenger capacity,
     * destinations, and passengers.
     *
     * @param name             The name of the travel package.
     * @param passengerCapacity The passenger capacity of the travel package.
     * @param destinations     The list of destinations included in the travel package.
     * @param passengers       The list of passengers booked for the travel package.
     */
    public TravelPackage(String name, int passengerCapacity, List<Destination> destinations, List<Passenger> passengers) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = destinations != null ? destinations : new ArrayList<>();
        this.passengers = passengers != null ? passengers : new ArrayList<>();
        this.activityManager = new ActivityManager(this.destinations, this.passengers);
    }

    /**
     * Displays the itinerary of the travel package, including destinations and activities.
     */
    public void displayItinerary(){
        System.out.println("Package Name : " + name);
        for (Destination destination : destinations) {
            System.out.println("Destination : " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                activity.display();
            }
        }
    }

    /**
     * Displays the list of passengers booked for the travel package.
     */
    public void displayPassengerList(){
        System.out.println("Package Name : " + name);
        System.out.println("Passenger Capacity : " + passengerCapacity);
        for (Passenger passenger : passengers) {
            System.out.printf("Name : %s, Number : %s\n", passenger.getPassengerName(), passenger.getPassengerNumber());
        }
    }

    /**
     * Displays the details of activities with available spaces.
     */
    public void displayActivitiesDetails() {
        System.out.println("Activities with spaces available.");
        for (Destination destination : destinations) {
            System.out.println("Destination : " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                if(activity.canAddPassenger())
                    activity.display();
            }
        }
    }

    /**
     * Gets the name of the travel package.
     *
     * @return The name of the travel package.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the list of destinations included in the travel package.
     *
     * @return The list of destinations.
     */
    public List<Destination> getDestinations() {
        return destinations;
    }

    /**
     * Gets the list of passengers included in the travel package.
     *
     * @return The list of passengers.
     */
    public List<Passenger> getPassengers() {
        return passengers;
    }

    /**
     * Sets the list of destinations for the travel package.
     *
     * @param destinations The list of destinations to set.
     */
    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Adds a passenger to the travel package.
     *
     * @param passenger The passenger to add.
     */
    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    /**
     * Gets the activity manager associated with the travel package.
     *
     * @return The activity manager.
     */
    public ActivityManager getActivityManager() {
        return activityManager;
    }
}
