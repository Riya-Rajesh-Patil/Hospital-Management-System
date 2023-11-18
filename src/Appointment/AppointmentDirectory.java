/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Appointment;

import Doctor.Doctor;
import Person.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author patil
 */

public class AppointmentDirectory {

    private ArrayList<Appointment> appdirectory;

    public AppointmentDirectory() {
        this.appdirectory = new ArrayList<>();
    }

    public ArrayList<Appointment> getAppdirectory() {
        return appdirectory;
    }

    public void setDocdirectory(ArrayList<Appointment> appdirectory) {
        this.appdirectory = appdirectory;
    }

    public Appointment addNewAppointment(String D, String P, Date date) {
        Appointment newAppointment = new Appointment(D, P, date);
        appdirectory.add(newAppointment);
        return newAppointment;
    }
}
