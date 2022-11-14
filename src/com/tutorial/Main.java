package com.tutorial;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner userInputScanner = new Scanner(System.in);
    int row;
    System.out.print("1=Square, 2=Triangle, 3=MirrorTriangle, 4=Pyramid : ");
    int opt = userInputScanner.nextInt();
    switch (opt) {
      case 1:
        System.out.print("Masukan jumlah row untuk mencetak SQUARE : ");
        row = userInputScanner.nextInt();
        System.out.println("========== OUTPUT ==========");
        squarePattern(row);
        break;
      case 2:
        System.out.print("Masukan jumlah row untuk mencetak TRIANGLE : ");
        row = userInputScanner.nextInt();
        System.out.println("========== OUTPUT ==========");
        trianglePatter(row);
        break;
      case 3:
        System.out.print(
          "Masukan jumlah row untuk mencetak MIRROR TRIANGLE : "
        );
        row = userInputScanner.nextInt();
        System.out.println("========== OUTPUT ==========");
        triangleReversePattern(row);
        break;
      case 4:
        System.out.print("Masukan jumlah row untuk mencetak PYRAMID : ");
        row = userInputScanner.nextInt();
        System.out.println("========== OUTPUT ==========");
        pyramidPattern(row);
        break;
      default:
        System.out.println("Error");
        break;
    }
    System.out.print("- END PROGRAM -");
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

  //   OUTPUT
  // * * * * *
  // * * * * *
  // * * * * *
  // * * * * *
  // * * * * *

  static void trianglePatter(int row) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }

  // OUTPUT
  // *
  // * *
  // * * *
  // * * * *
  // * * * * *

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

  // OUTPUT
  // * * * * *
  // * * * *
  // * * *
  // * *
  // *

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
  // OUTPUT
  //     *
  //    * *
  //   * * *
  //  * * * *
  // * * * * *

}
