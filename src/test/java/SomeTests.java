import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SomeTests {
    public static void main(String[] args) {
        open("https://www.e-katalog.ru/"); //открывакем е.маркет
        $("#ek-search").val("холодильник").pressEnter(); //находим поле поиска, вводим холодильник, жмем enter
        $(By.xpath("//a[@class='model-short-title no-u']")).click(); //находим первую ссылку в выдаче, кликаем
        $(byText("Холодильник")).should(exist); //позитивный тест на слово "Холодильник"
    }
}
