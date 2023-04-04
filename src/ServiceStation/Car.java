package ServiceStation;

public class Car extends Bicycle implements CheckEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


}
