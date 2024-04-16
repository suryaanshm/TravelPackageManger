import org.junit.Test;
import static org.junit.Assert.*;

public class tIntegration {

    @Test
    public void testCreateDestinations() {
        // Create destinations
        Destination destination1 = new Destination("Destination 1");
        Destination destination2 = new Destination("Destination 2");
        Destination destination3 = new Destination("Destination 3");

        // Verify destinations are created
        assertNotNull(destination1);
        assertNotNull(destination2);
        assertNotNull(destination3);
    }

    @Test
    public void testCreateActivities() {
        // Create activities
        Activity hiking = new Activity("Hiking", "Enjoy a scenic hike", 50.0, 1);
        Activity sightseeing = new Activity("Sightseeing Tour", "Explore local attractions", 100.0, 15);

        // Verify activities are created
        assertNotNull(hiking);
        assertNotNull(sightseeing);
    }

    @Test
    public void testCreatePassengers() {
        // Create passengers
        Passenger standardPassenger = PassengerFactory.createPassenger("standard", "John", 123, 1000.0);
        Passenger goldPassenger = PassengerFactory.createPassenger("gold", "Alice", 456, 1000.0);
        Passenger premiumPassenger = PassengerFactory.createPassenger("premium", "Bob", 789, 1000.0);

        // Verify passengers are created
        assertNotNull(standardPassenger);
        assertNotNull(goldPassenger);
        assertNotNull(premiumPassenger);
    }

    @Test
    public void testCreateTravelPackage() {
        // Create travel package
        TravelPackage travelPackage = new TravelPackage("Sample Travel Package", 10, null, null);

        // Verify travel package is created
        assertNotNull(travelPackage);
    }

    @Test
    public void testAddPassengerToTravelPackage() {
        // Create travel package
        TravelPackage travelPackage = new TravelPackage("Sample Travel Package", 10, null, null);

        // Create passenger
        Passenger passenger = PassengerFactory.createPassenger("standard", "John", 123, 1000.0);

        // Add passenger to travel package
        travelPackage.addPassenger(passenger);

        // Verify passenger is added to travel package
        assertTrue(travelPackage.getPassengers().contains(passenger));
    }

    @Test
    public void testSignUpPassengerForActivity_PassengerNotRegistered() {
        // Create travel package
        TravelPackage travelPackage = new TravelPackage("Sample Travel Package", 10, null, null);

        // Create passenger
        Passenger passenger = PassengerFactory.createPassenger("standard", "John", 123, 1000.0);

        // Create activity
        Activity hiking = new Activity("Hiking", "Enjoy a scenic hike", 50.0, 1);

        // Sign up passenger for activity
        ActivityManager activityManager = travelPackage.getActivityManager();
        try {
            activityManager.signUpPassengerForActivity(passenger, hiking);
            assertFalse("Expected an exception to be thrown", true); // Fail if no exception is thrown
        } catch (Exception e) {
            // Verify that the exception is thrown
            assertFalse(hiking.getSignedUpPassengers().contains(passenger));
        }
    }
}
