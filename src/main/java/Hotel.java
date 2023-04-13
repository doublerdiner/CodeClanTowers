import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> bookingList;
    private HashMap<String, DiningRoom> diningRooms;
    private DiningRoom diningRoom1 = new DiningRoom(30, "Pizza Planet");
    private DiningRoom diningRoom2 = new DiningRoom(100, "The Black Olive");

    public Hotel(){
        this.name = "CodeClan Towers";
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
        this.bookingList = new ArrayList<>();
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

    public ArrayList<Guest> getBookingList() {
        return bookingList;
    }

    public void addGuestToBookingList(Guest guest) {
        this.bookingList.add(guest);
    }

    public void clearBookingList(){
        this.bookingList.clear();
    }
    public void addGuestsToRoom(Room room){
        if(room.getCapacity() >= this.bookingList.size() && room.getGuests().size() == 0) {
            for(Guest guest : this.bookingList) {
                room.addGuest(guest);
            }
        }
        this.bookingList.clear();
    }

    public void removeGuestsFromRoom(Room room){
        room.getGuests().clear();
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
        return new Booking(bedroom, nights);
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public ArrayList<Bedroom> getEmptyRooms(){
        ArrayList<Bedroom> answer = new ArrayList<>();
        for(Bedroom bedroom : this.getBedrooms()){
            if(bedroom.getGuests().size() == 0) {
                answer.add(bedroom);
            }
        }
        return answer;
    }
}
