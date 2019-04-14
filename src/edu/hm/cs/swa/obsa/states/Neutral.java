package edu.hm.cs.swa.obsa.states;

import edu.hm.cs.swa.obsa.ShiftingDevice;

public class Neutral extends GearMode {

    public Neutral() {}

    @Override
    public void shiftToNextGearMode(ShiftingDevice context) {
        if(context.getState().getName().matches("D|R"))
            context.setState(this);
        else
            new Reverse().shiftToNextGearMode(context);
    }

    @Override
    public String getName() {
        return "N";
    }
}
