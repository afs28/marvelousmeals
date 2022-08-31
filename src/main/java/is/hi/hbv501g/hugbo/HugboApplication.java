package is.hi.hbv501g.hugbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HugboApplication {

    public static void main(String[] args) {
        SpringApplication.run(HugboApplication.class, args);
    }

}
