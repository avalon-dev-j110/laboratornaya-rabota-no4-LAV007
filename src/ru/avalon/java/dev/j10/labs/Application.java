package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"Petya", "Mash", "Shaha", "Nikita", "Artem", "Vika", "Lera", "Marina", "Karina", "Ilya",
                                "Olesya", "Ira", "Polina", "Vasya", "Dima", "Nikolai", "Egor", "Oleg", "Dasha", "Pavel"};            
            
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
                        
	    Person[] persons = new RealPerson[strings.length];
            for (int i = 0; i < persons.length; i++){
                persons[i] = new RealPerson(strings[i], (int)(Math.random()*2020), (int)(Math.random()*13), (int)(Math.random()*29));
            }           
            
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        RealSort realSort = new RealSort();
        Sort sort = realSort;

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        RealComparator realComparator = new RealComparator();
        Comparator comparator = realComparator;

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        System.out.println("\n" + "-------Before sort-------");
        for (Person p: persons) System.out.println(p);
        sort.sort(persons);
        System.out.println("\n" + "-------After sort-------");
        for (Person p: persons) System.out.println(p);
        

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        System.out.println("\n" + "-------not sorted list-------");
        for (String s: strings) System.out.println(s);
        sort.sort(strings);
        System.out.println("\n" + "-------in ascending order-------");
        for (String z: strings) System.out.println(z);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */        
                
        System.out.println("\n" + "-------in descending order-------" +
                           "\n" + "        (with comparator)");
        sort.sort(strings, comparator);
        for (String x: strings) System.out.println(x);
        /*
        System.out.println("\n" + "-------in descending order-------" +
                           "\n" + "    (with lambda expression)");
        Arrays.sort(strings, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        for (String q: strings) System.out.println(q);
        */         
    }
   
}
