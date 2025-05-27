package com.example;

/**
 * Hello world!
 *
 */
public class App {
  public int add(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
    App app = new App();
    int result = app.add(2, 3);
    System.out.println("2+3=" + result);
  }
}
