package edu.hm.cs.swa.obsa.states;

import edu.hm.cs.swa.obsa.ShiftingDevice;

public abstract class GearMode {

    public abstract void shiftToNextGearMode(ShiftingDevice context);

    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}
