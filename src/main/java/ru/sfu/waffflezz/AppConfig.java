package ru.sfu.waffflezz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.sfu.waffflezz.dependences.Aquarium;
import ru.sfu.waffflezz.dependences.Cage;

/**
 * Конфигурационный файл Spring
 */
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

  /**
   * Bean для аквариума
   *
   * @return объект аквариума
   */
  @Bean()
  public Aquarium aquariumBean() {
    return new Aquarium();
  }

  /**
   * Bean для клетки через фабричный метод
   *
   * @return объект клетки
   */
  @Bean
  public Cage cageBean() {
    return Cage.cageFactory("elephant");
  }

  /**
   * Bean для зоопарка
   *
   * @return объект зоопарка
   */
  @Bean
  public Zoo zooBean() {
    return new Zoo(cageBean(), aquariumBean());
  }
}
