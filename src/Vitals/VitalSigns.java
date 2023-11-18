package Vitals;

import java.util.Date;

/**
 *
 * @author patil
 */
public class VitalSigns {

    private int pulse;
    private int heartRate;
    private double bloodPressure;
    private double temperature;
    private Date date;
    private String patientUserName;

    public String getPatientUserName() {
        return patientUserName;
    }

    public VitalSigns(int pulse, int heartRate, double bloodPressure, double temperature, Date date, String patientUserName) {
        this.pulse = pulse;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.date = date;
        this.patientUserName = patientUserName;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
