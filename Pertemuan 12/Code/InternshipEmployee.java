/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Polimorfisme.Percobaan;

/**
 *
 * @author USER
 */
public class InternshipEmployee extends Employee{
    
    private int length;
    
    public InternshipEmployee(String name, int length){
        this.name = name;
        this.length = length;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered As InternshipEmployee For " + length + "Month /s \n";
        return info;
    }
}
