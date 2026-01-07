public class JedliksToyCar {
    int distanceDriven;
    int batteryPercentage;

    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        return "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        if (batteryPercentage == 0) {
            return;
        }
        distanceDriven += 20;
        batteryPercentage -= 1;
    }
}
