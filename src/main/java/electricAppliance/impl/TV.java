package electricAppliance.impl;

import electricAppliance.abstracts.AbstractElectricAppliance;

public class TV extends AbstractElectricAppliance {
    public TV(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "TV{" +
                "power=" + getPower() +
                ", isPowered=" + isPowered() +
                '}';
    }
}

