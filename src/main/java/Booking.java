public class Booking {

    private Bedroom bedroom;
    private int numberOfNightsBooked;

    public Booking(Bedroom bedroom, int numberOfNightsBooked) {
        this.bedroom = bedroom;
        this.numberOfNightsBooked = numberOfNightsBooked;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumberOfNightsBooked() {
        return numberOfNightsBooked;
    }

    public double calculateBill(){
        return (this.bedroom.getRate() * this.numberOfNightsBooked);
    }

}
