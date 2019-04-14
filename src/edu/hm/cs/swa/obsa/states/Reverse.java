package edu.hm.cs.swa.obsa.states;

import edu.hm.cs.swa.obsa.ShiftingDevice;

public class Reverse extends GearMode {

    public Reverse() {}

    @Override
    public void shiftToNextGearMode(ShiftingDevice context) {
        if(context.getState().getName().matches("P|N"))
            context.setState(this);
        else
            new Neutral().shiftToNextGearMode(context);
    }

    @Override
    public String getName() {
        return "R";
    }
}
