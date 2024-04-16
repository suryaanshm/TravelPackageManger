/**
 * The PassengerFactory class is responsible for creating instances of Passenger based on the type.
 */
public class PassengerFactory {

    /**
     * Creates a new instance of Passenger based on the type with the specified parameters.
     *
     * @param type            The type of the passenger (standard, gold, premium).
     * @param passengerName   The name of the passenger.
     * @param passengerNumber The number of the passenger.
     * @param balance         The balance of the passenger.
     * @return A new instance of Passenger.
     * @throws IllegalArgumentException if an invalid passenger type is provided.
     */
    public static Passenger createPassenger(String type, String passengerName, int passengerNumber, double balance) {
        ActivitySignUpStrategy signUpStrategy;
        switch (type.toLowerCase()) {
            case "standard":
                signUpStrategy = new StandardSignUpStrategy();
                break;
            case "gold":
                signUpStrategy = new GoldSignUpStrategy();
                break;
            case "premium":
                signUpStrategy = new PremiumSignUpStrategy();
                break;
            default:
                throw new IllegalArgumentException("Invalid passenger type: " + type);
        }
        return new Passenger(passengerName, passengerNumber, balance, signUpStrategy);
    }
}
