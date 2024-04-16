/**
 * The ActivitySignUpStrategy interface defines the method for signing up a passenger for an activity.
 */
public interface ActivitySignUpStrategy {

    /**
     * Signs up a passenger for the specified activity.
     *
     * @param passenger The passenger to sign up for the activity.
     * @param activity  The activity to sign up for.
     */
    void signUp(Passenger passenger, Activity activity);
}
