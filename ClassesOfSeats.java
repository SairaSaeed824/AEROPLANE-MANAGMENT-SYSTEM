public enum ClassesOfSeats {
    BUISNESS(100),
    PREMIUM(200),
    ECONOMY(300);

    private double Price;
    ClassesOfSeats(double Price) {
        this.Price=Price;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
