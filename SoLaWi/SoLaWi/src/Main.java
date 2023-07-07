//TODO
// fuer mehrere vergleichbar machen
// fur Arrays implementieren

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Person person1 = new Person(0,"Lukas", "Knigge", LocalDate.of(1995, 5, 15));
        //Person person2 = new Person(1,"Alex", "Ho", LocalDate.of(1995, 5, 15));
        Person person1 = new Person(1, "John", "Doe", "JD", LocalDate.of(1990, 5, 15), Gender.MALE, "123 Main St", "john.doe@example.com", 1234567890);
        Person person2 = new Person(2, "Jane", "Smith", "JS", LocalDate.of(1995, 8, 20), Gender.FEMALE, "456 Elm St", "jane.smith@example.com", 987654321);
        System.out.println(person1.getFirstName());
        person2.compare(person1,person2);
        Person[] people = {person1, person2};
        //compareDate(people);
        HashMap<Integer, Person> peopleMap = new HashMap<Integer, Person>();

        PersonManager personManager = new PersonManager();

        personManager.addPerson(person1);
        personManager.addPerson(person2);
        personManager.getAllPersons();
        System.out.println(personManager.findPerson(person1.getId()));

        // PersonProcessor implementieren
        PersonProcessor personProcessor = person -> {
            System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
            System.out.println("E-Mail: " + person.getEmail());
            System.out.println();
        };
        // Alle Personen mit PersonProcessor verarbeiten
        personManager.processPersons(personProcessor);
    }
    /*private static Person[] compareDate(Person[] people){
        Arrays.sort(people);
        for (Person person : people) {
            System.out.println("Name: " + person.getFirstName() + ", Birthdate: " + person.getBirthDay());
        }
        return people;
    }*/
}