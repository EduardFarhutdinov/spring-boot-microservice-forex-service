import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "app")
@EntityScan(basePackages = "app.model")
@EnableJpaRepositories(basePackages = {"app.repository"})
public class StartClass {
    public static void main(String[] args) {
        SpringApplication.run(StartClass.class,args);
    }
}
