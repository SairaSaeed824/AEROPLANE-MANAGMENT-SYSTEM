import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aeroplane aeroplane1 = new Aeroplane(12);
        Aeroplane aeroplane2 = new Aeroplane(1);
        Scanner input = new Scanner(System.in);
        System.out.println("----------WELCOME TO PIA AIRPLANE SYSTEM ------------");
        System.out.println("1-Want to register one aeroplane");
        System.out.println("2-Want to register more than one aroplanes");
        System.out.println("ENTER CHOICE :");
        int choice=input.nextInt();
        AeroplaneManager manager;

        System.out.println("Enter registration date:");
        input.nextLine();
        String dateOfRegistration = input.nextLine();

        if (choice == 1) {
            manager = new AeroplaneManager(dateOfRegistration);
           manager.addAeroplane(aeroplane1);
        } else if (choice == 2) {
            manager = new AeroplaneManager(dateOfRegistration);
            manager.addAeroplane(aeroplane1);
            manager.addAeroplane(aeroplane2);
        } else {
            System.out.println("Invalid choice.");
            return;
        }


        manager.addFlightToAeroplane(12, Flight.Lahore_to_Karachi);
       // manager.addFlightToAeroplane(1, Flight.Lahore_to_Karachi);
        Passenger passenger1 = new Passenger("John Doe", "123456789", "555-5555", "john@example.com", "American", "Male", Flight.Lahore_to_Karachi, ClassesOfSeats.ECONOMY, FoodType.CHINESE, null);
        Passenger passenger2 = new Passenger("Jane Smith", "987654321", "555-1234", "jane@example.com", "British", "Female", Flight.Islamabad_to_Lahore, ClassesOfSeats.PREMIUM, FoodType.DESI, null);

        // Create luggage for each passenger
        Luggage luggage1 = new Luggage("Checked Baggage", 20.0, 50.0, 40.0, 30.0, passenger1);
        Luggage luggage2 = new Luggage("Checked Baggage", 18.0, 55.0, 35.0, 28.0, passenger2);

        // Associate luggage with passengers
        passenger1.setLuggage(luggage1);
        passenger2.setLuggage(luggage2);
        System.out.println(passenger1);
        System.out.println("flight avalaible  for "+passenger1.getFlight());
        manager.searchFlights(passenger1.getFlight());
        //manager.searchFlights(Flight.Islamabad_to_Lahore);
        aeroplane1.displayAvailableSeats(passenger1.type);
        aeroplane1.reserveSeat(ClassesOfSeats.PREMIUM,10,1);
        aeroplane1.displayAvailableSeats(passenger1.type);
        aeroplane1.reserveSeat(ClassesOfSeats.PREMIUM,9,1);
        aeroplane1.displayAvailableSeats(passenger1.type);
        //Luggage luggage1 = new Luggage("Checked Baggage", 23.0, 55.0, 40.0, 20.0);
       // Passenger passenger2 = new Passenger("Ali", "35202", "03237757", "sairaa", "Pak", "Female", Flight.Lahore_to_Karachi,ClassesOfSeats.PREMIUM,FoodType.DESI,luggage1);
        System.out.println(passenger2);
        System.out.println("Processing luggage for Passenger 1:");
        LuggageHandler.boardLuggage(luggage1);


        System.out.println("AEROPLANE SEATS :");
         aeroplane1.AeroplaneSeats();
         PriceCalculate price=new PriceCalculate();
        price.price( passenger1.type);
        Pilot pilot=new Pilot("ali","333","213","sad","ind","fema",1,PilotType.COPILOT);
        SalaryPilot salary=new SalaryPilot(pilot.getType());
        salary.Salary(pilot.getType());
        System.out.println(pilot);
        AirHostes airHostes=new AirHostes("Saira","32","34","sd","pak","fe",1,1,"matric",AirHostesType.BUISNESS);
        AirHostesSalary salary1=new AirHostesSalary();
        salary1.salary(airHostes.getType());
        System.out.println(airHostes);
       // System.out.println(passenger1.getLuggage().toString());



    }
}
