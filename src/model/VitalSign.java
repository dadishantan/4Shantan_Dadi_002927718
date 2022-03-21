
/**
 *
 * @author dadis
 */
package model;
public class VitalSign {
    private double Systole;
    private double Diastole;
    private double HeartRate;
    private double SPO2;

    public double getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(double HeartRate) {
        this.HeartRate = HeartRate;
    }

    public double getSPO2() {
        return SPO2;
    }

    public void setSPO2(double SPO2) {
        this.SPO2 = SPO2;
    }
    

    public double getSystole() {
        return Systole;
    }

    public void setSystole(double Systole) {
        this.Systole = Systole;
    }

    public double getDiastole() {
        return Diastole;
    }

    public void setDiastole(double Diastole) {
        this.Diastole = Diastole;
    }
    
    
}
