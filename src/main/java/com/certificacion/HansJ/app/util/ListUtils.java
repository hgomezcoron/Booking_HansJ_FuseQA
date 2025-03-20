package com.certificacion.HansJ.app.util;

import java.util.List;
import java.util.stream.IntStream;

public class ListUtils {
    public static boolean sorted(List<Double> list) {
        return IntStream.range(0, list.size() - 1)
                .allMatch(i -> list.get(i) <= list.get(i + 1));
    }
}