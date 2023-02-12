package electricAppliance.abstracts;

import electricAppliance.interfaces.Powerable;

public class AbstractElectricAppliance implements Powerable {
    private int power;
    private boolean isPowered = false;

    public AbstractElectricAppliance(int power) {
        this.power = power;
    }

    public AbstractElectricAppliance(int power, boolean isPowered) {
        this.power = power;
        this.isPowered = isPowered;
    }

    @Override
    public String toString() {
        return "AbstractElectricAppliance{" +
                "power=" + power +
                ", isPowered=" + isPowered +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean isPowered() {
        return isPowered;
    }

    @Override
    public void setPowered(boolean powered) {
        isPowered = powered;
    }
}
