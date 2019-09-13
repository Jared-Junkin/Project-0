
public class Person {
    private String myName;
    private int myAge;

    public Person(String name, int age) {
        this.myName = name;
        this.myAge = age;
    }

    public String getName() {

        return this.myName;
    }

    public int getAge() {
        return this.myAge;
    }

    public String toString() {
        return String.format("%s %d", this.getName(), this.getAge());
    }
}
