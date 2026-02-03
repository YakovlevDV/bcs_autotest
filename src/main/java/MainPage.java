import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BasePage {

    private static final String URL = "https://bcs.ru/";

    public void openPage() {
        open(URL);
    }
}