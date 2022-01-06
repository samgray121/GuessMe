package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer;
        int guess;
        int randomNum;



        Random rGen = new Random();
        answer = rGen.nextInt(20)+1;



        while (true) {
            System.out.println("Enter a guess between 1 and 20");
            guess = sc.nextInt();

            if (guess == answer) {
                System.out.println("Wow, nice guess! That was it!");
                break;
            }

                if (guess < answer) {
                    System.out.println("Ha, nice try - too low!");
                    continue;
                }
                    if (guess > answer) {
                        System.out.println("To bad, way to high. I chose # " + answer.);
                        break;
                    }
                }


                }
            }


