package com.kgb.oo;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
public class TimeSeriesMain {
    public static void main(String[] args) {
        JavaTimeSeries<Person> peopleData = new JavaTimeSeries<>();
        peopleData.add(new Person());
        peopleData.add(new Student());

        Collection<Student> students = Arrays.asList(new Student(), new Student());
        //this doesn't works in java
        //peopleData.addAll(students);
        peopleData.addAllCovariant(students);

        TimeSeries<Person> peopleDataKit = new TimeSeries<>();
        peopleDataKit.add(new Person());
        peopleDataKit.add(new Student());
        peopleDataKit.addAll(students);
    }
}
