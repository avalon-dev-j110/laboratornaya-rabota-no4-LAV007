/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 *
 * @author vbg47
 */
public class RealPerson implements Person{
    
    private String name = "Default";
    private Date data = new Date();
    
    public void setName(String n){  // <-- Почему не могу использовать этот метод в главном классе?
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return data;
    }

    @Override
    public int compareTo(Person t) {
        if (this.hashCode() == t.hashCode()) {
            return 0;
        } else if (this.hashCode() < t.hashCode()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "name of this person is " + getName() + "\n" + 
                "date of birth of this person is " + data;
    }    
}
