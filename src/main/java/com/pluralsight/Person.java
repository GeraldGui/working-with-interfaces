package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int last = this.lastName.compareTo(o.lastName);
        return last == 0 ? this.firstName.compareTo(o.firstName) : last;

        /*if (this.age > o.age) {
            return 1;
        } else if(this.age < o.age) {
            return -1;
        } else {
            return 0;
        }*/
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
