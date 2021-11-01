package models;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class PurchaserModel {

    @Expose
    String id;
    @Expose
    String sid;
    @Expose
    String name;
}
