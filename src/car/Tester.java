package car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date d = sdf.parse("08:58");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        Car c1 = new Car("abc-123", "15:47");
        Car c2 = new Car("xyz-888", "07:30");
        Car c3 = new Car("fgh-561", "11:15");
        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id, c3);
        System.out.println(c1.enter);
        String id = "xyz-888";
        Car car = cars.get(id);
        if (car == null) {
            System.out.println("Car not found");
        } else {
            Date now = new Date();
            long ms = now.getTime() - car.getEnter().getTime();
            long mins = ms / (1000 * 60);
            System.out.println(mins);

            long distance = now.getTime() - c1.enter.getTime();
            System.out.println(distance);
        }
    }
}
