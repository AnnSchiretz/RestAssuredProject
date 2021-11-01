package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class AwardedModel {

    @Expose
    String data;
    @Expose
    @SerializedName("value_for_tow")
    String valueForTow;
    @Expose
    @SerializedName("value_for_tow_eur")
    String valueForTowEur;
    @Expose
    SuppliersModel[] suppliers;
    @Expose
    @SerializedName("value_min")
    String valueMin;
    @Expose
    @SerializedName("value_for_three")
    String valueForThree;
    @Expose
    @SerializedName("offers_count_status")
    String offersCountStatus;
    @Expose
    @SerializedName("value_for_one_eur")
    String valueForOneEur;
    @Expose
    Integer count;
    @Expose
    @SerializedName("value_for_one")
    String valueForOne;
    @Expose
    @SerializedName("suppliers_id")
    String suppliersId;
    @Expose
    @SerializedName("value_eur")
    String valueEur;
    @Expose
    @SerializedName("value_max")
    String valueMax;
    @Expose
    @SerializedName("offers_count")
    Integer[] offersCount;
    @Expose
    @SerializedName("suppliers_name")
    String suppliersName;
    @Expose
    String value;
    @Expose
    @SerializedName("value_estimated")
    String valueEstimated;
    @Expose
    @SerializedName("offers_count_data")
    OffersCountModel offersCountData;
}
