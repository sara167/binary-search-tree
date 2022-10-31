package a4;

import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int choice;
        BST t = new BST();
        do {
            System.out.println("Enter ");
            System.out.println("1: Add new user");
            System.out.println("2: Delete a user");
            System.out.println("3: Count number of friends");
            System.out.println("4: Display all users");
            System.out.println("5: Print the friends of a given user");
            System.out.println("6: Add a friend to all the users");
            System.out.println("7: Exit");
            choice = read.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the name : ");
                    String name = read.next();
                    System.out.print("Enter the ID : ");
                    int ID = read.nextInt();
                    t.insert(name, ID);
                    break;
                case 2:
                    System.out.print("Enter the ID of the user: ");
                    t.deleteNode(read.nextInt());
                    break;
                case 3:
                    System.out.print("Enter the ID of the user: ");
                    System.out.println("The number of friends is " + t.countFriends(read.nextInt()));
                    break;
                case 4:
                    t.inOrder();
                    break;
                case 5:
                    System.out.print("Enter the ID of the user: ");
                    t.printFriends(read.nextInt());
                    break;
                case 6:
                    System.out.print("Enter the name of the friend: ");
                    t.everyoneFriend(read.next());
                    break;
                case 7:
                    System.out.println("The program terminates ");
                    break;
                default:
                    System.out.println("Unknow option");

            }
        } while (choice != 7);
    }

}
