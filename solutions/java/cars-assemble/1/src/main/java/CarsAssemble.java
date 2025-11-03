public class CarsAssemble {
    int carsPerHour = 221;

    public double productionRatePerHour(int speed) {
        if (speed > 0 && speed <= 4) {
            return speed * carsPerHour * 1.0;
        }
        if (speed >= 5 && speed <= 8) {
            return speed * carsPerHour * 0.90;
        }
        if (speed == 9) {return speed * carsPerHour * 0.80;}
        else return  speed * carsPerHour * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) Math.round(productionRatePerHour(speed))/60;
    }
}
