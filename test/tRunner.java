import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class tRunner {

    @Test
    public void testSignUpForActivity() {
        // Create a travel package with activities
        Activity hiking = new Activity("Hiking", "Enjoy a scenic hike", 50.0, 1);
        Destination destination1 = new Destination("Destination 1");
        destination1.addActivity(hiking);
        TravelPackage travelPackage = new TravelPackage("Test Travel Package", 10, Arrays.asList(destination1), new ArrayList<>());

        // Create a standard passenger
        Passenger standardPassenger = PassengerFactory.createPassenger("standard", "John", 123, 1000.0);
        travelPackage.addPassenger(standardPassenger);

        // Sign up the passenger for an activity
        ActivityManager activityManager = travelPackage.getActivityManager();
        try {activityManager.signUpPassengerForActivity(standardPassenger, hiking);} catch (Exception e) {}

        // Assert that the passenger is signed up for the activity
        assertEquals(1, standardPassenger.getSignedUpActivities().size());
    }

    // Add more test methods as needed
}
