package in.practise.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        TwoWheeler twoWheeler = new TwoWheeler();
        vehicle.commute();
        System.out.println(twoWheeler.numberOfTyres);
    }
}
