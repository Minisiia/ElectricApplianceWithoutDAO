package electricAppliance.impl;

import electricAppliance.abstracts.AbstractElectricAppliance;

public class Computer extends AbstractElectricAppliance {
    public Computer(int power) {
        super(power);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "power=" + getPower() +
                ", isPowered=" + isPowered() +
                '}';
    }
}

