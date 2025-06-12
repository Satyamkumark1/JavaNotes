package in.practise.Polymorphism.Challenge2;

public class Vehicle {

    public  void service(){
        System.out.println("Your vehicle need service");

    }
    public  static class  Car extends Vehicle {
        public void service() {
           super.service();
            System.out.println("Your Car needs service.");
        }

    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.service();
    }

}
