package data_array;

// classDataArray.java
// data items as class objects
// to run this program: C>java ClassDataApp
////////////////////////////////////////////////////////////////
class Person {

    private String lastName;
    private String firstName;
    private int age;
//--------------------------------------------------------------

    public Person(String last, String first, int a) {                               // constructor
        lastName = last;
        firstName = first;
        age = a;
    }
//--------------------------------------------------------------

    public void displayPerson() {
        System.out.print("   Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }
//--------------------------------------------------------------

    public String getLast() // get last name
    {
        return lastName;
    }
}
