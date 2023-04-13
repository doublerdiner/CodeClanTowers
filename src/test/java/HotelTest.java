import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest;
    private Guest guest2;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void setup(){
        hotel = new Hotel();
        guest = new Guest("Laura");
        guest2 = new Guest("Dale");
    }

    @Test
    public void hotelHasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void canAddGuestToBookingList(){
        hotel.addGuestToBookingList(guest);
        assertEquals(1, hotel.getBookingList().size());
    }

    @Test
    public void canClearBookingList(){
        hotel.addGuestToBookingList(guest);
        hotel.addGuestToBookingList(guest2);
        hotel.clearBookingList();
        assertEquals(0, hotel.getBookingList().size());
    }
    @Test
    public void hotelCanAddGuestToBedroom(){
        hotel.addGuestToBookingList(guest);
        hotel.addGuestToBookingList(guest2);
        hotel.addGuestsToRoom(hotel.getBedrooms().get(3));
        assertEquals(2, hotel.getBedrooms().get(3).getGuests().size());
    }
    @Test
    public void hotelCanRemoveGuestFromBedroom(){
        hotel.addGuestToBookingList(guest);
        hotel.addGuestToBookingList(guest2);
        hotel.addGuestsToRoom(hotel.getBedrooms().get(3));
        hotel.removeGuestsFromRoom(hotel.getBedrooms().get(3));
        assertEquals(0, hotel.getBedrooms().get(3).getGuests().size());
    }
    @Test
    public void hotelCanAddGuestToConferenceRoom(){
        hotel.addGuestToBookingList(guest);
        hotel.addGuestToBookingList(guest2);
        hotel.addGuestsToRoom(hotel.getConferenceRooms().get(0));
        assertEquals(2, hotel.getConferenceRooms().get(0).getGuests().size());
    }
    @Test
    public void hotelCanRemoveGuestFromConferenceRoom(){
        hotel.addGuestToBookingList(guest);
        hotel.addGuestToBookingList(guest2);
        hotel.addGuestsToRoom(hotel.getConferenceRooms().get(0));
        hotel.removeGuestsFromRoom(hotel.getConferenceRooms().get(0));
        assertEquals(0, hotel.getConferenceRooms().get(0).getGuests().size());
    }
    @Test
    public void roomCanBeBooked(){
        Bedroom room1 = hotel.getBedrooms().get(0);
        Booking booking = hotel.bookRoom(room1, 15);
        assertEquals("Single", booking.getBedroom().getRoomType().getFormattedName());
        assertEquals(1, booking.getBedroom().getCapacity());
        assertEquals(15, booking.getNumberOfNightsBooked());
    }

    @Test
    public void hotelHasDiningRooms(){
        assertEquals(2, hotel.getDiningRooms().size());
        assertEquals(true, hotel.getDiningRooms().containsKey("Pizza Planet"));
    }

    @Test
    public void roomCanNotBeOverBooked(){
        hotel.addGuestToBookingList(guest);
        hotel.addGuestToBookingList(guest2);
        hotel.addGuestToBookingList(guest2);
        hotel.addGuestsToRoom(hotel.getBedrooms().get(1));
        assertEquals(0, hotel.getBedrooms().get(1).getGuests().size());
    }

    @Test
    public void getListOfEmptyRooms(){
        hotel.addGuestToBookingList(guest);
        hotel.addGuestsToRoom(hotel.getBedrooms().get(0));
        hotel.addGuestToBookingList(guest);
        hotel.addGuestsToRoom(hotel.getBedrooms().get(1));
        hotel.addGuestToBookingList(guest);
        hotel.addGuestsToRoom(hotel.getBedrooms().get(2));

        ArrayList<Bedroom> answer = hotel.getEmptyRooms();
        assertEquals(1, answer.size());
        assertEquals("Honeymoon", answer.get(0).getRoomType().getFormattedName());

    }

}
