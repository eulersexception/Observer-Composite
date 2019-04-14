package edu.hm.cs.swa.obsa;

import edu.hm.cs.swa.obsa.observer.Subject;
import edu.hm.cs.swa.obsa.states.*;

public class ShiftingDevice extends Subject {

    private GearMode state;
    private SDButton driverIntent;

    public ShiftingDevice() {
        driverIntent = SDButton.PARK;
        state = new Park();
    }

    public GearMode getState() {
        return state;
    }

    public void setState(GearMode state) {
        //TODO implement
        this.state = state;
        notifyObservers();
    }

    public void changeGears(SDButton driverIntent) {
        //TODO implement
        this.driverIntent = driverIntent;
        while(!state.equals(driverIntent.gearMode)) {
            driverIntent.gearMode.shiftToNextGearMode(this);
        }
    }
}
