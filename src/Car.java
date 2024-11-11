public class CarTask {
    static class Car {
        private String make;
        private String model;
        private int currentSpeed = 0;

        public Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public int getCurrentSpeed() {
            return currentSpeed;
        }

        public void speedUp(int increment) {
            currentSpeed += increment;
        }

        public void brake() {
            if (currentSpeed <= 10) {
                currentSpeed = 0;
            } else {
                currentSpeed -= 10;
            }
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Volvo", "S60");
        System.out.println("Current speed: " + car.getCurrentSpeed());

        car.speedUp(25);
        System.out.println("Current speed after speeding up: " + car.getCurrentSpeed());

        car.brake();
        System.out.println("Current speed after brake: " + car.getCurrentSpeed());

        car.brake();
        System.out.println("Current speed after brake: " + car.getCurrentSpeed());

        car.brake();
        System.out.println("Current speed after brake: " + car.getCurrentSpeed());
    }
}