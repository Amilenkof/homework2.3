
public class Car extends Transport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        if (this.car != null) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();


    }}

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

        public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }
}
