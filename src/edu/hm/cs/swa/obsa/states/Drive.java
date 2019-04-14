package edu.hm.cs.swa.obsa.states;

import edu.hm.cs.swa.obsa.ShiftingDevice;

public class Drive extends GearMode  {

    public Drive() {}

    @Override
    public void shiftToNextGearMode(ShiftingDevice context) {
        //TODO implement
        if(context.getState().getName().equals("N"))
            context.setState(this);
        else
            new Neutral().shiftToNextGearMode(context);
    }

    @Override
    public String getName() {
        return "D";
    }
}
