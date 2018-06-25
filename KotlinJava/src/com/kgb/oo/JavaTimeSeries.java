package com.kgb.oo;

import java.util.*;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
public class JavaTimeSeries<T> {
    private final Map<Date, T> date2Data = new HashMap<>();

    public void add(T element) { date2Data.put(new Date(), element); }

    public T getLatest() {
        Iterator<T> iterator = date2Data.values().iterator();
        if (iterator.hasNext()) {
            throw new NoSuchElementException("TimeSeries is empty, does not have latest element.");
        } else {
            T last = iterator.next();
            while (iterator.hasNext()) {
                last = iterator.next();
            }
            return last;
        }
    }

    public void addAll(Collection<T> students) {
        for (T student : students) {
            add(student);
        }
    }

    public void addAllCovariant(Collection<? extends T> students) {
        for (T student : students) {
            add(student);
        }
    }
}
