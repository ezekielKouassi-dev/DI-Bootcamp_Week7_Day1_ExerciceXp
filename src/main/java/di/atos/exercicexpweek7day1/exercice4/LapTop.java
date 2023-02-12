/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek7day1.exercice4;

/**
 *
 * @author ezekielkouassi
 */
public class LapTop extends Computer {

    private int batteryLife;

    //le constructeur
    public LapTop(String brand, int stockage, int batteryLife, String modele) {
        super(brand, modele, stockage);
        this.batteryLife = batteryLife;
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Battery life: " + batteryLife + " hours");
    }

    public void useTouchpad(String action) {
        System.out.println("Using touchpad to " + action);
    }
}
