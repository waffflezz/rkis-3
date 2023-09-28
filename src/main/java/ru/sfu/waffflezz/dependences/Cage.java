package ru.sfu.waffflezz.dependences;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Класс, представляющий клетку с животным
 */
public class Cage implements AnimalEnclosure {

  /**
   * Название животного в клетке
   */
  private String animalName;

  /**
   * Конструктор класса с аргументами
   *
   * @param animalName название животного
   */
  public Cage(String animalName) {
    this.animalName = animalName;
  }

  /**
   * Конструктор без параметров с аргументами по умолчанию
   */
  public Cage() {
    this.animalName = "NoName";
  }

  public static Cage cageFactory(String animalName) {
    System.out.println("--Cage created via factory--");
    return new Cage(animalName);
  }

  /**
   * Сеттер для имени животного в клетке
   *
   * @param animalName имя животного в клетки
   */
  public void setAnimalName(String animalName) {
    this.animalName = animalName;
  }

  /**
   * Метод для просмотра содержания клетки
   */
  @Override
  public String contain() {
    return "Cage contain: " + animalName;
  }

  /**
   * Init метод
   */
  @PostConstruct
  public void init() {
    System.out.println("Initialization bean Cage");
  }

  /**
   * Destroy метод
   */
  @PreDestroy
  public void destroy() {
    System.out.println("Destruction bean Cage");
  }
}
