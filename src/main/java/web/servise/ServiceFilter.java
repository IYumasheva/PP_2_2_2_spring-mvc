package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;

import java.util.List;

public class ServiceFilter {
    public static List<Car> getSomeCar(int n){
        if ( n >= 1 && n <= 5 ){
            return Car.get5Cars().subList(0,n);
        } else {
            return Car.get5Cars();
        }
    }
}
