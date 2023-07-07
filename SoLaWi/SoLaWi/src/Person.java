//TODO make sure that 2 compared people have a solution for the same date of birth
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

enum Gender {MALE, FEMALE}

public class Person implements Comparable<Person> {
    private int id;
    private String firstName;
    private String lastName;
    private String nickName;
    private LocalDate birthDay;
    private Gender gender;
    private String address;
    private String email;
    private int number;

    public Person(int id, String firstName, String lastName, String nickName, LocalDate birthDay, Gender gender,
                  String address, String email, int number) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.number = number;
    }

    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //zum erstellen von constructoren einfach alt + einfugen
    public Person(int id, String firstName, String lastName, LocalDate birthDay) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void call() {
        System.out.println(this.firstName +","+ this.lastName);
    }

    @Override
    public void compare(Person person1, Person person2) {
        System.out.println((person1.getBirthDay().isBefore(person2.getBirthDay())) ? person1.getFirstName()+" is older" : person2.getFirstName()+" is older");
    }

    @Override
    public boolean equals(Object obj) {
        return ((Person) obj).getFirstName().equals(getFirstName());
    }

    //@Override
    public int compareTo(Person person) {
        return this.getBirthDay().compareTo(person.getBirthDay());
    }

    /*
    @Override
    public void personArraySort() {
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person person1, Person person2){
                return person1.getBirthDay().compareTo(person2.getBirthDay());
            }
        });
        assertEquals(people, employeesSortedByDateAsc);
    }*/
}
