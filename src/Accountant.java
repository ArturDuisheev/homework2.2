public class Accountant extends Employee implements Printable{
    public Accountant(String name, int age) {
        super(name, age);
    }


    @Override
    public void print() {
        System.out.println(getName() + " Работает с бумажками");
    }

}
