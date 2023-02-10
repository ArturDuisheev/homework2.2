public class Employee {
    private String name;

    private int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + ", Возраст: " + this.age);
        System.out.println("===============================");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
