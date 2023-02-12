package electricAppliance.impl;

import electricAppliance.abstracts.AbstractElectricAppliance;

public class DishWasher extends AbstractElectricAppliance {
    public DishWasher(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "DishWasher" +
                "power=" + getPower() +
                ", isPowered=" + isPowered() +
                '}';
    }
}

