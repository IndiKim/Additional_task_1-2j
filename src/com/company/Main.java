package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // доп.задание - 1
        Scanner myObj = new Scanner(System.in);
        System.out.println("Vvedite vashe imya!");

        String userName = myObj.nextLine();
        System.out.println("How are you: " + userName);

        // доп.задание - 2
        public static int generateRandomAge(){
            System.out.println("Mojno li idti gulyat");
            Random random = new Random();

            for (int i = 0; i < 15; i++) {
                System.out.println(random.nextInt(15) + 1);
            }
        }
    }
}


