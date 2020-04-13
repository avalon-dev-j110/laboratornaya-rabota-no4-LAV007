
package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class RealPerson implements Person{
    
    private String name;
    private Date data;
    private GregorianCalendar calendar;
    private SimpleDateFormat dateForm = null;
    
    public RealPerson(String name, int month, int day, int year){
        this.name = name;
        calendar = new GregorianCalendar(year, month - 1, day);
        dateForm = new SimpleDateFormat("dd MMMM");
        data = calendar.getTime();
        dateForm.format(data);        
    }
       
    public void setName(String n){
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
        if (this.name.length() == t.getName().length()) {
            return 0;
        } else if (name.length() < t.getName().length()) {
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
