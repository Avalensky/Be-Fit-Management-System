/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author A.Valensky
 */
public class ShakeComparison {

    private String shake1;
    private String shake2;

    public ShakeComparison(
            String shake1,
            String shake2) {

        this.shake1 = shake1;
        this.shake2 = shake2;
    }

    public String getShake1() {
        return shake1;
    }

    public String getShake2() {
        return shake2;
    }

    public void setShake1(String shake1) {
        this.shake1 = shake1;
    }

    public void setShake2(String shake2) {
        this.shake2 = shake2;
    }

    public void compareShakes() {

        if (shake1.equalsIgnoreCase(shake2)) {

            System.out.println(
                    "The two shakes are considered the same product.");

        } else {

            System.out.println(
                    "The two shakes are different products.");
        }
    }
}

