/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek7day1.exercice3;

/**
 *
 * @author ezekielkouassi
 */
public class Vehicule {

    private String model;
    private int speed;

    public Vehicule() {
        super();
    }

    public Vehicule(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return this.model;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
