package ServiceStation;

import ServiceStation.CheckEngine;
import ServiceStation.CheckTrailer;
import ServiceStation.UpdateTyre;
import ServiceStation.Transport;

public class Truck extends Car implements CheckTrailer {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
