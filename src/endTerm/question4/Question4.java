package endTerm.question4;

//Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON
// that stores Boolean values to indicate whether the appliance is ON or OFF.
// Design a menu driven program in java that puts ON/OFF the corresponding appliances
// and gives appropriate message. If the total power consumed is more than 2kW,
// show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600
// watts,
// Fan consumes 400 watts and light consumes 100 watt.
public class Question4 {
    private boolean AC_ON = false;
    private boolean HOME_THEATRE = false;
    private boolean FAN_ON = false;
    private boolean LIGHT_ON = false;
    private int powerConsumed = 0;

    public int calculateTotalPowerConsumed() {
        if (this.AC_ON) {
            powerConsumed = powerConsumed + 1200;
        }
        if (this.HOME_THEATRE) {
            powerConsumed = powerConsumed + 600;
        }
        if (this.FAN_ON) {
            powerConsumed = powerConsumed + 400;
        }
        if (this.LIGHT_ON) {
            powerConsumed = powerConsumed + 100;
        }
        return powerConsumed;
    }

    public void setAC_ON(boolean a) {
        this.AC_ON = a;
    }

    public void setHOME_THEATRE(boolean a) {
        this.HOME_THEATRE = a;
    }

    public void setFAN_ON(boolean a) {
        this.FAN_ON = a;
    }

    public void setLIGHT_ON(boolean a) {
        this.LIGHT_ON = a;
    }
}
