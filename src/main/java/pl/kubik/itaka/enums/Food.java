package pl.kubik.itaka.demo.enums;

public enum Food {
    BB("bed & breakfast"),
    HB ("half board"),
    FB ("full board"),
    AI ("all inclusive"),
    OV ("overnight");

    private String description;

    Food(String description) {
        this.description = description;
    }
}
