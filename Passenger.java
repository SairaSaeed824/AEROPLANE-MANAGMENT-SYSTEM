import java.util.List;

public class Passenger extends Person {

    private Flight flight;
     ClassesOfSeats type;
    private FoodType food;
    private Luggage luggage;

    public Passenger(String name, String cnic, String phoneNumber, String email, String nationality, String gender, Flight flight, ClassesOfSeats type, FoodType food, Luggage luggage) {
        super(name, cnic, phoneNumber, email, nationality, gender);
        this.flight = flight;
        this.type = type;
        this.food = food;
        this.luggage = luggage;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    public void collectLuggage() {
        List<Luggage> luggageList = LuggageHandler.deliverLuggage(this);
        if (luggageList.isEmpty()) {
            System.out.println("No luggage found for passenger: " + getName());
        } else {
            System.out.println("Luggage delivered to passenger: " + getName());
            for (Luggage luggage : luggageList) {
                System.out.println(luggage);
            }
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                super.toString() +
                ", flight=" + flight +
                ", type=" + type +
                ", food=" + food +
                ", luggage=" + luggage +
                '}';
    }
}
