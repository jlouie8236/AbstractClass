import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(4));
        vehicles.add(new Plane(6));
        for (Vehicle v : vehicles)
        {
            System.out.println(v.move());
            System.out.println(v.getWheels());
        }
    }
}
