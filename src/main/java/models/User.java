package models;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {

    @Expose
    String id;
    @Expose
    String title;
    @Expose
    String firstName;
    @Expose
    String lastName;
    @Expose
    String picture;

}
