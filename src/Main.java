import java.awt.image.PackedColorModel;

public class Main {

    public static void main(String [] args){


    Printable[] printable = {
            createObject("Менеджер"),
            createObject("Программист"),
            createObject("Бухгалетер"),
            createObject("Администратор"),
    };
    for (int i = 0; i < printable.length; i++) {
        printable[i].print();
    }


    }
    public static Printable createObject(String className) {
        switch (className) {
            case "Бухгалетер":
                Accountant accountant = new Accountant("Бухгалетер", 20);
                return accountant;
            case "Администратор":
                Admin admin = new Admin("Администратор", 30);
                return admin;
            case "Менеджер":
                Manager manager = new Manager("Менеджер", 40);
                return manager;
            case "Программист":
                Programmer programmer = new Programmer("Программист", 50);
                return programmer;


        }


        return null;

    }
}
