package ServiceStation;

import ServiceStation.CheckEngine;
import ServiceStation.CheckTrailer;
import ServiceStation.UpdateTyre;
import ServiceStation.Transport;

public class Truck extends Transport implements UpdateTyre, CheckEngine, CheckTrailer {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        if (this != null) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
        }
    }
}
