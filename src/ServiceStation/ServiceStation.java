package ServiceStation;

public class ServiceStation {
    public void check(Bicycle bicycle) {
        if (this!= null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }else System.out.println("Проверьте правильность данных");
    }
    public void check(Car car) {
        if (this != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }else System.out.println("Проверьте правильность данных");
    }
    public void check(Truck truck) {
        if (this != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
    }

