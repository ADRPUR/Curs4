public class Person {
    private String name;
    private int age;
    private int heght;
    private int energy;

    public int getHeght() {
        return heght;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public Person(String name, int age, int heght, int energy) {
        this.name = name;
        this.age = age;
        this.heght = heght;
        this.energy = energy;
    }

    public void run() {
        energy--;
    }
    public void sleep() {
        energy+=12;
    }

    public boolean ismajor() {
        return age >= 18;
//        return age >= 18 ? true : false; // si asa se poate
//        if (age >=18) {
//            return true;
//        } else {
//            return false; // se poate si fara else
        }

    //    public String getName() {
//        return name;
//    }
//
    public int getAge() {
        return age;
    }
}
