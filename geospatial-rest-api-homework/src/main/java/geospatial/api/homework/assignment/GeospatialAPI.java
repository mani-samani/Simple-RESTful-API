package geospatial.api.homework.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GeospatialAPI {
    public static void main(String[] args)
	{
        SpringApplication.run(GeospatialAPI.class, args);
    }
}
