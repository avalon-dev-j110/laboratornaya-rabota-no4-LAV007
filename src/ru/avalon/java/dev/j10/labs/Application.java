package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = new String[20];
            for (int i = 0; i < strings.length; i++){
                int x = (int)(Math.random()*20);
                switch(x) {
                    case 0: strings[i] = "01 - q";
                    break;
                    case 1: strings[i] = "02 - qq";
                    break;
                    case 2: strings[i] = "03 - qqq";
                    break;
                    case 3: strings[i] = "04 - qqqq";
                    break;
                    case 4: strings[i] = "05 - qqqqq";
                    break;
                    case 5: strings[i] = "06 - qqqqqq";
                    break;
                    case 6: strings[i] = "07 - qqqqqqq";
                    break;
                    case 7: strings[i] = "08 - qqqqqqqq";
                    break;
                    case 8: strings[i] = "09 - qqqqqqqqq";
                    break;
                    case 9: strings[i] = "10 - qqqqqqqqqq";
                    break;
                    case 10: strings[i] = "11 - qqqqqqqqqqq";
                    break;
                    case 11: strings[i] = "12 - qqqqqqqqqqqq";
                    break;
                    case 12: strings[i] = "13 - qqqqqqqqqqqqq";
                    break;
                    case 13: strings[i] = "14 - qqqqqqqqqqqqqq";
                    break;
                    case 14: strings[i] = "15 - qqqqqqqqqqqqqq";
                    break;
                    case 15: strings[i] = "16 - qqqqqqqqqqqqqqqq";
                    break;
                    case 16: strings[i] = "17 - qqqqqqqqqqqqqqqqq";
                    break;
                    case 17: strings[i] = "18 - qqqqqqqqqqqqqqqqqq";
                    break;
                    case 18: strings[i] = "19 - qqqqqqqqqqqqqqqqqq";
                    break;
                    case 19: strings[i] = "20 - qqqqqqqqqqqqqqqqqqqq";
                    break;            
                }
            }            
            
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
            
            String[] names = {"Dasha", "Dima", "Lera"};      
            
	    Person[] persons = new RealPerson[names.length];
            for (int i = 0; i < persons.length; i++){
                persons[i] = new RealPerson(names[i], (int)Math.random(), (int)Math.random(), (int)Math.random());
            }           
            
            /*RealPerson p1 = new RealPerson("Mash", 2020,  Calendar.MARCH, 31);   
            RealPerson p2 = new RealPerson();        
            RealPerson p3 = new RealPerson();   
            RealPerson p4 = new RealPerson();   
            RealPerson p5 = new RealPerson();   
            RealPerson p6 = new RealPerson();   
            RealPerson p7 = new RealPerson();   
            RealPerson p8 = new RealPerson();   
            RealPerson p9 = new RealPerson();   
            RealPerson p10 = new RealPerson();  
            RealPerson p11 = new RealPerson();  
            RealPerson p12 = new RealPerson();  
            RealPerson p13 = new RealPerson();  
            RealPerson p14 = new RealPerson();  
            RealPerson p15 = new RealPerson();  
            RealPerson p16 = new RealPerson();  
            RealPerson p17 = new RealPerson();  
            RealPerson p18 = new RealPerson();  
            RealPerson p19 = new RealPerson();  
            RealPerson p20 = new RealPerson(); */ 
            
            /*
            persons[0] = p1;
            persons[1] = p2;
            persons[2] = p3;
            persons[2] = p3;
            persons[3] = p4;
            persons[4] = p5;
            persons[5] = p6;
            persons[6] = p7;
            persons[7] = p8;
            persons[8] = p9;
            persons[9] = p10;
            persons[10] = p11;
            persons[11] = p12;
            persons[12] = p13;
            persons[13] = p14;
            persons[14] = p15;
            persons[15] = p16;
            persons[16] = p17;
            persons[17] = p18;
            persons[18] = p19;  
            persons[19] = p20;*/
            
            /*((RealPerson)persons[0]).setName("Petya");
            ((RealPerson)persons[1]).setName("Mash");
            ((RealPerson)persons[2]).setName("Shaha");
            ((RealPerson)persons[3]).setName("Alex");
            ((RealPerson)persons[4]).setName("Nikita");
            ((RealPerson)persons[5]).setName("Artem");
            ((RealPerson)persons[6]).setName("Vika");
            ((RealPerson)persons[7]).setName("Lera");
            ((RealPerson)persons[8]).setName("Lena");
            ((RealPerson)persons[9]).setName("Olyz");
            ((RealPerson)persons[10]).setName("Marina");
            ((RealPerson)persons[11]).setName("Karina");
            ((RealPerson)persons[12]).setName("Olesya");
            ((RealPerson)persons[13]).setName("Ira");
            ((RealPerson)persons[14]).setName("Polina");
            ((RealPerson)persons[15]).setName("Vasya");
            ((RealPerson)persons[16]).setName("Dima");
            ((RealPerson)persons[17]).setName("Oleg");
            ((RealPerson)persons[18]).setName("Egor");
            ((RealPerson)persons[19]).setName("Nikolai");*/
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
        
        System.out.println("\n" + "-------in descending order-------" +
                           "\n" + "    (with lambda expression)");
        Arrays.sort(strings, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        for (String q: strings) System.out.println(q);
        /*
        вопрос: как отсортировать массив, используя sort.sort(strings, comparator)?
        В классе RealComparator (который по заданию создаем сами) -
        указываю return Integer.compare(t.hashCode(), t1.hashCode()) для переопределения метода класса Comparator.
        Подозреваю, что hashCode тут не к месту (нет понимания что такое hashCode).
        */
    }
    /*public static void set(Person p){
        p.s
    }*/
}
