package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"config", "dao", "controller"})
@EntityScan(basePackages = {"entity"})
public class BandCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BandCommunityApplication.class, args);
    }

}