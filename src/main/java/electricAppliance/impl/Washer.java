package electricAppliance.impl;

import electricAppliance.abstracts.AbstractElectricAppliance;

public class Washer extends AbstractElectricAppliance {
    public Washer(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "Washer{" +
                "power=" + getPower() +
                ", isPowered=" + isPowered() +
                '}';
    }
}

