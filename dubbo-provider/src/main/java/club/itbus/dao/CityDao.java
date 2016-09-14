package club.itbus.dao;

import club.itbus.model.City;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Desc:
 * Mail: hehaiyang@terminus.io
 * Date: 16/9/14
 */
@Component
public class CityDao extends MyBatisDao<City> {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public City selectCityById(Long id) {
        return this.sqlSessionTemplate.selectOne(sqlId("selectCityById"), id);
    }

}