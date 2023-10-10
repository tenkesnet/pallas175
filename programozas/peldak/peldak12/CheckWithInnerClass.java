import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
    public enum Gender { MALE, FEMALE };

    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("[name=%s, age=%d, gender=%s]", getName(), getAge(), getGender());
    }
}

interface CheckPerson {
    boolean test(Person p);
}

class Checker implements CheckPerson {
    public boolean test(Person p) {
        return p.getGender() == Person.Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25;
    }
}

// a Java 8-tól sok ilyen könyvtári eszköz is elérhető (nem tananyag)
class Checker2 implements Predicate<Person> {
    public boolean test(Person p) {
        return p.getGender() == Person.Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25;
    }
}

public class CheckWithInnerClass {
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> roster = Arrays.asList(
                new Person("Jane", 2, Person.Gender.FEMALE),
                new Person("John", 20, Person.Gender.MALE),
                new Person("Jill", 22, Person.Gender.FEMALE),
                new Person("Jack", 70, Person.Gender.MALE)
                );

        // metódus átadása: lokális osztályból készített példány
        printPersons(roster, new Checker());

        // metódus átadása: névtelen osztály
        printPersons(roster, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getGender() == Person.Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25;
            }
        });

        // metódus átadása: lambda-kifejezés
        printPersons(roster, p -> p.getGender() == Person.Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25);
    }
}
