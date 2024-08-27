import java.util.ArrayList;
import java.util.List;

public class LuggageHandler {

    private static final double MAX_WEIGHT = 23.0; // Max weight allowed for checked luggage in kg
    private static final double MAX_LENGTH = 158.0; // Max total dimensions (length + width + height) in cm

    private static List<Luggage> cargoHold = new ArrayList<>();

    public static boolean checkLuggage(Luggage luggage) {
        if (luggage.getWeight() > MAX_WEIGHT) {
            System.out.println("Luggage exceeds the maximum weight limit.");
            return false;
        }

        double totalDimensions = luggage.getLength() + luggage.getWidth() + luggage.getHeight();
        if (totalDimensions > MAX_LENGTH) {
            System.out.println("Luggage exceeds the maximum dimension limit.");
            return false;
        }

        System.out.println("Luggage is within allowed limits.");
        return true;
    }

    public static void tagLuggage(Luggage luggage) {
        System.out.println("Tagging luggage for passenger: " + luggage.getOwner().getName());
    }

    public static void storeLuggage(Luggage luggage) {
        System.out.println("Storing luggage in cargo hold: " + luggage);
        cargoHold.add(luggage);
    }

    public static void boardLuggage(Luggage luggage) {
        if (checkLuggage(luggage)) {
            tagLuggage(luggage);
            storeLuggage(luggage);
            System.out.println("Luggage boarding complete for: " + luggage);
        } else {
            System.out.println("Luggage boarding failed.");
        }
    }

    public static void unloadLuggage() {
        System.out.println("Unloading all luggage from cargo hold.");
        cargoHold.clear();
    }

    public static List<Luggage> deliverLuggage(Passenger passenger) {
        System.out.println("Delivering luggage to passenger: " + passenger.getName());
        List<Luggage> passengerLuggage = new ArrayList<>();
        for (Luggage luggage : cargoHold) {
            if (luggage.getOwner().equals(passenger)) {
                passengerLuggage.add(luggage);
            }
        }
        return passengerLuggage;
    }
}
