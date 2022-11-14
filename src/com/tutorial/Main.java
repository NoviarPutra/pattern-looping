package com.tutorial;

public class Main {

  public static void main(String[] args) {
    squarePattern(5);
    trianglePatter(5);
    triangleReversePattern(5);
    pyramidPattern(5);
  }

  static void squarePattern(int row) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  static void trianglePatter(int row) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  static void triangleReversePattern(int row) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print("* ");
        if ((i + j) == 4) break;
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  static void pyramidPattern(int row) {
    for (int i = 0; i < row; i++) {
      for (int j = row - i; j > 1; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
