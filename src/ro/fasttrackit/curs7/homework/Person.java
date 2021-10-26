package ro.fasttrackit.curs7.homework;

public class Person {
    private int age;
    private String name;
    private boolean isMarried;

    public Person(int age, String name, boolean isMarried) {
        this.age = age;
        this.name = name;
        isMarried = false;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String isMarried() {
        if(isMarried == true) {
            return "is married";
        }else {
            return "is not married";
        }
    }
}
