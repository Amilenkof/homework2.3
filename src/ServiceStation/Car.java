package ServiceStation;

public class Car extends Transport implements UpdateTyre, CheckEngine {
    public Car(String modelName, int wheelsCount) {
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
    public void check() {
        if (this != null) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
        }else System.out.println("Проверьте правильность данных");
    }
}
