package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class SummaryModel {

    @Expose
    @SerializedName("value_eur")
    String valueEur;
    @Expose
    Integer count;
    @Expose
    String value;
}
