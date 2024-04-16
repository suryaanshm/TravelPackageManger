/**
 * The GoldSignUpStrategy class implements the ActivitySignUpStrategy interface
 * and provides a strategy for signing up gold passengers for activities.
 */
public class GoldSignUpStrategy implements ActivitySignUpStrategy {

    /**
     * Signs up a gold passenger for the specified activity.
     * Applies a 10% discount for gold members.
     *
     * @param passenger The gold passenger to sign up for the activity.
     * @param activity  The activity to sign up for.
     */
    @Override
    public void signUp(Passenger passenger, Activity activity) {
        double cost = activity.getCost() * 0.9; // Apply 10% discount for Gold members
        if (passenger.getBalance() >= cost) {
            passenger.setBalance(passenger.getBalance() - cost);
            passenger.addActivity(activity, cost);
            System.out.println("Gold passenger " + passenger.getPassengerName() + " signed up for activity: " + activity.getName() + ". Balance after deduction: $" + passenger.getBalance());
        } else {
            System.out.println("Gold passenger " + passenger.getPassengerName() + " does not have enough balance to sign up for the activity.");
        }
    }
}
