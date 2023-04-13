import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.name = "CodeClan Towers";
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        bedrooms.add(new Bedroom(1, RoomType.SINGLE));
        bedrooms.add(new Bedroom(2, RoomType.DOUBLE));
        bedrooms.add(new Bedroom(3, RoomType.TWIN));
        bedrooms.add(new Bedroom(4, RoomType.HONEYMOON));
        conferenceRooms.add(new ConferenceRoom(15, "Murray Room"));
        conferenceRooms.add(new ConferenceRoom(30, "Jute Suite"));
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

}
