import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Guest guest2;

    @Before
    public void setup(){
        conferenceRoom = new ConferenceRoom(15, "Murray Room");
        guest = new Guest("Adam");
        guest2 = new Guest("Eve");
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(15, conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomCanAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuests().size());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest);
        assertEquals(1, conferenceRoom.getGuests().size());
    }
    @Test
    public void conferenceRoomArea(){
        assertEquals(20, Room.calculateRoomSize(5,4), 0.01);
    }
}
