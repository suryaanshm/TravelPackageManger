import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * The Runner class demonstrates the creation of a travel package with destinations,
 * passengers, and activities. It also signs up passengers for activities and displays
 * itinerary and passenger information.
 */
public class Runner {

    /**
     * The main method creates destinations, activities, passengers, and a travel package.
     * It signs up passengers for activities and displays itinerary and passenger information.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Create activities for Destination 1
        Activity hiking = new Activity("Hiking", "Enjoy a scenic hike", 50.0, 5);
        Activity sightseeing = new Activity("Sightseeing Tour", "Explore local attractions", 100.0, 15);
        Destination destination1 = new Destination("Destination 1");
        destination1.addActivity(hiking);
        destination1.addActivity(sightseeing);

        // Create activities for Destination 2
        Activity snorkeling = new Activity("Snorkeling", "Discover underwater life", 80.0, 8);
        Activity surfing = new Activity("Surfing", "Ride the waves", 120.0, 12);
        Destination destination2 = new Destination("Destination 2");
        destination2.addActivity(snorkeling);
        destination2.addActivity(surfing);

        // Create activities for Destination 3
        Activity parasailing = new Activity("Parasailing", "Fly high above the ocean", 150.0, 6);
        Activity scubaDiving = new Activity("Scuba Diving", "Explore the depths of the sea", 200.0, 8);
        Destination destination3 = new Destination("Destination 3");
        destination3.addActivity(parasailing);
        destination3.addActivity(scubaDiving);

        // Create travel package with destinations
        List<Destination> destinations = Arrays.asList(destination1, destination2, destination3);
        List<Passenger> passengers = new ArrayList<>();

        TravelPackage travelPackage = new TravelPackage("Sample Travel Package", 10, destinations, passengers);

        // Create passengers
        Passenger standardPassenger = PassengerFactory.createPassenger("standard", "John", 123, 1000.0);
        Passenger goldPassenger = PassengerFactory.createPassenger("gold", "Alice", 456, 1000.0);
        Passenger premiumPassenger = PassengerFactory.createPassenger("premium", "Bob", 789, 1000.0);

        // Add passengers to the travel package
        travelPackage.addPassenger(standardPassenger);
        travelPackage.addPassenger(goldPassenger);
        travelPackage.addPassenger(premiumPassenger);

        // Access activity manager and sign up passengers for activities
        ActivityManager activityManager = travelPackage.getActivityManager();
        try {
            activityManager.signUpPassengerForActivity(standardPassenger, hiking);
            activityManager.signUpPassengerForActivity(goldPassenger, snorkeling);
            activityManager.signUpPassengerForActivity(goldPassenger, surfing);
            activityManager.signUpPassengerForActivity(goldPassenger, hiking);
            activityManager.signUpPassengerForActivity(premiumPassenger, snorkeling);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display itinerary, passenger list, and details
        travelPackage.displayItinerary();
        travelPackage.displayPassengerList();
        goldPassenger.display();
        travelPackage.displayActivitiesDetails();
    }
}
