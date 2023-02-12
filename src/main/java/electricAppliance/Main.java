package electricAppliance;

import electricAppliance.abstracts.AbstractElectricAppliance;
import electricAppliance.impl.*;

import java.util.*;

/**
 * Домашние электроприборы. Определить иерархию электроприборов. Включить некоторые в розетку. Подсчитать потребляемую мощность.
 * Провести сортировку приборов в квартире на основе мощности. Найти прибор в квартире, соответствующий заданному диапазону параметров.
 * Не используйте доступ к базе данных и DAO.
 * <p>
 * Household electrical appliances. Determine the hierarchy of electrical appliances. Plug some in. Calculate the power consumption.
 * Carry out sorting of appliances in the apartment based on power. Find a device in the apartment that matches the specified range of parameters.
 * Do not use database access and DAO.
 */

public class Main {
    public static void main(String[] args) {
        List<AbstractElectricAppliance> al = new ArrayList<>();
        Computer computer = new Computer(250);
        DishWasher dishWasher = new DishWasher(2500);
        ElectricKettle kettle = new ElectricKettle(2000);
        ElectricStove stove = new ElectricStove(7000);
        Fridge fridge = new Fridge(300);
        Iron iron = new Iron(2000);
        TV tv = new TV(150);
        Washer washer = new Washer(1500);
        al.add(computer);
        al.add(dishWasher);
        al.add(kettle);
        al.add(stove);
        al.add(fridge);
        al.add(iron);
        al.add(tv);
        al.add(washer);

        System.out.println((char) 27 + "[34m" + "All electric appliances in the house:" + (char) 27 + "[38m");
        for (AbstractElectricAppliance temp : al)
            System.out.println(temp);

        System.out.println((char) 27 + "[34m" + "\nTurn on some appliances:" + (char) 27 + "[38m");
        fridge.setPowered(true);
        stove.setPowered(true);
        washer.setPowered(true);
        int sumPower = 0;
        for (AbstractElectricAppliance temp : al)
            if (temp.isPowered()) {
                System.out.println(temp);
                sumPower += temp.getPower();
            }
        System.out.println((char) 27 + "[34m" + "\nPower consumption: " + (char) 27 + "[38m" + sumPower);

        System.out.println((char) 27 + "[34m" + "\nSorted by power: " + (char) 27 + "[38m");
        al.sort(Comparator.comparingInt(AbstractElectricAppliance::getPower));
        for (AbstractElectricAppliance temp : al)
            System.out.println(temp);

        System.out.println((char) 27 + "[34m" + "\nElectrical appliances with a power of less than 2000 and more than 200 watts: " + (char) 27 + "[38m");
        for (AbstractElectricAppliance temp : al) {
            if (temp.getPower() > 200 && temp.getPower() < 2000) System.out.println(temp);
        }

    }
}
