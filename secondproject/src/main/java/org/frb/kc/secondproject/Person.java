package org.frb.kc.secondproject;

//FQN: org.frb.kc.secondproject.Person

public class Person {
    private String firstName;
    private String lastName;

    // There is a constructor you do not see
    // it's called the default no args constructor
    public Person(String fn, String ln) {   //constructor
        // check that fn and ln are not blank.
        this.firstName = fn;
        this.lastName = ln;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }
    public void setLastName(String ln) {
        lastName = ln;
    }
    // entry point
    // java -cp target org.frb.kc.secondproject.Person
    // javac -d target Person.java
    public static void main(String[] args) {
        System.out.println("Why, hello there");
        //instantiation
        //Person roger = new Person("Roger", "Noah");
        //Person bill = new Person("Bill", "Brasky");
        Person roger = new Person();
        roger.setFirstName("Roger");
        roger.setLastName("Noah");

    }
}
// video is 2:10