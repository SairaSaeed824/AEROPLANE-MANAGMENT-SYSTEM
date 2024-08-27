public class Seat {
    private boolean reservedEconomy;
    private boolean reservePremium;
    private boolean reserved;
    Aeroplane aeroplane;
    private int seatNumber;

    public Seat() {
        this.reserved = false;
        this.reservedEconomy=false;
        this.reservePremium=false;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isReservedEconomy() {
        return reservedEconomy;
    }

    public void setReservedEconomy(boolean reservedEconomy) {
        this.reservedEconomy = reservedEconomy;
    }

    public boolean isReservePremium() {
        return reservePremium;
    }

    public void setReservePremium(boolean reservePremium) {
        this.reservePremium = reservePremium;
    }

   /* public void seatNumber(ClassesOfSeats type,int row,int column) {
        if (type == ClassesOfSeats.BUISNESS) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 4; j++) {
                    aeroplane.reservation[row][column] = aeroplane.reservation[i + 1][j + 1];


                }

            }
        }
        else if (type == ClassesOfSeats.ECONOMY) {
            for (int i = 10; i < 20; i++) {
                for (int j = 0; j < 4; j++) {
                    aeroplane.reservation[row][column] = aeroplane.reservation[i + 1][j + 1];


                }

            }
        }
       else if (type == ClassesOfSeats.PREMIUM) {
            for (int i =20; i < 30; i++) {
                for (int j = 0; j < 4; j++) {
                    aeroplane.reservation[row][column] = aeroplane.reservation[i + 1][j + 1];


                }

            }
        }
    }*/

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
