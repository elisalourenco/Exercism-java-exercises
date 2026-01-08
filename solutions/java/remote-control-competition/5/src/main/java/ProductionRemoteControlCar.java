class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled = 0;
    private int numberOfVictoriesi = 0;

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictoriesi;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        numberOfVictoriesi = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        if (this.numberOfVictoriesi != otherCar.numberOfVictoriesi) {
            return Integer.compare(otherCar.numberOfVictoriesi, this.numberOfVictoriesi);
        } else {
            return Integer.compare(otherCar.distanceTravelled, this.distanceTravelled);
        }
    }
}
