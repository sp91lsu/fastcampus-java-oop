package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author dev.lsw91
 * @DateTime 2022-03-18 오후 9:22.
 */
public class JavaSort <T extends Comparable<T>>{

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }

}
