import adapter.Adapter;
import models.TendersObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TendersTest {
    String  DESCRIPTION_TENDER = "Przedmiotem zamówienia jest dostawa i wdrożenie systemu kopii zapasowych, w skład którego wchodzi " +
            "oprogramowanie do scentralizowanego zarządzania tworzeniem i odtwarzaniem kopii bezpieczeństwa oraz urządzenie pamięci " +
            "masowej. W ramach zaoferowanego systemu kopii zapasowych Wykonawca dostarczy sprzęt i licencje oraz wykona jego instalację, " +
            "uruchomienie i wdrożenie produkcyjne w siedzibie Zamawiającego";

    @Test(description = "Get the description from one of tender and compare with expected result")
    public void getTenderDescriptionTest(){
        TendersObject tender = new Adapter().getTender("https://tenders.guru/api/pl/tenders/1");
        Assert.assertEquals(DESCRIPTION_TENDER, tender.getDescription(), "Something goes wrong! The description of tender not equal!");
    }
}
