import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;
    private DiningRoom diningRoom1 = new DiningRoom(30, "Pizza Planet");
    private DiningRoom diningRoom2 = new DiningRoom(100, "The Black Olive");

    public Hotel(){
        this.name = "CodeClan Towers";
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
        bedrooms.add(new Bedroom(1, RoomType.SINGLE, 120));
        bedrooms.add(new Bedroom(2, RoomType.DOUBLE, 180));
        bedrooms.add(new Bedroom(3, RoomType.TWIN, 200));
        bedrooms.add(new Bedroom(4, RoomType.HONEYMOON, 300));
        conferenceRooms.add(new ConferenceRoom(15, "Murray Room"));
        conferenceRooms.add(new ConferenceRoom(30, "Jute Suite"));
        diningRooms.put(diningRoom1.getName(), diningRoom1);
        diningRooms.put(diningRoom2.getName(), diningRoom2);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addGuestToRoom(Room room, Guest guest){
        room.addGuest(guest);
    }

    public void removeGuestFromRoom(Room room, Guest guest){
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
        return new Booking(bedroom, nights);
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }
}
