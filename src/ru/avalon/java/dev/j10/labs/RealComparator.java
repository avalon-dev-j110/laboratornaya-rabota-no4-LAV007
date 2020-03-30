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
public class RealComparator implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        return Integer.compare(t1.hashCode(), t.hashCode());
    }
    
}
