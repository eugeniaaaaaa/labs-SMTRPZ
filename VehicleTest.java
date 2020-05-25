import com.company.exceptions.OverFillException;
import com.company.exceptions.PassangerNotFountException;
import com.company.passanger.FireFighter;
import com.company.passanger.Human;
import com.company.passanger.Policeman;
import com.company.vehicle.Bus;
import com.company.vehicle.FireFighterCar;
import com.company.vehicle.PoliceCar;
import com.company.vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    public void test_fillVehicleByDifferentPassangersAndCountPassanges_returns_three_places_is_occupeted() throws OverFillException {
        int expectedCountOfPassangers = 3;
        Vehicle<Human> vehicle = new Vehicle<>("v6", 4, 4, 54.2, 3000,"Some Vehicle","Vehicle");
        Policeman policeman = new Policeman("Henry", "Tomasino", 23, "Officer", "Glock-18", "Main Officer");
        FireFighter fireFighter = new FireFighter("Tom", "Mitchell", 25, "Recruit", 2);
        Human human = new Human("Josh", "Kenedy", 23);
        vehicle.addPassanger(policeman);
        vehicle.addPassanger(fireFighter);
        vehicle.addPassanger(human);
        int result = vehicle.getCountOfOccupiedPlaces();
        Assertions.assertEquals(expectedCountOfPassangers, result);
    }
    @Test
    public void test_overfillPassangersInBus_throws_overfill_exception() throws OverFillException {
        Bus<Human> vehicle = new Bus<>("v6", 4, 3, 54.2, 3000,"Mercedes","T1");
        Policeman policeman = new Policeman("Henry", "Tomasino", 23, "Officer", "Glock-18", "Main Officer");
        FireFighter fireFighter = new FireFighter("Tom", "Mitchell", 25, "Recruit", 2);
        Human human = new Human("Josh", "Kenedy", 23);
        Policeman policeman1 = new Policeman("Ken", "Tomasino", 23, "Officer", "Glock-18", "Main Officer");
        Exception exception = Assertions.assertThrows(OverFillException.class,() -> {
            vehicle.addPassanger(policeman);
            vehicle.addPassanger(fireFighter);
            vehicle.addPassanger(human);
            vehicle.addPassanger(policeman1);
        });
        String expectedMessage = "Количество людей в машине не позволяет посадить ещё одного человека";
        String result = exception.getMessage();
        Assertions.assertEquals(expectedMessage,result);
    }
    @Test
    public void test_removeNotExistingPassangerInPoliceCar_throws_PassangerNotFoundException() throws OverFillException {
        PoliceCar<Policeman> policeCar = new PoliceCar<>("v8",4,3,80,2500,"Ford","Raptor");
        Policeman policeman1= new Policeman("Henry", "Tomasino", 23, "Officer", "M4A1", "Main Officer");
        Policeman policeman2 = new Policeman("Tomas","Scalleto",30,"Recruite","Glock-18", "Recruite");
        Policeman policeman3 = new Policeman("Ken", "Tomasino", 23, "Officer", "M4A1", "Sheriff");
        policeCar.addPassanger(policeman1);
        policeCar.addPassanger(policeman2);
        policeCar.addPassanger(policeman3);
        Policeman notExistsPoliceman = new Policeman("Hello","World",1000,"Non","Non","Non");
        Exception exception = Assertions.assertThrows(PassangerNotFountException.class,() -> {
            policeCar.removePassanger(notExistsPoliceman);
        });
        String expectedMessage = "Пасажира с именем : " + notExistsPoliceman.getName()  + " " + notExistsPoliceman.getSurname() + " не найдено.";
        String result = exception.getMessage();
        Assertions.assertEquals(expectedMessage,result);
    }
    @Test
    public void test_fillFireFighterCarByPassangers_return_full_fill_car() throws OverFillException {
        FireFighterCar<FireFighter> fireFighterCar = new FireFighterCar<>("v8",4,4,80,2500,"Ford","Raptor");
        fireFighterCar.addPassanger(new FireFighter("John","Henry",23,"Officer",3));
        fireFighterCar.addPassanger(new FireFighter("John","Wraslav",33,"Officer",3));
        fireFighterCar.addPassanger(new FireFighter("Tom","Pitersom",52,"Officer",3));
        fireFighterCar.addPassanger(new FireFighter("Jhosh","Visputchi",18,"Recruite",3));
        int expected = 4;
        int result = fireFighterCar.getCountOfOccupiedPlaces();
        Assertions.assertEquals(expected,result);

    }
}
