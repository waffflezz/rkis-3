package ru.sfu.waffflezz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.sfu.waffflezz.dependences.AnimalEnclosure;

/**
 * Класс, представляющий зоопарк
 */
public class Zoo {

  /**
   * Клетка с животным
   */
  private final AnimalEnclosure animalCage;
  /**
   * Аквариум с рыбкой
   */
  private final AnimalEnclosure fishAquarium;

  /**
   * Конструктор с параметрами для инициализации зоопарка
   *
   * @param animalCage клетка
   * @param fishAquarium аквариум
   */
  public Zoo(@Qualifier("cageBean") AnimalEnclosure animalCage, @Qualifier("aquariumBean") AnimalEnclosure fishAquarium) {
    this.animalCage = animalCage;
    this.fishAquarium = fishAquarium;
  }

  /**
   * Получение информации о зоопарке
   */
  public void getZooInfo() {
    System.out.println("------------");
    System.out.println("Zoo has:\n" + animalCage.contain() + "\n" + fishAquarium.contain());
    System.out.println("------------");
  }

  /**
   * Init метод
   */
  @PostConstruct
  public void init() {
    System.out.println("Initialization bean Zoo");
  }

  /**
   * Destroy метод
   */
  @PreDestroy
  public void destroy() {
    System.out.println("Destruction bean Zoo");
  }

}
