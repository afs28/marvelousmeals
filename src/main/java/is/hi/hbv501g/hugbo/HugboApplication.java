package is.hi.hbv501g.hugbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

    // this is team member Birgitta Ýr Eyþórsdóttir (bye1@hi.is)
    // this is team member Heba Sólveig Heimisdóttir (hsh58@hi.is)
    // this is team member Hrefna Karen Valgarðsdóttir (hkv5@hi.is)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HugboApplication {

    public static void main(String[] args) {
        SpringApplication.run(HugboApplication.class, args);
    }

}
