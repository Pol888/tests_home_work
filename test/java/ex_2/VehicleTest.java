package ex_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class VehicleTest{
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp(){
        car = new Car("honda", "civic", 1988);
        motorcycle = new Motorcycle("honda", "zr5", 2003);
    }

    @Test
    void checkingWhetherCarBelongsToVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
        }

    @Test
    void checkingWheelsInCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void checkingWheelsInMotorcycle() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }


    @Test
    void speedTestInTestModeToCar() {
        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
}

    @Test
    void speedTestInTestModeToMotorcycle() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void speedTestStopToCar() {
        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void speedTestStopToMotorcycle() {
        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }



}


