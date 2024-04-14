public class Runner {
    public static void main(String[] args) {
        // Create passengers using the factory method
        Passenger standardPassenger = PassengerFactory.createPassenger("standard", "John", 123);
        Passenger goldPassenger = PassengerFactory.createPassenger("gold", "Alice", 456);
        Passenger premiumPassenger = PassengerFactory.createPassenger("premium", "Bob", 789);

        // Call the signUpForActivity method for each passenger
        standardPassenger.signUpForActivity(); // Output: Standard passenger signed up for activity
        goldPassenger.signUpForActivity();     // Output: Gold passenger signed up for activity
        premiumPassenger.signUpForActivity();  // Output: Premium passenger signed up for activity
    }
}
