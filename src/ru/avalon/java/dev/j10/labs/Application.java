package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
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
                //int x = (int)(Math.random()*20);
                switch(i) {
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
	    Person[] persons = new RealPerson[20];
            for (int i = 0; i < persons.length; i++){
                persons[i] = new RealPerson();
            }
            //persons[0].setName("");
            
            System.out.println(persons[1]);
            

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new RealSort();

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
        Comparator comparator = new RealComparator();

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
        sort.sort(persons);

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
        System.out.println("\n" + "-------in descending order-------");
        Arrays.sort(strings, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        for (String q: strings) System.out.println(q);
        
        System.out.println("\n" + "компаратор");
        sort.sort(strings, comparator);
        for (String x: strings) System.out.println(x);
    }
}
/*
вопрос: как отсортировать массив, используя sort.sort(strings, comparator)?
В созданном классе RealComparator (который по заданию создаем сами) - указываю return Integer.compare(t.hashCode(), t1.hashCode()) для переопределения метода класса Comparator. Подозреваю, что hashCode тут не к месту, т.к. с
*/
