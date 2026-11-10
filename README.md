# BeFit Management System

A Java-based console application designed to handle fitness assessments, manage gym equipment inventories, validate character entries, and compare nutritional shakes.

## 📋 Features

Based on the interactive CLI menu, the application provides the following management tools:
1. **View Equipment** – List all currently stored fitness and gym equipment.
2. **Add Equipment** – Register new gear into the system inventory.
3. **Search Equipment** – Look up specific equipment by attributes.
4. **Sort Equipment By Price** – Organize items systematically to check budget or premium options.
5. **Remove Equipment** – Delete outdated or broken equipment from the database.
6. **Validate Character** – Ensure safe input parameters and text handling.
7. **Compare Shakes** – Parse and compare two distinct nutritional shake formulas side by side.

## 🛠️ Project Structure

The codebase is organized within a clean, single-package architecture:
*   `BeFitSystem.java` - The main driver class containing the program loop and user interface menus.
*   `CharacterValidator.java` - Utility file handling text validation and sanitization.
*   `Equipment.java` - Object model blueprint representing individual pieces of gym gear.
*   `EquipmentManager.java` - Core controller class handling CRUD operations for the inventory.
*   `ShakeComparison.java` - Logic module responsible for evaluating different ingredients or protein shake products.

## 🚀 Getting Started

### Prerequisites
*   Java Development Kit (JDK) 8 or higher
*   An IDE such as NetBeans (recommended), Eclipse, or IntelliJ IDEA

### Installation & Execution
1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com
   ```
2. Open the project folder inside **NetBeans IDE**.
3. Locate `BeFitSystem.java`, right-click the file, and select **Run File** (or press `Shift + F6`).

## 🖥️ Usage Example

When you run the system, you will see a command-line interface like the following:

```text
========================================
         BeFit Management System        
========================================
1. View Equipment
2. Add Equipment
3. Search Equipment
4. Sort Equipment By Price
5. Remove Equipment
6. Validate Character
7. Compare Shakes
8. Exit
========================================
Select Option: 7
Enter First Shake: Apple
Enter Second Shake: Banana
The two shakes are different products.
```
Developer: Ashwin Valensky
