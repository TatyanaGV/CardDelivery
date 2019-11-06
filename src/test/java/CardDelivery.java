import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class CardDelivery {
    @Test
    void shouldRegisterByDeliverCardPositive() {
        open("http://localhost:9999");
        $("[data-test-id=city] input").setValue("Москва");
        $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        $("[data-test-id=date] input").setValue(addDate( ));
        $("[data-test-id=name] input").setValue("Василий Васильев");
        $("[data-test-id=phone] input").setValue("+79200000000");
        $("[data-test-id=agreement]").click();
        $$("button").find(exactText("Забронировать")).click();
        $(withText("Успешно")).waitUntil(visible, 15000);
    }

    @Test
    void shouldRegisterByDeliverCardNegative() {
        open("http://localhost:9999");
        $("[data-test-id=city] input").setValue("Москва");
        $("[data-test-id=date] input").sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        $("[data-test-id=date] input").setValue(addDate( ));
        $("[data-test-id=name] input").setValue("Василий Васильев");
        $("[data-test-id=agreement]").click();
        $$("button").find(exactText("Забронировать")).click();
        $(withText("Поле обязательно для заполнения")).waitUntil(visible, 15000);
    }

    public String addDate () {
        LocalDate today = LocalDate.now();
        LocalDate date3Day = today.plusDays(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
        String formatDate = formatter.format(date3Day);
        return formatDate;
    }
}
