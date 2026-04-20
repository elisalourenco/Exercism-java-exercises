public class JedliksToyCar {
    int distanceDriven = 0;
    int batteryPercentage = 100;

    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + "%";
        }
    }

    public void drive() {
        if (batteryPercentage == 0) {
            return;
        }
        distanceDriven += 20;
        batteryPercentage -= 1;
    }
}
