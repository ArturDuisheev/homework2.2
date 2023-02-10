public class Programmer extends Employee implements Printable {
    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println(getName() + " Исправляет баги");
    }
}
