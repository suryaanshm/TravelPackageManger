public class Passenger {
    private String passengerName;
    private int passengerNumber;
    private ActivitySignUpStrategy signUpStrategy;

    public Passenger(String passengerName, int passengerNumber, ActivitySignUpStrategy signUpStrategy) {
        this.passengerName = passengerName;
        this.passengerNumber = passengerNumber;
        this.signUpStrategy = signUpStrategy;
    }

    public void signUpForActivity() {
        signUpStrategy.signUp();
    }

    // Getters and setters
}
