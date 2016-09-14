package club.itbus.controller;

import club.itbus.model.City;
import club.itbus.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Desc:
 * Mail: hehaiyang@terminus.io
 * Date: 16/9/14
 */
@Controller
@RequestMapping
public class SimpleController {

    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> index(HttpServletRequest request, HttpServletResponse response) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("message","hello");
        map.put("appName", "dubbo");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value = "name") String name, HttpServletRequest request, HttpServletResponse response) {
        return helloService.hello(name);
    }


    @ResponseBody
    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public City findById(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) {
        City city = helloService.findById(id);
        return city;
    }

}