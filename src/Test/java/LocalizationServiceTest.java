import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceTest {

    @Test
    public void test_locale_USA() {

        LocalizationServiceImpl localizationServiceImpl = new LocalizationServiceImpl();

        Country testCountry = Country.USA;

        String expectedWelcome = "Welcome";

        String resultWelcome = localizationServiceImpl.locale(testCountry);

        Assertions.assertEquals(expectedWelcome, resultWelcome);

    }

    @Test
    public void test_locale_RUSSIA() {

        LocalizationServiceImpl localizationServiceImpl = new LocalizationServiceImpl();

        Country testCountry = Country.RUSSIA;

        String expectedWelcome = "Добро пожаловать";

        String resultWelcome = localizationServiceImpl.locale(testCountry);

        Assertions.assertEquals(expectedWelcome, resultWelcome);

    }

}
