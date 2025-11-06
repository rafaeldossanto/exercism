class NeedForSpeed {
    int battery;
    final int speed;
    final int batterydrain;
    public int distanceDriven;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batterydrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return battery < batterydrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (battery >= batterydrain) {
            distanceDriven += speed;
            battery -= batterydrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        NeedForSpeed testCar = new NeedForSpeed(car.speed, car.batterydrain);
        while (!testCar.batteryDrained()) {
            testCar.drive();
        }
        return testCar.distanceDriven() >= this.distance;
    }
}
