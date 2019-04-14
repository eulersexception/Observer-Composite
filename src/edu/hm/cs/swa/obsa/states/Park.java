package edu.hm.cs.swa.obsa.states;

import edu.hm.cs.swa.obsa.ShiftingDevice;

public class Park extends GearMode {

    public Park() {}

    @Override
    public void shiftToNextGearMode(ShiftingDevice context) {
        //TODO implement
        if(context.getState().getName().equals("R"))
            context.setState(this);
        else
            new Reverse().shiftToNextGearMode(context);
    }

    @Override
    public String getName() {
        return "P";
    }
}
