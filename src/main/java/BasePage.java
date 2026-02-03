import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public SelenideElement clientsButton = $(By.xpath("//a[@data-component='button' and @href='/']"));
    public SelenideElement privateButton = $(By.xpath("//a[@data-component='button' and @href='/ultima']"));
    public SelenideElement businessButton = $(By.xpath("//a[@data-component='button' and @href='/business']"));
    public SelenideElement partnersButton = $(By.xpath("//a[@data-component='button' and @href='/partners']"));
    public SelenideElement aboutBCSButton = $(By.xpath("//button[@data-component='button'][./span[text()='О БКС']]"));

    public SelenideElement loginButton = $(By.xpath("//a[@data-component='button' and @href='https://lk.bcs.ru/']"));
    public SelenideElement openAccountButton = $(By.xpath("//a[@data-component='button' and @href='#dobs']"));
}