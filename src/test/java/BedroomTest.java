import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void setup(){
        guest = new Guest("Dan");
        bedroom = new Bedroom(1, RoomType.SINGLE, 120);
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void bedroomCanAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void bedroomHasRoomType(){
        assertEquals("Single", bedroom.getRoomType().getFormattedName());
    }

    @Test
    public void  bedroomHasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void bedroomHasRate(){
        assertEquals(120, bedroom.getRate(), 0.01);
    }
}
