package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dev.lsw91
 * @DateTime 2022-03-18 오후 9:10.
 */
public class BubbleSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for (int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }

}
