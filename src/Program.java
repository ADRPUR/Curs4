public class Program {
    public static void main(String[] args) {
        Person alex = new Person("Alexandru", 20, 175, 10);

        System.out.println(alex.getName() + " are " + alex.getAge() + " de ani.");

        alex.run();
        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.getName() + " are energia: " + alex.getEnergy());
        alex.sleep();
        System.out.println(alex.getName() + " are energia: " + alex.getEnergy());

        if (alex.ismajor()) {
            System.out.println(alex.getName() + " drinks beer.");
        }
        Dog lessie = new Dog();
        lessie.size = 20;
        lessie.bark(5);
    }
}
