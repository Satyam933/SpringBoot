import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.satyam.Insane;

@Configuration
public class appConfig {
  @Bean
  public Insane insane() {
    return new Insane();
  }
}
