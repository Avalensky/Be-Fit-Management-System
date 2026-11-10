/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AshwinV
 */
import java.util.ArrayList;

public class EquipmentManager {

    private ArrayList<Equipment> equipmentList;

    public EquipmentManager() {
        equipmentList = new ArrayList<>();
    }

    public void addEquipment(
            String category,
            String name,
            double price) {

        equipmentList.add(
                new Equipment(
                        category,
                        name,
                        price));

        System.out.println(
                "Equipment added successfully.");
    }

    public void viewEquipment() {

        if (equipmentList.isEmpty()) {

            System.out.println(
                    "No equipment available.");

            return;
        }

        System.out.println("\n===== Equipment List =====");

        for (Equipment equipment : equipmentList) {
            equipment.displayDetails();
        }
    }

    public void searchEquipment(
            String searchName) {

        boolean found = false;

        for (Equipment equipment : equipmentList) {

            if (equipment.getName()
                    .equalsIgnoreCase(searchName)) {

                equipment.displayDetails();
                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "Equipment not found.");
        }
    }

    public void sortByPrice() {

        for (int i = 0;
             i < equipmentList.size() - 1;
             i++) {

            for (int j = 0;
                 j < equipmentList.size() - i - 1;
                 j++) {

                if (equipmentList.get(j).getPrice()
                        >
                    equipmentList.get(j + 1).getPrice()) {

                    Equipment temp =
                            equipmentList.get(j);

                    equipmentList.set(
                            j,
                            equipmentList.get(j + 1));

                    equipmentList.set(
                            j + 1,
                            temp);
                }
            }
        }

        System.out.println(
                "Equipment sorted successfully.");
    }

    public void removeEquipment(
            String equipmentName) {

        boolean found = false;

        for (int i = 0;
             i < equipmentList.size();
             i++) {

            if (equipmentList.get(i)
                    .getName()
                    .equalsIgnoreCase(equipmentName)) {

                equipmentList.remove(i);

                System.out.println(
                        "Equipment removed successfully.");

                found = true;
                break;
            }
        }

        if (!found) {

            System.out.println(
                    "Equipment not found.");
        }
    }

    public void addSampleData() {

        addEquipment(
                "Cardio",
                "Treadmill",
                8500);

        addEquipment(
                "Strength",
                "Dumbbells",
                1500);

        addEquipment(
                "Flexibility",
                "Yoga Mat",
                500);

        addEquipment(
                "Endurance",
                "Exercise Bike",
                7200);
    }
}
