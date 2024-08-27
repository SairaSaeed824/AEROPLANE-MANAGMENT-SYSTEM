import java.util.ArrayList;

public class Aeroplane {
    private int aeroplaneNumber;
    private ArrayList<Flight> flights = new ArrayList<>();
    private int row = 10;
    private int column = 4;
    private boolean status;

     Seat reservation[][] = new Seat[row][column];



    public Aeroplane(int aeroplaneNumber) {
        this.aeroplaneNumber = aeroplaneNumber;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                reservation[i][j] = new Seat();
            }
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAeroplaneNumber() {
        return aeroplaneNumber;
    }

    public void setAeroplaneNumber(int aeroplaneNumber) {
        this.aeroplaneNumber = aeroplaneNumber;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }


    public void displayAvailableSeats(ClassesOfSeats type) {
        if(type==ClassesOfSeats.BUISNESS) {
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= column; j++) {
                    if (reservation[i-1][j-1].isReserved()) {
                        System.out.print("X ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        } else if (type==ClassesOfSeats.ECONOMY) {
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <=column; j++) {
                    if (reservation[i-1][j-1].isReservedEconomy()) {
                        System.out.print("X ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

        }else if(type==ClassesOfSeats.PREMIUM){
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= column; j++) {
                    if (reservation[i-1][j-1].isReservePremium()) {
                        System.out.print("X ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }

    }

   /* public void SetstatusofSeat(boolean status){
        this.status=false;
    }*/
    /*public boolean getSeatStatus(){
        return false;
    }
    public boolean ReserveSeats(){
        if(!getSeatStatus()){
            SetstatusofSeat(true);
        }
        return true;
    }*/

    public void reserveSeat(ClassesOfSeats type,int row, int column) {
        Seat seat=new Seat();
        if(type==ClassesOfSeats.BUISNESS){
            seat.setSeatNumber(((row-1)*4)+column);
        }

         else if (type==ClassesOfSeats.ECONOMY) {
            seat.setSeatNumber(40+((row-1)*4)+column);

        }
         else{
             seat.setSeatNumber(80+((row-1)*4)+column);
        }
        System.out.println("seat num is :" +seat.getSeatNumber());
        if (type == ClassesOfSeats.BUISNESS) {
            if (row > 0 && row <= this.row && column > 0 && column <= this.column) {
                if (!reservation[row-1][column-1].isReserved()) {
                    reservation[row-1][column-1].setReserved(true);
                    System.out.println("Seat reserved successfully.");
                } else {
                    System.out.println("Seat already reserved.");
                }
            } else {
                System.out.println("Invalid seat position.");
            }
        }
        else if(type==ClassesOfSeats.ECONOMY){
            if (row > 0 && row <= this.row && column >0 && column <= this.column) {
                if (!reservation[row-1][column-1].isReserved()) {
                    reservation[row-1][column-1].setReservedEconomy(true);
                    System.out.println("Seat reserved successfully.");
                } else {
                    System.out.println("Seat already reserved.");
                }
            } else {
                System.out.println("Invalid seat positionn.");
            }
        }
        else{
            if (row > 0 && row <=this.row && column > 0 && column <=this.column) {
                if (!reservation[row-1][column-1].isReserved()) {
                    reservation[row-1][column-1].setReservePremium(true);
                    System.out.println("Seat reserved successfully.");
                } else {
                    System.out.println("Seat already reserved.");
                }
            } else {
                System.out.println("Invalid seat position.");
            }
        }
    }

    public  void AeroplaneSeats(){
        displayAvailableSeats(ClassesOfSeats.BUISNESS);
        displayAvailableSeats(ClassesOfSeats.ECONOMY);
        displayAvailableSeats(ClassesOfSeats.PREMIUM);
    }
}
