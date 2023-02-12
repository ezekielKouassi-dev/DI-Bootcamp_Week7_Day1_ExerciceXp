/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek7day1.exercice4;

/**
 *
 * @author ezekielkouassi
 */
public class SmartPhone extends Computer {

    //les proprietes
    private String operatingSystem;

    //le constructeur
    public SmartPhone(String brand, int stockage, String modele, String operatingSystem) {
        super(brand, modele, stockage);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Operating System: " + operatingSystem);
    }

    public void makeCall(String phoneNumber) {
        String brand = null;
        System.out.println("Calling " + phoneNumber + " using " + brand + " smartphone");
    }
}
