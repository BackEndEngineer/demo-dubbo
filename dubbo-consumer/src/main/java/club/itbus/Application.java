package club.itbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

/**
 * Desc:
 * Mail: hehaiyang@terminus.io
 * Date: 16/9/14
 */
@SpringBootApplication
public class Application{

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class, "classpath:dubbo-consumer.xml");
        app.setWebEnvironment(true);
        Set<Object> set = new HashSet<Object>();
        app.setSources(set);
        app.run(args);
    }

}