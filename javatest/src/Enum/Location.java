package Enum;

public enum Location {
    WINDOW(" у окна")
    ,HOUSE_ROOF(" у себя в домике Кна крыше")
    ,PLACE(" в пространстве")
    ;
    private String locationEnum;

    Location(String locationEnum) {
        this.locationEnum = locationEnum;
    }
    public String getLocation() {
         return locationEnum;
    }
}
