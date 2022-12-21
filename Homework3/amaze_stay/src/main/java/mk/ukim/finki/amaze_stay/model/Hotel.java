package mk.ukim.finki.amaze_stay.model;

import lombok.Data;

@Data
public class Hotel {
    private Long id;
    private float latitude;
    private float longitude;
    private String name;
    private String website;
    private String address;
    private String phoneNumber;
    private String email;
    private String description;
    private String imagePath;
    private String bookingLink;

    public Hotel(Long id, float latitude, float longitude,
                 String name, String website, String address, String phoneNumber,
                 String email, String description, String imagePath, String bookingLink) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.website = website;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
        this.imagePath = imagePath;
        this.bookingLink = bookingLink;
    }
}
