package com.mike;

import java.util.LinkedList;
import java.util.Scanner;

public class snakeManager {

    public static void main(String[] args) {
        LinkedList <Snake> snakeList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        while (true){
            printMenu();
            int task = Integer.parseInt(scan.nextLine());
            if (task == 1){
                addSnake(snakeList);
            } else if (task == 2 ){
               printSnakeList(snakeList);
            } else if (task == 3) {
                break;
            } else {
                printSnakeList(snakeList);
            }
        }
    }

    protected static void addSnake (LinkedList<Snake> snakeList){
        Scanner scan = new Scanner(System.in);
        boolean addSnake = true;
        String snake;
        int venom;
        while (addSnake){
            System.out.println("Enter the type of snake: ");
            snake = scan.nextLine();
            System.out.println("Enter the strength of venom (integer): ");
            venom = Integer.parseInt(scan.nextLine());
            Snake s = new Snake(snake,venom);
            snakeList.add(s);
            System.out.println("Another snake ?");
            char more = scan.nextLine().charAt(0);
            // Make Switch statement
            if ((more == 'n')|| (more == 'N')){
                addSnake = false;
            } else {
                printSnakeList(snakeList);
            }
        }
    }


    public static void printMenu(){
        System.out.println("Venom Identifier\n 1. Enter snake\n 2. Identify by Venom Strength\n 3. Quit \n");
    }



    public static void printSnakeList(LinkedList<Snake> snakes){
        snakes.forEach(System.out::println);
    }
}
