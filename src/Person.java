import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public Person(String name, String surname, Integer age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setSurname(this.surname);
        if (this.hasAddress()) {
            childBuilder.setAddress(this.address);
        }
        childBuilder.setAge(0);
        return childBuilder;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surname;
    }

    public OptionalInt getAge() {
        return age != null ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age != null) {
            age++;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }
}
