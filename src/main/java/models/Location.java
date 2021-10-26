package models;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {

    @Expose
    String street;
    @Expose
    String city;
    @Expose
    String state;
    @Expose
    String country;
    @Expose
    String timezone;

}
