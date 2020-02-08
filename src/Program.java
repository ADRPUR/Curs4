public class Program {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Alexandru";
        alex.age = 20;
        alex.heght = 175;
        alex.age++;
        alex.energy = 10;

        System.out.println(alex.name + " are " + alex.age + " de ani.");

        alex.run();
        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.name + " are energia: " + alex.energy);
        alex.sleep();
        System.out.println(alex.name + " are energia: " + alex.energy);

        if (alex.ismajor()) {
            System.out.println(alex.name + " drinks beer.");
        }
        Dog lessie = new Dog();
        lessie.size = 20;
        lessie.bark();
    }
}
