package OOPs.Classes.Principles.Encapsulation;

public class Encapsulation {
    private String name; // instance variable (hiding the data from the outside world)

    Encapsulation() {
        this.name = "Salman Khan";
    }

    private void display(String name) {
        System.out.println("We are inside the Encapsulation Class and it's accessed by " + name);
    }

    public String getName() {
        return name;
    }
}
class A extends Encapsulation {
    private String gender;
    A() {
        super();
        this.gender = "Male";
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getName() + " " + a.getGender());
    }
}
