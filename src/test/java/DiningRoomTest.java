import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest;
    private Guest guest2;

    @Before
    public void setup(){
        diningRoom = new DiningRoom(30, "CodeClan Diner");
        guest = new Guest("Log Lady");
        guest2 = new Guest("Officer Andy");
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest2);
    }

    @Test
    public void diningRoomHasName(){
        assertEquals("CodeClan Diner", diningRoom.getName());
    }

    @Test
    public void diningRoomHasCapacity(){
        assertEquals(30, diningRoom.getCapacity());
    }

    @Test
    public void diningRoomHasGuests(){
        assertEquals(2, diningRoom.getGuests().size());
    }

    @Test
    public void diningRoomCanRemoveGuests(){
        diningRoom.removeGuest(guest);
        assertEquals(1, diningRoom.getGuests().size());
    }

    @Test
    public void diningRoomArea(){
        assertEquals(25, Room.calculateRoomSize(5,5), 0.01);
    }

}
