package electricAppliance.impl;

import electricAppliance.abstracts.AbstractElectricAppliance;

public class Fridge extends AbstractElectricAppliance {
    public Fridge(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "power=" + getPower() +
                ", isPowered=" + isPowered() +
                '}';
    }
}

