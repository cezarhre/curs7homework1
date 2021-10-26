package ro.fasttrackit.curs7.homework;

public class PersonMain {
    public static void main(String[] args) {
        Person P1 = new Person(24,"Ionel", true);
        Person P2 = new Person(35,"Maria",true);
        Person P3 = new Person(12,"Dan",false);

        System.out.println(P1.getName() + " has " + P1.getAge() + " years old and " + P1.isMarried());
        System.out.println(P2.getName() + " has " + P2.getAge() + " years old and " + P2.isMarried());
        System.out.println(P3.getName() + " has " + P3.getAge() + " years old and " + P3.isMarried());

    }
}
