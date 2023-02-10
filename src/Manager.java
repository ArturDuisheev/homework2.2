public class Manager extends Employee implements Printable {
    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println(getName() + " Договаривается с клиентами");
    }
}
