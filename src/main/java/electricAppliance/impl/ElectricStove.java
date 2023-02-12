package electricAppliance.impl;

import electricAppliance.abstracts.AbstractElectricAppliance;

public class ElectricStove extends AbstractElectricAppliance {
    public ElectricStove(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "ElectricStove{" +
                "power=" + getPower() +
                ", isPowered=" + isPowered() +
                '}';
    }
}

