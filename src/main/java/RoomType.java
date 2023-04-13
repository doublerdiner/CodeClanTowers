public enum RoomType {
    SINGLE("Single", 1),
    DOUBLE("Double", 2),
    TWIN("Twin", 2),
    HONEYMOON("Honeymoon", 2);

    private final String formattedName;
    private final int capacity;
    RoomType(String formattedName, int capacity) {
        this.formattedName = formattedName;
        this.capacity = capacity;
    }

    public String getFormattedName() {
        return formattedName;
    }

    public int getCapacity() {
        return capacity;
    }
}
