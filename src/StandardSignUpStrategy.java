/**
 * The StandardSignUpStrategy class implements the ActivitySignUpStrategy interface
 * and provides a strategy for signing up standard passengers for activities.
 */
public class StandardSignUpStrategy implements ActivitySignUpStrategy {

    /**
     * Signs up a standard passenger for the specified activity.
     *
     * @param passenger The standard passenger to sign up for the activity.
     * @param activity  The activity to sign up for.
     */
    @Override
    public void signUp(Passenger passenger, Activity activity) {
        double cost = activity.getCost();
        if (passenger.getBalance() >= cost) {
            passenger.setBalance(passenger.getBalance() - cost);
            passenger.addActivity(activity, cost);
            System.out.println("Standard passenger " + passenger.getPassengerName() + " signed up for activity: " + activity.getName() + ". Balance after deduction: $" + passenger.getBalance());
        } else {
            System.out.println("Standard passenger " + passenger.getPassengerName() + " does not have enough balance to sign up for the activity.");
        }
    }
}
