abstract public class Vehicle
{
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    abstract public String move();

    public int getWheels()
    {
        return wheels;
    }
}
