package ro.fasttrackit.curs7.homework;

public class Person {
    private int age;
    private String name;
    private String isMarried;

    public Person(int age, String name, String isMarried) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String isMarried() {
        if(isMarried.equals("yes")) {
            return "is married";
        } else {
            return "is not married";
        }
    }
}
