package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream().reduce((integer, integer2) -> integer+=integer2).map(ave -> (double) ave / arrayList.size()).get();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(Integer::max).orElse(0);
    }

    public int getLastOdd() {
        return arrayList.stream().filter(integer -> integer % 2 != 0).reduce((integer, integer2) -> integer2).orElse(0);
    }
}
