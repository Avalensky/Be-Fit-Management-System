/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author A.Valensky
 */
import java.util.Scanner;

public class BeFitSystem {

    private static Scanner scanner =
            new Scanner(System.in);

    private static EquipmentManager manager =
            new EquipmentManager();

    public static void main(String[] args) {

        manager.addSampleData();

        int option;

        do {

            System.out.println("\n=================================");
            System.out.println("      BeFit Management System");
            System.out.println("=================================");
            System.out.println("1. View Equipment");
            System.out.println("2. Add Equipment");
            System.out.println("3. Search Equipment");
            System.out.println("4. Sort Equipment By Price");
            System.out.println("5. Remove Equipment");
            System.out.println("6. Validate Character");
            System.out.println("7. Compare Shakes");
            System.out.println("8. Exit");
            System.out.println("=================================");

            System.out.print("Select Option: ");

            option =
                    Integer.parseInt(
                            scanner.nextLine());

            switch (option) {

                case 1:
                    manager.viewEquipment();
                    break;

                case 2:
                    addEquipment();
                    break;

                case 3:
                    searchEquipment();
                    break;

                case 4:
                    manager.sortByPrice();
                    break;

                case 5:
                    removeEquipment();
                    break;

                case 6:
                    validateCharacter();
                    break;

                case 7:
                    compareShakes();
                    break;

                case 8:
                    System.out.println(
                            "Thank you for using BeFit.");
                    break;

                default:
                    System.out.println(
                            "Invalid option selected.");
            }

        } while (option != 8);
    }

    private static void addEquipment() {

        System.out.print("Category: ");
        String category = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price =
                Double.parseDouble(
                        scanner.nextLine());

        manager.addEquipment(
                category,
                name,
                price);
    }

    private static void searchEquipment() {

        System.out.print(
                "Enter Equipment Name: ");

        String search =
                scanner.nextLine();

        manager.searchEquipment(search);
    }

    private static void removeEquipment() {

        System.out.print(
                "Enter Equipment Name To Remove: ");

        String name =
                scanner.nextLine();

        manager.removeEquipment(name);
    }

    private static void validateCharacter() {

        System.out.print(
                "Enter Character: ");

        char input =
                scanner.next().charAt(0);

        scanner.nextLine();

        CharacterValidator validator =
                new CharacterValidator(input);

        validator.validateCharacter();
    }

    private static void compareShakes() {

        System.out.print(
                "Enter First Shake: ");

        String shake1 =
                scanner.nextLine();

        System.out.print(
                "Enter Second Shake: ");

        String shake2 =
                scanner.nextLine();

        ShakeComparison comparison =
                new ShakeComparison(
                        shake1,
                        shake2);

        comparison.compareShakes();
    }
}

