import com.luckycatlabs.sunrisesunset.SunriseSunsetCalculator;
import com.luckycatlabs.sunrisesunset.dto.Location;
import java.util.Calendar;

public class test1 {

    public static void main (String[] args) {

        Location location = new Location("39.9522222", "-75.1641667");
        SunriseSunsetCalculator calculator = new SunriseSunsetCalculator(location, "America/New_York");


        String officialSunrise = calculator.getOfficialSunriseForDate(Calendar.getInstance());
        Calendar officialSunset = calculator.getOfficialSunsetCalendarForDate(Calendar.getInstance());
        System.out.println("sunrise: " + officialSunrise);
        System.out.println("sunset: " + officialSunset);

    }
}
