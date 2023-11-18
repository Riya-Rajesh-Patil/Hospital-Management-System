/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

/**
 *
 * @author patil
 */
import java.util.ArrayList;

public class DoctorDirectory {

    private ArrayList<Doctor> docdirectory;

    public DoctorDirectory() {
        this.docdirectory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDocdirectory() {
        return docdirectory;
    }

    public void setDocdirectory(ArrayList<Doctor> docdirectory) {
        this.docdirectory = docdirectory;
    }

    public Doctor addNewDoctor(String usertype, String userID, String name, int age, String gender, String email, long phone, String username, String password, String state, String city, String community, String address, int experience, String specialisation, String hospital) {
        Doctor newDoctor = new Doctor(usertype, userID, name, age, gender, email, phone, username, password, state, city, community, address, experience, specialisation, hospital);
        docdirectory.add(newDoctor);
        return newDoctor;
    }
}
