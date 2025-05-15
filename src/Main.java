class Human {

    public void eat() {
        System.out.println("Me hungry...");
    }
}

class Caveman extends Human {

    public void eat() {
        System.out.println("Me hunt lion and eat!");
    }
}

class ModernPerson extends Human {

    public void eat() {
        System.out.println("Me going to McDonalds and eat!");
    }
}

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        Caveman c = new Caveman();
        c.eat();
        ModernPerson m = new ModernPerson();
        m.eat();
    }
}