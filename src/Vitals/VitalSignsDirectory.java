package Vitals;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author patil
 */
public class VitalSignsDirectory {

    private ArrayList<VitalSigns> vitaldirectory;

    public VitalSignsDirectory() {
        this.vitaldirectory = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalSignsdirectory() {
        return vitaldirectory;
    }

    public void setVitalSignsdirectory(ArrayList<VitalSigns> vitaldirectory) {
        this.vitaldirectory = vitaldirectory;
    }

    public VitalSigns addNewVitalSigns(int pulse, int heartRate, double bloodPressure, double temperature, Date date, String userName) {
        VitalSigns newVitalSign = new VitalSigns(pulse, heartRate, bloodPressure, temperature, date, userName);
        vitaldirectory.add(newVitalSign);
        return newVitalSign;
    }
}
