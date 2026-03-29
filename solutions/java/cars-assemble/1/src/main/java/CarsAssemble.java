public class CarsAssemble {
    int basicProductionRatePerHour = 221;

    public double productionRatePerHour(int speed) {
        int successRate;
        if (speed >= 1 && speed <= 4) {
            successRate = 100;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 90;
        } else if (speed == 9) {
            successRate = 80;
        } else if (speed == 10) {
            successRate = 77;
        } else {
            successRate = 0;
        }
        return basicProductionRatePerHour * speed * successRate / 100.0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
