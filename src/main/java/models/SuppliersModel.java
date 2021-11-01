package models;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class SuppliersModel {

    @Expose
    String name;
    @Expose
    Integer id;
    @Expose
    String slug;

}
