/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author A.Valensky
 */

public class CharacterValidator {

    private char input;

    public CharacterValidator(char input) {
        this.input = input;
    }

    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }

    public void validateCharacter() {

        if (Character.isLetter(input)) {

            System.out.println(
                    "Valid input: It's a letter.");

        } else if (Character.isDigit(input)) {

            System.out.println(
                    "Valid input: It's a digit.");

        } else {

            System.out.println(
                    "Invalid input: The character is neither a letter nor a digit.");
        }
    }
}



