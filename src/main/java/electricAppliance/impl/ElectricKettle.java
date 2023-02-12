package electricAppliance.impl;

import electricAppliance.abstracts.AbstractElectricAppliance;

public class ElectricKettle extends AbstractElectricAppliance {
    public ElectricKettle(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "ElectricKettle{" +
                "power=" + getPower() +
                ", isPowered=" + isPowered() +
                '}';
    }
}

