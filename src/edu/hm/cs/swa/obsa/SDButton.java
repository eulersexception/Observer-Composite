package edu.hm.cs.swa.obsa;

import edu.hm.cs.swa.obsa.states.Drive;
import edu.hm.cs.swa.obsa.states.GearMode;
import edu.hm.cs.swa.obsa.states.Park;
import edu.hm.cs.swa.obsa.states.Reverse;

public enum SDButton {
    FORWARD(new Drive()), BACKWARD(new Reverse()), PARK(new Park());

    public GearMode gearMode;

    SDButton(GearMode corresponding) {
        gearMode = corresponding;
    }
}
