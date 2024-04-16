/**
 * The PremiumSignUpStrategy class implements the ActivitySignUpStrategy interface
 * and provides a strategy for signing up premium passengers for activities.
 */
public class PremiumSignUpStrategy implements ActivitySignUpStrategy {

    /**
     * Signs up a premium passenger for the specified activity.
     * Premium members can sign up for free.
     *
     * @param passenger The premium passenger to sign up for the activity.
     * @param activity  The activity to sign up for.
     */
    @Override
    public void signUp(Passenger passenger, Activity activity) {
        double cost = 0.0; // Premium members can sign up for free
        passenger.addActivity(activity, cost);
        System.out.println("Premium passenger " + passenger.getPassengerName() + " signed up for activity: " + activity.getName());
    }
}
