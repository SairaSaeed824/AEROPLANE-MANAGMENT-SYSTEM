public class PriceCalculate {
    double price;
    ClassesOfSeats seats;
    public void price(ClassesOfSeats seat){
        if(seat==ClassesOfSeats.ECONOMY){
            price=ClassesOfSeats.ECONOMY.getPrice();
            System.out.println("Price is"+ price);
        }
        else if(seat==ClassesOfSeats.BUISNESS){
            price=ClassesOfSeats.BUISNESS.getPrice();
            System.out.println("Price is"+ price);
        }
        else{
            price=ClassesOfSeats.PREMIUM.getPrice();
            System.out.println("Price is"+ price);
        }

    }
}
