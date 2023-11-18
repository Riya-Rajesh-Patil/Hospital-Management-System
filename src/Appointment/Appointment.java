package Appointment;

import Doctor.Doctor;
import Person.Person;
import java.util.Date;

/**
 *
 * @author patil
 */
public class Appointment {

    String D;
    String P;
    Date date;

    public Appointment(String D, String P, Date date) {
        this.D = D;
        this.P = P;
        this.date = date;
    }

    public String getD() {
        return D;
    }

    public void setD(String D) {
        this.D = D;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getP() {
        return P;
    }

    public void setP(String P) {
        this.P = P;
    }

}
