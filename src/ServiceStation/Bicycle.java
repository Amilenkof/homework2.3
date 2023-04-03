package ServiceStation;

public class Bicycle extends Transport implements UpdateTyre {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        if (this!= null) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
        }else System.out.println("Проверьте правильность данных");
    }
}
