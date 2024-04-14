public class PassengerFactory {
    public static Passenger createPassenger(String type, String passengerName, int passengerNumber) {
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
        return new Passenger(passengerName, passengerNumber, signUpStrategy);
    }
}