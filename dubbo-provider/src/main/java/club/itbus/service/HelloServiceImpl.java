package club.itbus.service;

import club.itbus.dao.CityDao;
import club.itbus.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Mail: hehaiyang@terminus.io
 * Date: 16/9/14
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    public CityDao cityDao;

    @Override
    public String hello(String name) {
        return "hello: " + name;
    }

    @Override
    public City findById(Long id) {
        return cityDao.selectCityById(id);
    }

    @Override
    public List<City> listCitys() {
        List<City> citys = new ArrayList<City>();
        for(int i= 0;i<5;i++){
            City city = new City();
            city.setId(Long.valueOf(i));
            city.setName("name" + String.valueOf(i));
            citys.add(city);
        }
        return citys;
    }

}
