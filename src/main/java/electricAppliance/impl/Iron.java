package electricAppliance.impl;

import electricAppliance.abstracts.AbstractElectricAppliance;

public class Iron extends AbstractElectricAppliance {
    public Iron(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "Iron{" +
                "power=" + getPower() +
                ", isPowered=" + isPowered() +
                '}';
    }
}

