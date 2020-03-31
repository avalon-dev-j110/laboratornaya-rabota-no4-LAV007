/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author vbg47
 */
public class RealPerson implements Person{
    
    private String name;
    private Date data;
    private GregorianCalendar calendar;
    
    public RealPerson(String name, int month, int day, int year){
        this.name = name;
        calendar = new GregorianCalendar(year, month - 1/*ДЛЯ СЕБЯ - минус один - потому что массив!!!*/, day);
        data = calendar.getTime();
    }
          /*Когда создаю с помощью цикла for новые объекты типа RealPerson, не могу использовать этот конструктор, т.к.:
          1.) не могу задать разные имена для разных объектов --- +++;
          2.) не понял как работать с классом Date --- разобрался*/ 
    
    public void setName(String n){  /* <-- Почему не могу использовать этот метод в главном классе? persons[0].setName("");
                                           Из-за того что implements, a не extends (Интерфейс, а не класс)?
                                           Проповал решить этот вопрос с помощью static метода вне метода main - не помогло
                                           ***!!!ОТВЕТ СМОТРИ В ТЛГ-КАНАЛЕ!!!***/
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
        return getName() + "\t" + "was born"  + "\t" + data;
    }    
}
