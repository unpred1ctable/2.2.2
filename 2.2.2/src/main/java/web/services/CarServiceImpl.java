package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> carsList(int count) {
        if (count > 5) {
            return carDao.getCars();
        } else {
            return carDao.getFewCars(count);
        }
    }

    @Override
    public List<Car> carsList() {
        return carDao.getCars();
    }


}
