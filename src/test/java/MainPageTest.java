import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class MainPageTest extends BaseTest {

    @Test(description = "Тест отображения главной страницы")
    public void mainPageHeaderTest() {
        MainPage mainPage = new MainPage();
        mainPage.openPage();

        // Проверяем видимость и текс элементов меню
        mainPage.clientsButton.should(visible).should(text("Частным клиентам"));
        mainPage.privateButton.should(visible).should(text("Private"));
        mainPage.businessButton.should(visible).should(text("Бизнесу"));
        mainPage.partnersButton.should(visible).should(text("Партнерам"));
        mainPage.aboutBCSButton.should(visible).should(text("О БКС"));

        // Проверяем видимость и текс элементов авторизации
        mainPage.loginButton.should(visible).should(text("Войти"));
        mainPage.openAccountButton.should(visible).should(text("Открыть счет"));
    }

    @DataProvider
    public Object[][] menuData() {
        MainPage mainPage = new MainPage();
        return new Object[][] {
                {mainPage.clientsButton, "Инвестиционная компания БКС Мир Инвестиций"},
                {mainPage.privateButton, "БКС Ультима. Особый подход к управлению капиталом состоятельных клиентов"},
                {mainPage.businessButton, "Брокерское обслуживание для бизнеса от БКС. Все финансовые инструменты для совершения сделок на рынке ценных бумаг"},
                {mainPage.partnersButton, "Партнерская программа БКС Мир Инвестиций | Зарабатывайте деньги вместе с надежным игроком на финансовом рынке"},
                {mainPage.aboutBCSButton, "Инвестиционная компания БКС Мир Инвестиций"}
        };
    }

    @Test(description = "Тест навигации в меню", dataProvider = "menuData")
    public void mainPageMenuNavigationTest(SelenideElement element, String pageTitle) {
        MainPage mainPage = new MainPage();
        mainPage.openPage();

        element.click();
        Assert.assertEquals(Selenide.title(), pageTitle);
    }
}