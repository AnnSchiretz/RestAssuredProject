package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class TendersObject {

    @Expose
    String id;
    @Expose
    String date;
    @Expose
    @SerializedName("deadline_date")
    String deadlineDate;
    @Expose
    @SerializedName("deadline_length_days")
    Integer deadlineLengthDays;
    @Expose
    @SerializedName("deadline_length_hours")
    String deadlineLengthHours;
    @Expose
    String title;
    @Expose
    String category;
    @Expose
    String description;
    @Expose
    String sid;
    @Expose
    @SerializedName("awarded_value")
    String awardedValue;
    @Expose
    @SerializedName("awarded_currency")
    String awardedCurrency;
    @Expose
    @SerializedName("awarded_value_eur")
    String awardedValueEur;
    @Expose
    PurchaserModel purchaser;
    @Expose
    TypeModel type;
    @Expose
    AwardedModel[] awarded;
}
