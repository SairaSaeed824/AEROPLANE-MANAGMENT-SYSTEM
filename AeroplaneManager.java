import java.util.ArrayList;

public class AeroplaneManager {
    private String registrationDate;
    ArrayList<Aeroplane> aeroplanes = new ArrayList<>();
    ArrayList<Flight> flights = new ArrayList<>();

    public AeroplaneManager() {
    }

    public AeroplaneManager(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void addAeroplane(Aeroplane aeroplaneAdding) {
        aeroplanes.add(aeroplaneAdding);
        System.out.println("Aeroplane with " + aeroplaneAdding.getAeroplaneNumber() + " added successfully");
    }

    public void removeAeroplane(int aeroplaneNumber) {
        for (Aeroplane aeroplane : aeroplanes) {
            if (aeroplane.getAeroplaneNumber() == aeroplaneNumber) {
                aeroplanes.remove(aeroplane);
                System.out.println("Aeroplane removed");
                return;
            }
        }
        System.out.println("Aeroplane not found");
    }

    public void addFlights(Flight flight) {
        if (!isAssignedAlready(flight)) {
            flights.add(flight);
            System.out.println("Flight added successfully");
        } else {
            System.out.println("Cannot add flight. It is already assigned to another aeroplane.");
        }
    }

    public void searchFlights(Flight flightSearch) {
        int i = 1;
        for (Aeroplane aeroplane : aeroplanes) {
            if (aeroplane.getFlights().contains(flightSearch)) {
                System.out.println("Flight no " + i);
                System.out.printf("AEROPLANE NUMBER: %d%nDEPARTURE DATE: %s%nDEPARTURE TIME: %s%nARRIVAL DATE: %s%nARRIVAL TIME: %s%n",
                        aeroplane.getAeroplaneNumber(), flightSearch.getDepartureDate(), flightSearch.getDepartureTime(), flightSearch.getArrivalDate(), flightSearch.getArrivalTime());
                i++;
            }
        }
    }

    public boolean isAssignedAlready(Flight flight) {
        for (Aeroplane aeroplane : aeroplanes) {
            if (aeroplane.getFlights().contains(flight)) {
                System.out.println("Flight already assigned to Aeroplane " + aeroplane.getAeroplaneNumber());
                return true;
            }
        }
        return false;
    }

    public void addFlightToAeroplane(int aeroplaneNumber, Flight flight) {
        if (isAssignedAlready(flight)) {
            System.out.println("This flight is already assigned to another aeroplane.");
            return;
        }

        Aeroplane aeroplane = getAeroplaneByNumber(aeroplaneNumber);
        if (aeroplane != null) {
            aeroplane.addFlight(flight);
            flights.add(flight);  // Ensure the flight is added to the manager's flight list
            System.out.println("Flight added to Aeroplane " + aeroplaneNumber);
        } else {
            System.out.println("Aeroplane not found.");
        }
    }

    public Aeroplane getAeroplaneByNumber(int aeroplaneNumber) {
        for (Aeroplane aeroplane : aeroplanes) {
            if (aeroplane.getAeroplaneNumber() == aeroplaneNumber) {
                return aeroplane;
            }
        }
        return null;
    }
}
