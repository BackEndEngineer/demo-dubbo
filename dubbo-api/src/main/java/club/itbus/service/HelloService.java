package club.itbus.service;

import club.itbus.model.City;
import java.util.List;
/**
 * Desc:
 * Mail: hehaiyang@terminus.io
 * Date: 16/9/14
 */
public interface HelloService {

    String hello(String name);

    City findById(Long id);

    List<City> listCitys();
}
