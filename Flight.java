public enum Flight {

    Lahore_to_Karachi("2May","24","21","21"),
    Islamabad_to_Lahore("12","1","12","3");
    String departureDate;
    String departureTime;
    String arrivalDate;
    String arrivalTime;


    Flight() {
    }

    Flight(String arrivalDate, String arrivalTime, String departureDate, String departureTime){
        this.arrivalDate=arrivalDate;
        this.arrivalTime=arrivalTime;
        this.departureTime=departureTime;
        this.departureDate=departureDate;

    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
