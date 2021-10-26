package models;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FullUser {

    @Expose
    String id;
    @Expose
    String title;
    @Expose
    String firstName;
    @Expose
    String lastName;
    @Expose
    String gender;
    @Expose
    String email;
    @Expose
    String dateOfBirth;
    @Expose
    String registerDate;
    @Expose
    String phone;
    @Expose
    String picture;
    @Expose
    Location location;

}
