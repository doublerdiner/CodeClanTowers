import org.junit.Before;
import org.junit.Test;

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
    public void hotelCanAddGuestToBedroom(){
        hotel.addGuestToRoom(hotel.getBedrooms().get(3), guest);
        hotel.addGuestToRoom(hotel.getBedrooms().get(3), guest2);
        assertEquals(2, hotel.getBedrooms().get(3).getGuests().size());
    }
    @Test
    public void hotelCanRemoveGuestFromBedroom(){
        hotel.addGuestToRoom(hotel.getBedrooms().get(3), guest);
        hotel.addGuestToRoom(hotel.getBedrooms().get(3), guest2);
        hotel.removeGuestFromRoom(hotel.getBedrooms().get(3), guest);
        assertEquals(1, hotel.getBedrooms().get(3).getGuests().size());
    }
    @Test
    public void hotelCanAddGuestToConferenceRoom(){
        hotel.addGuestToRoom(hotel.getConferenceRooms().get(0), guest);
        hotel.addGuestToRoom(hotel.getConferenceRooms().get(0), guest2);
        assertEquals(2, hotel.getConferenceRooms().get(0).getGuests().size());
    }
    @Test
    public void hotelCanRemoveGuestFromConferenceRoom(){
        hotel.addGuestToRoom(hotel.getConferenceRooms().get(0), guest);
        hotel.addGuestToRoom(hotel.getConferenceRooms().get(0), guest2);
        hotel.removeGuestFromRoom(hotel.getConferenceRooms().get(0), guest);
        assertEquals(1, hotel.getConferenceRooms().get(0).getGuests().size());
    }

}
