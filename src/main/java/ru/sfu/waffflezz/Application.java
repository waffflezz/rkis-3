package ru.sfu.waffflezz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Класс с точкой входа в программу
 */
public class Application {

  /**
   * Метод точки входа в программу
   *
   * @param args аргумента командной строки
   */
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        AppConfig.class
    );

    Zoo zoo = context.getBean("zooBean", Zoo.class);
    zoo.getZooInfo();
    context.close();
  }
}
