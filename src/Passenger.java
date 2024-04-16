import java.util.HashMap;
import java.util.Map;

/**
 * The Passenger class represents a passenger with a name, number, balance,
 * signed-up activities, and a sign-up strategy.
 */
public class Passenger {
    private String passengerName;
    private int passengerNumber;
    private double balance;
    private ActivitySignUpStrategy signUpStrategy;
    private Map<Activity, Double> signedUpActivities;

    /**
     * Constructs a Passenger with the specified name, number, balance, and sign-up strategy.
     *
     * @param passengerName  The name of the passenger.
     * @param passengerNumber  The number of the passenger.
     * @param balance  The balance of the passenger.
     * @param signUpStrategy  The sign-up strategy for activities.
     */
    public Passenger(String passengerName, int passengerNumber, double balance, ActivitySignUpStrategy signUpStrategy) {
        this.passengerName = passengerName;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.signUpStrategy = signUpStrategy;
        this.signedUpActivities = new HashMap<>();
    }

    /**
     * Displays the passenger's information and signed-up activities.
     */
    public void display() {
        System.out.printf("Name : %s, Number : %s, Balance : %.1f\n", passengerName, passengerNumber, balance);
        for (Map.Entry<Activity, Double> activity : signedUpActivities.entrySet()) {
            System.out.printf("Activity Name : %s, Destination : %s, Price : %.1f\n", activity.getKey().getName(), activity.getKey().getDestination(), activity.getValue());
        }
    }

    /**
     * Gets the name of the passenger.
     *
     * @return The name of the passenger.
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Gets the number of the passenger.
     *
     * @return The number of the passenger.
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * Gets the balance of the passenger.
     *
     * @return The balance of the passenger.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the passenger.
     *
     * @param balance  The balance to set.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Adds a signed-up activity with its price for the passenger.
     *
     * @param activity  The activity to add.
     * @param price  The price of the activity.
     */
    public void addActivity(Activity activity, Double price){
        signedUpActivities.put(activity, price);
    }

    /**
     * Gets the signed up activities of the passenger.
     *
     * @return The signed up activities map of the passenger.
     */
    public Map<Activity, Double> getSignedUpActivities() {
        return signedUpActivities;
    }

    /**
     * Signs up the passenger for an activity using the sign-up strategy.
     *
     * @param activity  The activity to sign up for.
     */
    public void signUpForActivity(Activity activity) {
        signUpStrategy.signUp(this, activity);
    }
}
