package in.practise.Polymorphism.Challenge;

public class Calculator {
    public  void add() {
        System.out.println(3+3);
    }
    public void add(int a, int b){
        System.out.println( a+ b);
    }
    public void add(int a, int b,int c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add();
        calculator.add(2,2);
        calculator.add(2,3,4);

    }



}
