package in.practise.Equals;

public class TestEqualsAndHash {
    public static void main(String[] args) {
        Person person = new Person("Satyam","19",20000);
        Person person1 = new Person("Sayam", "19", 20000);
        if (person1.equals(person)){
            System.out.println("equal");
        } else {
            System.out.println("not ");
        }

    }
}
