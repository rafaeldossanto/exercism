class RemoteControlCar
{
    private int Battery = 100;
    private int Meters = 0;
    public static RemoteControlCar Buy()
    {
        return new RemoteControlCar();
    }

    public string DistanceDisplay()
    {
        return $"Driven {Meters} meters";
    }

    public string BatteryDisplay()
    {
        return Battery.Equals(0) ? "Battery empty" : $"Battery at {Battery}%";
    }

    public void Drive()
    {
        if (Battery.Equals(0)) return;
        Meters += 20;
        Battery -= 1;
    }
}
