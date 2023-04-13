import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Hotel hotel;

    @Before
    public void setup(){
        hotel = new Hotel();
        booking = new Booking(hotel.getBedrooms().get(0),5);
    }

    @Test
    public void bookingHasRoom(){
        assertEquals("Single", booking.getBedroom().getRoomType().getFormattedName());
        assertEquals(1, booking.getBedroom().getRoomNumber());
    }
    @Test
    public void bookingHasNumberOfNights(){
        assertEquals(5, booking.getNumberOfNightsBooked());
    }

    @Test
    public void bookingCanCalculateTheTotal(){
        assertEquals(600, booking.calculateBill(), 0.01);
    }


}
