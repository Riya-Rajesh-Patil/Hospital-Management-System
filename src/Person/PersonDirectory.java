/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author patil
 */
import java.util.ArrayList;

public class PersonDirectory {

    private ArrayList<Person> directory;

    public PersonDirectory() {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Person> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Person> directory) {
        this.directory = directory;
    }

    public Person addNewPerson(String usertype, String userID, String name, int age, String gender, String email, long phone, String username, String password, String state, String city, String community, String address, int experience, String specialisation, String hospital) {
        Person newPerson = new Person(usertype, userID, name, age, gender, email, phone, username, password, state, city, community, address, experience, specialisation, hospital);
        directory.add(newPerson);
        return newPerson;
    }

    public int size() {
        return this.directory.size();
    }

}
