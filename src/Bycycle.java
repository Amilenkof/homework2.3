public class Bycycle extends Transport {

    public Bycycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Bycycle bycycle) {
        if (bycycle != null) {
            System.out.println("Обслуживаем " + bycycle.getModelName());
            for (int i = 0; i < bycycle.getWheelsCount(); i++) {
                bycycle.updateTyre();
            }
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}


