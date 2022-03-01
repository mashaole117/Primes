package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Primes {

  public static void main(String[] args) {

    int n;
    int num_primes = 0;
    boolean is_prime = true;

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the upper limit for primes: ");
    n = in.nextInt();

    for (int i = 2; i <= n; i++) {
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0 && i != 2) {
          is_prime = false;
        }
      }
      if (is_prime) {
        num_primes++;
      }
      is_prime = true;
    }

    System.out.println("Number of primes: " + num_primes);
  }

}
