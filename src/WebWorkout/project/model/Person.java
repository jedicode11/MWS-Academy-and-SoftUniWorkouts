package WebWorkout.project.model;

import WebWorkout.project.dao.Identifiable;

public class Person implements Identifiable<Long> {
    private static long nextId = 0;
    private Long id; // blank final
    private String firstName;
    private String lastName;
    private int age;



    public Person(Long id) {
        this.id = id;
    }

    public Person(Long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        if (getId() != null ? !getId().equals(person.getId()) : person.getId() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(person.getFirstName()) : person.getFirstName() != null)
            return false;
        return getLastName() != null ? getLastName().equals(person.getLastName()) : person.getLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }
    public String format(final String prefix) {
//        prefix = prefix.toUpperCase();
        return String.format("%s| %4d | %-12.12s | %-12.12s | %3d |",
                prefix, id, firstName, lastName, age);
    }

    public static void main(String[] args) {
        var p1 = new Person(1L, "Bill", "Morison", 35);
        var p2 = new Person(2L, "Micheal", "James", 28);
        System.out.println(p1.format("Person "));
        System.out.println(p2.format("Person "));
    }

}
