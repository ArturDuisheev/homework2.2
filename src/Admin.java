public class Admin extends Employee implements Printable{

        public Admin(String name, int age) {
                super(name, age);
        }

        @Override
        public void print() {
                System.out.println(getName() + " Работает с клиентами");
        }
}
