package web.servise;

import web.model.Car;
import java.util.List;

public class ServiceFilter {
    public static List<Car> getSomeCar(Integer n){
        if ( n!=null && n >= 1 && n <= 5 ){
            return Car.get5Cars().subList(0,n);
        } else {
            return Car.get5Cars();
        }
    }
}
