/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;

/**
 *
 * @author ADMIN
 */
public class PartTimeEmployee extends Employee {

    private int hoursPerWeek;

    public PartTimeEmployee() {
                super();
    }

    public PartTimeEmployee(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee(int hoursPerWeek, String employerName, String dateHired) {
        super(employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public PartTimeEmployee(String name, int age, char gender,String employerName, String dateHired,int hoursPerWeek) {
        super( name, age, gender,employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString() {
        return super.toString() + "PartTimeEmployee{" + "hoursPerWeek=" + hoursPerWeek + '}';
    }

}
