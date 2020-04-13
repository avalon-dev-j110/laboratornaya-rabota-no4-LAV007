/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Arrays;

/**
 *
 * @author vbg47
 */
public class RealSort implements Sort {

    @Override
    public void sort(Object[] str) {
         Arrays.sort(str);
    }

    @Override
    public void sort(Comparable[] person) {
        Arrays.sort(person);
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }
    
}
