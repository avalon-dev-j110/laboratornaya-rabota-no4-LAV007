/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author vbg47
 */
public class RealComparator implements Comparator<String> {

    @Override
    public int compare(String t, String t1) {
        return t1.compareTo(t);
        //return Integer.compare(t1.hashCode(), t.hashCode());
    }
    
}
