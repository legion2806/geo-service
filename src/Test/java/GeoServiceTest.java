import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceTest {

    @Test
    public void test_byIp_NULL() {

        GeoServiceImpl geoServiceImpl = new GeoServiceImpl();

        String testIp = "0.0.0.0";

        Location expectedLocation = null;

        Location resultLocation = geoServiceImpl.byIp(testIp);

        Assertions.assertEquals(expectedLocation, resultLocation);

    }

    @Test
    public void test_byIp_USA() {


        GeoServiceImpl geoService = new GeoServiceImpl();

        String ipUsa = "96.0.0.0";

        Location expectedLocation = new Location("New York", Country.USA, null, 0);

        Location resultlocation = geoService.byIp(ipUsa);

        Assertions.assertEquals(expectedLocation, resultlocation);
    }

    @Test
    public void test_byIp_MOSCOW() {

        GeoServiceImpl geoServiceImpl = new GeoServiceImpl();

        String testIp = GeoServiceImpl.MOSCOW_IP;

        Location expectedLocation = new Location("Moscow", Country.RUSSIA, "Lenina", 15);

        Location resultLocation = geoServiceImpl.byIp(testIp);

        Assertions.assertEquals(expectedLocation, resultLocation);

    }

    @Test
    public void test_byIp_NEW_YORK() {

        GeoServiceImpl geoService = new GeoServiceImpl();

        String ipUsa = GeoServiceImpl.NEW_YORK_IP;

        Location expectedLocation = new Location("New York", Country.USA, " 10th Avenue", 32);

        Location resultlocation = geoService.byIp(ipUsa);

        Assertions.assertEquals(expectedLocation, resultlocation);
    }

    @Test
    public void test_byIp_RUSSIA() {

        Location expectedLocation = new Location("Moscow", Country.RUSSIA, null, 0);

        GeoServiceImpl geoService = new GeoServiceImpl();

        String ipUsa = "172.0.0.0";

        Location resultlocation = geoService.byIp(ipUsa);

        Assertions.assertEquals(expectedLocation, resultlocation);
    }

}
